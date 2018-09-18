package com.example.android.tourguideapp;

class Guide {

    // This has two text views for our demo so we declare two variables.

    // Declare first word
    private final String mFirstWord;

    // Declare second word
    private final String mSecondWord;

    private final int mFirstImage;

    //  Now we set the Constructor, this takes the inputs and creates vars
    Guide(String firstWord, String secondWord, int firstImage) {
        mFirstWord = firstWord;
        mSecondWord = secondWord;
        mFirstImage = firstImage;

    }

    // We set up the methods to return data.

    // Get the 1st word
    public String getFirstWord() {
        return mFirstWord;
    }

    // Get the 2nd word
    public String getSecondWord() {
        return mSecondWord;
    }

    // Get the Image
    public int getFirstImage() {
        return mFirstImage;
    }


}
