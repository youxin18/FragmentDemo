package com.yxx.fragmentchangedemo;

import android.widget.ImageView;

public class message {
    private int imageViewid;
    private String title;

    public message(int imageView, String title) {
        this.imageViewid = imageView;
        this.title = title;

    }

    public int getImageViewid() {
        return imageViewid;
    }

    public void setImageView(int imageViewid) {
        this.imageViewid = imageViewid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
