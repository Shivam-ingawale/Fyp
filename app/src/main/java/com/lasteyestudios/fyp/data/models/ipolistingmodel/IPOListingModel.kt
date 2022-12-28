package com.lasteyestudios.fyp.data.models.ipolistingmodel

data class IPOListingModel(
    val ACTIVE: List<Company>,
    val CLOSED: List<Company>,
    val LISTED: List<Company>,
    val UPCOMING: List<Company>
)