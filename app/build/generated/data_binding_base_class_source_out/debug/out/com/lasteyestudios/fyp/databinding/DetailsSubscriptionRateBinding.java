// Generated by view binder compiler. Do not edit!
package com.lasteyestudios.fyp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class DetailsSubscriptionRateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final TextView nonInstitutionalInvestor;

  @NonNull
  public final TextView nonInstitutionalInvestorText;

  @NonNull
  public final TextView qualifiedInstitutionalBuyers;

  @NonNull
  public final TextView qualifiedInstitutionalBuyersText;

  @NonNull
  public final TextView retailIndividualInvestor;

  @NonNull
  public final TextView retailIndividualInvestorText;

  @NonNull
  public final CardView subscriptionRateCard;

  @NonNull
  public final TextView subscriptionRateText;

  private DetailsSubscriptionRateBinding(@NonNull ConstraintLayout rootView,
      @NonNull Guideline guideline3, @NonNull TextView nonInstitutionalInvestor,
      @NonNull TextView nonInstitutionalInvestorText,
      @NonNull TextView qualifiedInstitutionalBuyers,
      @NonNull TextView qualifiedInstitutionalBuyersText,
      @NonNull TextView retailIndividualInvestor, @NonNull TextView retailIndividualInvestorText,
      @NonNull CardView subscriptionRateCard, @NonNull TextView subscriptionRateText) {
    this.rootView = rootView;
    this.guideline3 = guideline3;
    this.nonInstitutionalInvestor = nonInstitutionalInvestor;
    this.nonInstitutionalInvestorText = nonInstitutionalInvestorText;
    this.qualifiedInstitutionalBuyers = qualifiedInstitutionalBuyers;
    this.qualifiedInstitutionalBuyersText = qualifiedInstitutionalBuyersText;
    this.retailIndividualInvestor = retailIndividualInvestor;
    this.retailIndividualInvestorText = retailIndividualInvestorText;
    this.subscriptionRateCard = subscriptionRateCard;
    this.subscriptionRateText = subscriptionRateText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DetailsSubscriptionRateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DetailsSubscriptionRateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.details_subscription_rate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DetailsSubscriptionRateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline3;
      Guideline guideline3 = ViewBindings.findChildViewById(rootView, id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.non_institutional_investor;
      TextView nonInstitutionalInvestor = ViewBindings.findChildViewById(rootView, id);
      if (nonInstitutionalInvestor == null) {
        break missingId;
      }

      id = R.id.non_institutional_investor_text;
      TextView nonInstitutionalInvestorText = ViewBindings.findChildViewById(rootView, id);
      if (nonInstitutionalInvestorText == null) {
        break missingId;
      }

      id = R.id.qualified_institutional_buyers;
      TextView qualifiedInstitutionalBuyers = ViewBindings.findChildViewById(rootView, id);
      if (qualifiedInstitutionalBuyers == null) {
        break missingId;
      }

      id = R.id.qualified_institutional_buyers_text;
      TextView qualifiedInstitutionalBuyersText = ViewBindings.findChildViewById(rootView, id);
      if (qualifiedInstitutionalBuyersText == null) {
        break missingId;
      }

      id = R.id.retail_individual_investor;
      TextView retailIndividualInvestor = ViewBindings.findChildViewById(rootView, id);
      if (retailIndividualInvestor == null) {
        break missingId;
      }

      id = R.id.retail_individual_investor_text;
      TextView retailIndividualInvestorText = ViewBindings.findChildViewById(rootView, id);
      if (retailIndividualInvestorText == null) {
        break missingId;
      }

      id = R.id.subscription_rate_card;
      CardView subscriptionRateCard = ViewBindings.findChildViewById(rootView, id);
      if (subscriptionRateCard == null) {
        break missingId;
      }

      id = R.id.subscription_rate_text;
      TextView subscriptionRateText = ViewBindings.findChildViewById(rootView, id);
      if (subscriptionRateText == null) {
        break missingId;
      }

      return new DetailsSubscriptionRateBinding((ConstraintLayout) rootView, guideline3,
          nonInstitutionalInvestor, nonInstitutionalInvestorText, qualifiedInstitutionalBuyers,
          qualifiedInstitutionalBuyersText, retailIndividualInvestor, retailIndividualInvestorText,
          subscriptionRateCard, subscriptionRateText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
