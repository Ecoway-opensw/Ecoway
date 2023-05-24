package com.cookandroid.ecoway;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CompaignActivity extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.compaign, container, false);

        Button cambrand = view.findViewById(R.id.cambrand_button);
        cambrand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SelCamActivity.class);
                getActivity().startActivity(intent);
            }
        });

        Button selcambtn = view.findViewById(R.id.campaign_button);
        selcambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CamBrandActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return view;
    }
}
