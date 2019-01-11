package com.bignerdranch.android.bitsandpizzas;

public class Pizza {
    private String name;
    private int imageResourceId;

    public Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public static final Pizza[] sPizzas = {
            new Pizza("Diavolo",R.drawable.diavolo),
            new Pizza("Fungi",R.drawable.funghi)
    };

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
