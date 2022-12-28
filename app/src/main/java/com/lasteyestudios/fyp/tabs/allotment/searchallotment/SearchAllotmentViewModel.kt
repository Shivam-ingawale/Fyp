package com.lasteyestudios.fyp.tabs.allotment.searchallotment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lasteyestudios.fyp.data.models.Response
import com.lasteyestudios.fyp.data.models.searchallotmentresultmodel.SearchAllotmentResultModel
import com.lasteyestudios.fyp.repository.NetworkRepository
import com.lasteyestudios.fyp.utils.IPO_LOG_TAG
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class SearchAllotmentViewModel: ViewModel() {
    private val _searchAllotmentIPOs = MutableLiveData<Response<SearchAllotmentResultModel?>?>()
    val searchAllotmentIPOs: LiveData<Response<SearchAllotmentResultModel?>?> get() = _searchAllotmentIPOs

    private val networkRepository = NetworkRepository.getInstance()

    fun loadAllotmentIPOData(companyId: String, userDoc: String, keyWord: String) {
        Log.d(IPO_LOG_TAG, "loadHomeIPOData called")

        viewModelScope.launch {
            networkRepository.getSearchAllotmentsResults(companyId = companyId,
                userDoc = userDoc,
                keyWord = keyWord).catch { exception ->
                Log.d(IPO_LOG_TAG,
                    "error received while updating explore live data" + exception.stackTraceToString())
                _searchAllotmentIPOs.postValue(Response.Error)
            }.collect { exploreResponse ->
                _searchAllotmentIPOs.postValue(exploreResponse)

            }
        }
    }
    fun clearData(){
        _searchAllotmentIPOs.postValue(null)
    }



}