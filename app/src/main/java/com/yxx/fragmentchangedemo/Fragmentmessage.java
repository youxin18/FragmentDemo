package com.yxx.fragmentchangedemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Fragmentmessage extends Fragment{
    private List<message> messageList=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_message,container,false);
        initmessage();
        RecyclerView recyclerView=view.findViewById(R.id.recyclerview);
        MainActivity activity=(MainActivity)getActivity();
        LinearLayoutManager layoutManager=new LinearLayoutManager(activity);
        recyclerView.setLayoutManager(layoutManager);
        Adapter adapter=new Adapter(messageList);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void initmessage(){
        for (int i=0;i<3;i++){
            message message1=new message(R.drawable.chaiquan2,"张三");
            messageList.add(message1);
            message message2=new message(R.drawable.chaiquan3,"李四");
            messageList.add(message2);
            message message3=new message(R.drawable.cat,"王五");
            messageList.add(message3);
        }
    }
}