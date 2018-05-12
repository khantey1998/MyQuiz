package com.fe.myquiz;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Tey on 5/7/2018.
 */

public class GalleryAdapter extends RecyclerView.Adapter <GalleryAdapter.GalleryViewHolder> {

    private Photo photos[];
    Context context;

    public GalleryAdapter(Context context) {
        this.context = context;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    @Override
    public GalleryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.gallery_view_holder, parent,false);
        GalleryViewHolder galleryViewHolder = new GalleryViewHolder(view);
        return galleryViewHolder;
    }

    @Override
    public void onBindViewHolder(GalleryViewHolder holder, int position) {
        Photo photo = photos[position];
        holder.imgGallery.setImageResource(photo.getThumbnailUrl());

    }

    @Override
    public int getItemCount() {
        return photos.length;
    }

    class GalleryViewHolder extends RecyclerView.ViewHolder {

        ImageView imgGallery;

        public GalleryViewHolder(View itemView) {
            super(itemView);
            imgGallery = itemView.findViewById(R.id.img_event);

        }
    }

}
