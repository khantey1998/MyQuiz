package com.fe.myquiz;

/**
 * Created by Tey on 5/7/2018.
 */

public class Photo {

    private int thumbnailUrl;

    public Photo(int thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(int thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
