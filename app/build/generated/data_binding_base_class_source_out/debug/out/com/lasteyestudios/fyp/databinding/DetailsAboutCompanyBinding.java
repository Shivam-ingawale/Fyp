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

public final class DetailsAboutCompanyBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView aboutCompanyCard;

  @NonNull
  public final TextView aboutCompanyDescription;

  @NonNull
  public final TextView aboutCompanyText;

  @NonNull
  public final TextView founded;

  @NonNull
  public final TextView foundedText;

  @NonNull
  public final Guideline guideline5;

  @NonNull
  public final TextView managingDirector;

  @NonNull
  public final TextView managingDirectorText;

  @NonNull
  public final TextView parentOrganisation;

  @NonNull
  public final TextView parentOrganisationText;

  private DetailsAboutCompanyBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView aboutCompanyCard, @NonNull TextView aboutCompanyDescription,
      @NonNull TextView aboutCompanyText, @NonNull TextView founded, @NonNull TextView foundedText,
      @NonNull Guideline guideline5, @NonNull TextView managingDirector,
      @NonNull TextView managingDirectorText, @NonNull TextView parentOrganisation,
      @NonNull TextView parentOrganisationText) {
    this.rootView = rootView;
    this.aboutCompanyCard = aboutCompanyCard;
    this.aboutCompanyDescription = aboutCompanyDescription;
    this.aboutCompanyText = aboutCompanyText;
    this.founded = founded;
    this.foundedText = foundedText;
    this.guideline5 = guideline5;
    this.managingDirector = managingDirector;
    this.managingDirectorText = managingDirectorText;
    this.parentOrganisation = parentOrganisation;
    this.parentOrganisationText = parentOrganisationText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DetailsAboutCompanyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DetailsAboutCompanyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.details_about_company, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DetailsAboutCompanyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.about_company_card;
      CardView aboutCompanyCard = ViewBindings.findChildViewById(rootView, id);
      if (aboutCompanyCard == null) {
        break missingId;
      }

      id = R.id.about_company_description;
      TextView aboutCompanyDescription = ViewBindings.findChildViewById(rootView, id);
      if (aboutCompanyDescription == null) {
        break missingId;
      }

      id = R.id.about_company_text;
      TextView aboutCompanyText = ViewBindings.findChildViewById(rootView, id);
      if (aboutCompanyText == null) {
        break missingId;
      }

      id = R.id.founded;
      TextView founded = ViewBindings.findChildViewById(rootView, id);
      if (founded == null) {
        break missingId;
      }

      id = R.id.founded_text;
      TextView foundedText = ViewBindings.findChildViewById(rootView, id);
      if (foundedText == null) {
        break missingId;
      }

      id = R.id.guideline5;
      Guideline guideline5 = ViewBindings.findChildViewById(rootView, id);
      if (guideline5 == null) {
        break missingId;
      }

      id = R.id.managing_director;
      TextView managingDirector = ViewBindings.findChildViewById(rootView, id);
      if (managingDirector == null) {
        break missingId;
      }

      id = R.id.managing_director_text;
      TextView managingDirectorText = ViewBindings.findChildViewById(rootView, id);
      if (managingDirectorText == null) {
        break missingId;
      }

      id = R.id.parent_organisation;
      TextView parentOrganisation = ViewBindings.findChildViewById(rootView, id);
      if (parentOrganisation == null) {
        break missingId;
      }

      id = R.id.parent_organisation_text;
      TextView parentOrganisationText = ViewBindings.findChildViewById(rootView, id);
      if (parentOrganisationText == null) {
        break missingId;
      }

      return new DetailsAboutCompanyBinding((ConstraintLayout) rootView, aboutCompanyCard,
          aboutCompanyDescription, aboutCompanyText, founded, foundedText, guideline5,
          managingDirector, managingDirectorText, parentOrganisation, parentOrganisationText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
