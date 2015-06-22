package com.ceosilvajr.app.simpleloginscreen.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ceosilvajr.app.simpleloginscreen.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class RegistrationActivityFragment extends Fragment {

    public RegistrationActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_registration, container, false);
    }
}
