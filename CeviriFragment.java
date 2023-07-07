package com.example.currencyapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CeviriFragment extends Fragment {

    private View rootView;
    private View activityMainLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // fragment_ceviri.xml layoutunu inflate edin
        rootView = inflater.inflate(R.layout.fragment_ceviri, container, false);

        // Diğer layoutları gizlemek için gerekli kodları ekleyin
        activityMainLayout = getActivity().findViewById(R.id.activity_main_layout);
        activityMainLayout.setVisibility(View.GONE);

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        // Fragment kapatıldığında diğer layoutları tekrar göstermek için gerekli kodları ekleyin
        activityMainLayout.setVisibility(View.VISIBLE);
    }

    // Diğer metodları ve işlemleri burada devam ettirin
    // ...
}
