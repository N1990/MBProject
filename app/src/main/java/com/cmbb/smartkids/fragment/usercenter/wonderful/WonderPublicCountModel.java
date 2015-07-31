package com.cmbb.smartkids.fragment.usercenter.wonderful;

import java.util.ArrayList;

/**
 * Created by N.Sun
 */
public class WonderPublicCountModel {
    private String attention;
    private String count;
    private ArrayList<WonderPublicModel> list;

    /**
     * @return The presentation
     */
    public String getAttention() {
        return attention;
    }

    /**
     * @param presentation The presentation
     */
    public void setAttention(String presentation) {
        this.attention = presentation;
    }

    /**
     * @return The token
     */
    public String getCount() {
        return count;
    }

    /**
     * @param token The token
     */
    public void setCount(String token) {
        this.count = token;
    }

    /**
     * @return The HomeSameAge
     */
    public ArrayList<WonderPublicModel> getHomeSameAgeList() {
        return list;
    }

    /**
     * @param HomeSameAge The HomeSameAge
     */
    public void setHomeSameAgeList(ArrayList<WonderPublicModel> HomeSameAge) {
        this.list = HomeSameAge;
    }
}