package com.example.miwok;

public class Word {
    private  String mDefaultTranslation;
    private  String mMiwokTranslation;

    public Word(String DefaultTranslation, String MiwokTranslation){
     mDefaultTranslation = DefaultTranslation;
     mMiwokTranslation = MiwokTranslation;

    }
    // Getters and Setters

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
       return mMiwokTranslation;
    }
}
