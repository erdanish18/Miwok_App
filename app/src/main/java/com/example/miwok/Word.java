package com.example.miwok;

public class Word {
    private  String mDefaultTranslation;
    private  String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private  static final int NO_IMAGE_PROVIDED =-1;

    public Word(String DefaultTranslation, String miwokTranslation, int imageResourceId){
     mDefaultTranslation = DefaultTranslation;
     mMiwokTranslation = miwokTranslation;
     mImageResourceId = imageResourceId;

    }
    // Getters and Setters

    public String getDefaultTranslationId() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslationId() {
       return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
