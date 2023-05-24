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

public class HomeActivity extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);

        // 재활용 카테고리 선택으로 넘어가는 버튼이랑 연결
        Button recyclecategoryBtn = view.findViewById(R.id.reuse_button);
        recyclecategoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),recycCategoryActivity.class);
                startActivity(intent);
            }
        });

        Button rebrandbtn = view.findViewById(R.id.rebrand_button);
        rebrandbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(),ReBrandActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }
}