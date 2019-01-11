package com.bignerdranch.android.bitsandpizzas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PizzaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_pizza,container,false);

        String[] pizzasNames = new String[Pizza.sPizzas.length];
        for (int i = 0; i<pizzasNames.length;i++){
            pizzasNames[i] = Pizza.sPizzas[i].getName();
        }
        int[] pizzasImages = new int[Pizza.sPizzas.length];
        for (int i = 0; i<pizzasImages.length;i++){
            pizzasImages[i] = Pizza.sPizzas[i].getImageResourceId();
        }
        CaptionedImagesAdapter captionedImagesAdapter = new CaptionedImagesAdapter(pizzasNames,pizzasImages);
        recyclerView.setAdapter(captionedImagesAdapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        captionedImagesAdapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), PizzaDetailActivity.class);
                intent.putExtra(PizzaDetailActivity.PIZZA_KEY,position);
                getActivity().startActivity(intent);
            }
        });
        return recyclerView;
    }

}
