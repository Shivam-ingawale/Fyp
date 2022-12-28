// Generated by view binder compiler. Do not edit!
package com.lasteyestudios.fyp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.lasteyestudios.fyp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCalculatorBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button calButton;

  @NonNull
  public final TextView ipoAlertText;

  @NonNull
  public final Guideline leftEditGuide;

  @NonNull
  public final Guideline leftTextGuide;

  @NonNull
  public final Guideline leftTitleTextGuide;

  @NonNull
  public final ConstraintLayout logo;

  @NonNull
  public final LottieAnimationView logoImage;

  @NonNull
  public final TextView medicineName;

  @NonNull
  public final TextView resultText;

  @NonNull
  public final Guideline rightEditGuide;

  @NonNull
  public final EditText weightEditText;

  @NonNull
  public final TextView weightText;

  @NonNull
  public final Spinner weightUnitEditText;

  @NonNull
  public final TextView weightUnitText;

  private FragmentCalculatorBinding(@NonNull ConstraintLayout rootView, @NonNull Button calButton,
      @NonNull TextView ipoAlertText, @NonNull Guideline leftEditGuide,
      @NonNull Guideline leftTextGuide, @NonNull Guideline leftTitleTextGuide,
      @NonNull ConstraintLayout logo, @NonNull LottieAnimationView logoImage,
      @NonNull TextView medicineName, @NonNull TextView resultText,
      @NonNull Guideline rightEditGuide, @NonNull EditText weightEditText,
      @NonNull TextView weightText, @NonNull Spinner weightUnitEditText,
      @NonNull TextView weightUnitText) {
    this.rootView = rootView;
    this.calButton = calButton;
    this.ipoAlertText = ipoAlertText;
    this.leftEditGuide = leftEditGuide;
    this.leftTextGuide = leftTextGuide;
    this.leftTitleTextGuide = leftTitleTextGuide;
    this.logo = logo;
    this.logoImage = logoImage;
    this.medicineName = medicineName;
    this.resultText = resultText;
    this.rightEditGuide = rightEditGuide;
    this.weightEditText = weightEditText;
    this.weightText = weightText;
    this.weightUnitEditText = weightUnitEditText;
    this.weightUnitText = weightUnitText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCalculatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_calculator, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCalculatorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cal_button;
      Button calButton = ViewBindings.findChildViewById(rootView, id);
      if (calButton == null) {
        break missingId;
      }

      id = R.id.ipo_alert_text;
      TextView ipoAlertText = ViewBindings.findChildViewById(rootView, id);
      if (ipoAlertText == null) {
        break missingId;
      }

      id = R.id.left_edit_guide;
      Guideline leftEditGuide = ViewBindings.findChildViewById(rootView, id);
      if (leftEditGuide == null) {
        break missingId;
      }

      id = R.id.left_text_guide;
      Guideline leftTextGuide = ViewBindings.findChildViewById(rootView, id);
      if (leftTextGuide == null) {
        break missingId;
      }

      id = R.id.left_title_text_guide;
      Guideline leftTitleTextGuide = ViewBindings.findChildViewById(rootView, id);
      if (leftTitleTextGuide == null) {
        break missingId;
      }

      id = R.id.logo;
      ConstraintLayout logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.logo_image;
      LottieAnimationView logoImage = ViewBindings.findChildViewById(rootView, id);
      if (logoImage == null) {
        break missingId;
      }

      id = R.id.medicine_name;
      TextView medicineName = ViewBindings.findChildViewById(rootView, id);
      if (medicineName == null) {
        break missingId;
      }

      id = R.id.result_text;
      TextView resultText = ViewBindings.findChildViewById(rootView, id);
      if (resultText == null) {
        break missingId;
      }

      id = R.id.right_edit_guide;
      Guideline rightEditGuide = ViewBindings.findChildViewById(rootView, id);
      if (rightEditGuide == null) {
        break missingId;
      }

      id = R.id.weight_edit_text;
      EditText weightEditText = ViewBindings.findChildViewById(rootView, id);
      if (weightEditText == null) {
        break missingId;
      }

      id = R.id.weight_text;
      TextView weightText = ViewBindings.findChildViewById(rootView, id);
      if (weightText == null) {
        break missingId;
      }

      id = R.id.weight_unit_edit_text;
      Spinner weightUnitEditText = ViewBindings.findChildViewById(rootView, id);
      if (weightUnitEditText == null) {
        break missingId;
      }

      id = R.id.weight_unit_text;
      TextView weightUnitText = ViewBindings.findChildViewById(rootView, id);
      if (weightUnitText == null) {
        break missingId;
      }

      return new FragmentCalculatorBinding((ConstraintLayout) rootView, calButton, ipoAlertText,
          leftEditGuide, leftTextGuide, leftTitleTextGuide, logo, logoImage, medicineName,
          resultText, rightEditGuide, weightEditText, weightText, weightUnitEditText,
          weightUnitText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}