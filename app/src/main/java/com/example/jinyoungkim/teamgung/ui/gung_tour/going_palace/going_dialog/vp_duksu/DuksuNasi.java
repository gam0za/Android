package com.example.jinyoungkim.teamgung.ui.gung_tour.going_palace.going_dialog.vp_duksu;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jinyoungkim.teamgung.R;

public class DuksuNasi extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vpitem_duksu_nasi, container, false);
        return view;
    }
}