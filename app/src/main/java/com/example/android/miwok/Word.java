package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,
                int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
