package com.example.miwok;

public class Word {
    //Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    //Image resource id for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //audio resource id for the word
    private int mAudioResourceId;

    //constructor
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    //constructor
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    //get the default translation of the word
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    //get miwok translation of the word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //get the Image resource id for the word
    public int getImageResourceId(){
        return mImageResourceId;
    }

    //get the audio resource ud for the word
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
