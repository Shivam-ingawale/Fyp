// Generated by view binder compiler. Do not edit!
package com.lasteyestudios.fyp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.lasteyestudios.fyp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentIpoDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView companyName;

  @NonNull
  public final TextView companyOfficialName;

  @NonNull
  public final DetailsAboutCompanyBinding detailsAboutCompany;

  @NonNull
  public final DetailsBannerBinding detailsBanner;

  @NonNull
  public final DetailsFinancialsBinding detailsFinancials;

  @NonNull
  public final DetailsImportantDatesBinding detailsImportantDates;

  @NonNull
  public final DetailsIpoDetailsBinding detailsIpoDetails;

  @NonNull
  public final DetailsListingBinding detailsListing;

  @NonNull
  public final DetailsSubscriptionRateBinding detailsSubscriptionRate;

  @NonNull
  public final CardView loadingAnimationCard;

  @NonNull
  public final ImageView logoImage;

  @NonNull
  public final CardView logoImageCard;

  @NonNull
  public final ExtendedFloatingActionButton retryAllotmentFab;

  @NonNull
  public final ImageButton wishlistHeart;

  private FragmentIpoDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView companyName, @NonNull TextView companyOfficialName,
      @NonNull DetailsAboutCompanyBinding detailsAboutCompany,
      @NonNull DetailsBannerBinding detailsBanner,
      @NonNull DetailsFinancialsBinding detailsFinancials,
      @NonNull DetailsImportantDatesBinding detailsImportantDates,
      @NonNull DetailsIpoDetailsBinding detailsIpoDetails,
      @NonNull DetailsListingBinding detailsListing,
      @NonNull DetailsSubscriptionRateBinding detailsSubscriptionRate,
      @NonNull CardView loadingAnimationCard, @NonNull ImageView logoImage,
      @NonNull CardView logoImageCard, @NonNull ExtendedFloatingActionButton retryAllotmentFab,
      @NonNull ImageButton wishlistHeart) {
    this.rootView = rootView;
    this.companyName = companyName;
    this.companyOfficialName = companyOfficialName;
    this.detailsAboutCompany = detailsAboutCompany;
    this.detailsBanner = detailsBanner;
    this.detailsFinancials = detailsFinancials;
    this.detailsImportantDates = detailsImportantDates;
    this.detailsIpoDetails = detailsIpoDetails;
    this.detailsListing = detailsListing;
    this.detailsSubscriptionRate = detailsSubscriptionRate;
    this.loadingAnimationCard = loadingAnimationCard;
    this.logoImage = logoImage;
    this.logoImageCard = logoImageCard;
    this.retryAllotmentFab = retryAllotmentFab;
    this.wishlistHeart = wishlistHeart;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentIpoDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentIpoDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ipo_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentIpoDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.company_name;
      TextView companyName = ViewBindings.findChildViewById(rootView, id);
      if (companyName == null) {
        break missingId;
      }

      id = R.id.company_official_name;
      TextView companyOfficialName = ViewBindings.findChildViewById(rootView, id);
      if (companyOfficialName == null) {
        break missingId;
      }

      id = R.id.details_about_company;
      View detailsAboutCompany = ViewBindings.findChildViewById(rootView, id);
      if (detailsAboutCompany == null) {
        break missingId;
      }
      DetailsAboutCompanyBinding binding_detailsAboutCompany = DetailsAboutCompanyBinding.bind(detailsAboutCompany);

      id = R.id.details_banner;
      View detailsBanner = ViewBindings.findChildViewById(rootView, id);
      if (detailsBanner == null) {
        break missingId;
      }
      DetailsBannerBinding binding_detailsBanner = DetailsBannerBinding.bind(detailsBanner);

      id = R.id.details_financials;
      View detailsFinancials = ViewBindings.findChildViewById(rootView, id);
      if (detailsFinancials == null) {
        break missingId;
      }
      DetailsFinancialsBinding binding_detailsFinancials = DetailsFinancialsBinding.bind(detailsFinancials);

      id = R.id.details_important_dates;
      View detailsImportantDates = ViewBindings.findChildViewById(rootView, id);
      if (detailsImportantDates == null) {
        break missingId;
      }
      DetailsImportantDatesBinding binding_detailsImportantDates = DetailsImportantDatesBinding.bind(detailsImportantDates);

      id = R.id.details_ipo_details;
      View detailsIpoDetails = ViewBindings.findChildViewById(rootView, id);
      if (detailsIpoDetails == null) {
        break missingId;
      }
      DetailsIpoDetailsBinding binding_detailsIpoDetails = DetailsIpoDetailsBinding.bind(detailsIpoDetails);

      id = R.id.details_listing;
      View detailsListing = ViewBindings.findChildViewById(rootView, id);
      if (detailsListing == null) {
        break missingId;
      }
      DetailsListingBinding binding_detailsListing = DetailsListingBinding.bind(detailsListing);

      id = R.id.details_subscription_rate;
      View detailsSubscriptionRate = ViewBindings.findChildViewById(rootView, id);
      if (detailsSubscriptionRate == null) {
        break missingId;
      }
      DetailsSubscriptionRateBinding binding_detailsSubscriptionRate = DetailsSubscriptionRateBinding.bind(detailsSubscriptionRate);

      id = R.id.loading_animation_card;
      CardView loadingAnimationCard = ViewBindings.findChildViewById(rootView, id);
      if (loadingAnimationCard == null) {
        break missingId;
      }

      id = R.id.logo_image;
      ImageView logoImage = ViewBindings.findChildViewById(rootView, id);
      if (logoImage == null) {
        break missingId;
      }

      id = R.id.logo_image_card;
      CardView logoImageCard = ViewBindings.findChildViewById(rootView, id);
      if (logoImageCard == null) {
        break missingId;
      }

      id = R.id.retry_allotment_fab;
      ExtendedFloatingActionButton retryAllotmentFab = ViewBindings.findChildViewById(rootView, id);
      if (retryAllotmentFab == null) {
        break missingId;
      }

      id = R.id.wishlist_heart;
      ImageButton wishlistHeart = ViewBindings.findChildViewById(rootView, id);
      if (wishlistHeart == null) {
        break missingId;
      }

      return new FragmentIpoDetailsBinding((ConstraintLayout) rootView, companyName,
          companyOfficialName, binding_detailsAboutCompany, binding_detailsBanner,
          binding_detailsFinancials, binding_detailsImportantDates, binding_detailsIpoDetails,
          binding_detailsListing, binding_detailsSubscriptionRate, loadingAnimationCard, logoImage,
          logoImageCard, retryAllotmentFab, wishlistHeart);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}