// Generated by view binder compiler. Do not edit!
package com.crow.module_discovery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.crow.module_discovery.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class DiscoveryFragmentBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  private DiscoveryFragmentBinding(@NonNull NestedScrollView rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static DiscoveryFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DiscoveryFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.discovery_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DiscoveryFragmentBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new DiscoveryFragmentBinding((NestedScrollView) rootView);
  }
}
