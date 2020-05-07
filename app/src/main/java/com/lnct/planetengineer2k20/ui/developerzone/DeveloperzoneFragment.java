package com.lnct.planetengineer2k20.ui.developerzone;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lnct.planetengineer2k20.R;

public class DeveloperzoneFragment extends Fragment {

    private DeveloperzoneViewModel mViewModel;

    public static DeveloperzoneFragment newInstance() {
        return new DeveloperzoneFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.developerzone_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(DeveloperzoneViewModel.class);
        // TODO: Use the ViewModel
    }

}
