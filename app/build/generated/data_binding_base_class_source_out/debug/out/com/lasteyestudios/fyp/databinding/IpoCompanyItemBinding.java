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
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lasteyestudios.fyp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class IpoCompanyItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView companyName;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final CardView ipoCard;

  @NonNull
  public final TextView issueSize;

  @NonNull
  public final TextView issueSizeText;

  @NonNull
  public final ImageView logoImage;

  @NonNull
  public final CardView logoImageCard;

  @NonNull
  public final TextView minimumPrice;

  @NonNull
  public final TextView minimumPriceText;

  @NonNull
  public final TextView offerDate;

  @NonNull
  public final TextView offerDateText;

  @NonNull
  public final TextView priceRange;

  @NonNull
  public final TextView priceRangeText;

  @NonNull
  public final ImageButton wishlistHeart;

  private IpoCompanyItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView companyName,
      @NonNull Guideline guideline3, @NonNull CardView ipoCard, @NonNull TextView issueSize,
      @NonNull TextView issueSizeText, @NonNull ImageView logoImage,
      @NonNull CardView logoImageCard, @NonNull TextView minimumPrice,
      @NonNull TextView minimumPriceText, @NonNull TextView offerDate,
      @NonNull TextView offerDateText, @NonNull TextView priceRange,
      @NonNull TextView priceRangeText, @NonNull ImageButton wishlistHeart) {
    this.rootView = rootView;
    this.companyName = companyName;
    this.guideline3 = guideline3;
    this.ipoCard = ipoCard;
    this.issueSize = issueSize;
    this.issueSizeText = issueSizeText;
    this.logoImage = logoImage;
    this.logoImageCard = logoImageCard;
    this.minimumPrice = minimumPrice;
    this.minimumPriceText = minimumPriceText;
    this.offerDate = offerDate;
    this.offerDateText = offerDateText;
    this.priceRange = priceRange;
    this.priceRangeText = priceRangeText;
    this.wishlistHeart = wishlistHeart;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static IpoCompanyItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static IpoCompanyItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ipo_company_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static IpoCompanyItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.company_name;
      TextView companyName = ViewBindings.findChildViewById(rootView, id);
      if (companyName == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = ViewBindings.findChildViewById(rootView, id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.ipo_card;
      CardView ipoCard = ViewBindings.findChildViewById(rootView, id);
      if (ipoCard == null) {
        break missingId;
      }

      id = R.id.issue_size;
      TextView issueSize = ViewBindings.findChildViewById(rootView, id);
      if (issueSize == null) {
        break missingId;
      }

      id = R.id.issue_size_text;
      TextView issueSizeText = ViewBindings.findChildViewById(rootView, id);
      if (issueSizeText == null) {
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

      id = R.id.minimum_price;
      TextView minimumPrice = ViewBindings.findChildViewById(rootView, id);
      if (minimumPrice == null) {
        break missingId;
      }

      id = R.id.minimum_price_text;
      TextView minimumPriceText = ViewBindings.findChildViewById(rootView, id);
      if (minimumPriceText == null) {
        break missingId;
      }

      id = R.id.offer_date;
      TextView offerDate = ViewBindings.findChildViewById(rootView, id);
      if (offerDate == null) {
        break missingId;
      }

      id = R.id.offer_date_text;
      TextView offerDateText = ViewBindings.findChildViewById(rootView, id);
      if (offerDateText == null) {
        break missingId;
      }

      id = R.id.price_range;
      TextView priceRange = ViewBindings.findChildViewById(rootView, id);
      if (priceRange == null) {
        break missingId;
      }

      id = R.id.price_range_text;
      TextView priceRangeText = ViewBindings.findChildViewById(rootView, id);
      if (priceRangeText == null) {
        break missingId;
      }

      id = R.id.wishlist_heart;
      ImageButton wishlistHeart = ViewBindings.findChildViewById(rootView, id);
      if (wishlistHeart == null) {
        break missingId;
      }

      return new IpoCompanyItemBinding((ConstraintLayout) rootView, companyName, guideline3,
          ipoCard, issueSize, issueSizeText, logoImage, logoImageCard, minimumPrice,
          minimumPriceText, offerDate, offerDateText, priceRange, priceRangeText, wishlistHeart);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}