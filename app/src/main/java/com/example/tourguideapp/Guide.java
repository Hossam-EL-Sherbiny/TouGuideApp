package com.example.tourguideapp;

public class Guide {

    // Information for guide.
    private String informations;
    //Information for all attractions.
    private String explanation;
    //Image of GuideApp.
    private int imageResourceId;

    /**
     * @param guideinfo is the information of Guide.
     * @param explan is the explanations of all Attractions.
     */
    public Guide (String guideinfo, String explan)
    {
        informations = guideinfo;
        explanation = explan;
    }

    public Guide (String guideinfo, int mImage, String explan)
    {
        informations = guideinfo;
        explanation= explan;
        imageResourceId = mImage;
    }

    //Get the information of guide
    public String getInformation()
    {
        return informations;
    }

    public String getexplan()
    {
        return explanation;
    }

    //Get the Image of Guide
    public int getImageResourceId()
    {
        return imageResourceId;
    }

}
