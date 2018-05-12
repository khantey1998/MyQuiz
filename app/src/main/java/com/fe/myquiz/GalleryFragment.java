package com.fe.myquiz;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends android.app.Fragment {

    RecyclerView recyclerView;
    GalleryAdapter adapter;
    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new GalleryAdapter(getActivity());

        Photo photos[] = new Photo[10];
        photos[0] = new Photo(R.drawable.vixx1);
        photos[1] = new Photo(R.drawable.vixx1);
        photos[2] = new Photo(R.drawable.vixx1);
        photos[3] = new Photo(R.drawable.vixx1);
        photos[4] = new Photo(R.drawable.vixx1);
        photos[5] = new Photo(R.drawable.vixx1);
        photos[6] = new Photo(R.drawable.vixx1);
        photos[7] = new Photo(R.drawable.vixx1);
        photos[8] = new Photo(R.drawable.vixx1);
        photos[9] = new Photo(R.drawable.vixx1);

        adapter.setPhotos(photos);
        recyclerView.setAdapter(adapter);

        return view;
    }

}
