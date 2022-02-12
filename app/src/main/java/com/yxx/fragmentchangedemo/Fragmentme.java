package com.yxx.fragmentchangedemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Fragmentme extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_me, container, false);
        RelativeLayout pay=view.findViewById(R.id.pay_way);
        Context context=(MainActivity)getActivity();
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"你点击了支付",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context,ToPayActivity.class);
                intent.putExtra("userID","YXX");
                startActivity(intent);
            }
        });
        return view;

    }
}