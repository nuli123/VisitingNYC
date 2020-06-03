package com.example.visitingnyc;

public class Location {
    private final int NO_IMAGE_RES=-1;

    private int mNameRes;
    private int mImageRes=NO_IMAGE_RES;

    public Location(int nameStringId){
        this.mNameRes=nameStringId;
    }
    public Location(int nameStringId, int imageRes){
        this.mNameRes=nameStringId;
        this.mImageRes=imageRes;
    }

    public int getNameResID(){return this.mNameRes;}

    public int getImageRes(){return this.mImageRes;}

    public boolean hasImage(){
        return this.mImageRes!=this.NO_IMAGE_RES;
    }
}
