package com.yxx.fragmentchangedemo;

import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<message> messageList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        message message=messageList.get(position);
        holder.imageView.setImageResource(message.getImageViewid());
        holder.title.setText(message.getTitle());

    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title;
        public ViewHolder(View view){
            super(view);
            imageView=view.findViewById(R.id.icon);
            title=view.findViewById(R.id.text);
        }
    }
    public Adapter(List<message>messages){
        messageList=messages;
    }

}
