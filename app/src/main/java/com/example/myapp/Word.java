package com.example.myapp;

public class Word {
    private String englishWord;
    private String kannadaWord;
//    private int imageId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioRecourseID;



    public Word(String eng,String kan,int audID){
        englishWord = eng;
        kannadaWord = kan;
        mAudioRecourseID=audID;
    }

    public Word(String eng,String kan,int imgId,int audID){
        englishWord = eng;
        kannadaWord = kan;
        mImageResourceId = imgId;
        mAudioRecourseID= audID;
    }
    public String getEnglishWord() {
        return englishWord;
    }

    public String getKannadaWord() {
        return kannadaWord;
    }

    public int getImageId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return mAudioRecourseID;
    }

//    public int getAudioResourceId(){
//        return 0;
//    }

}
