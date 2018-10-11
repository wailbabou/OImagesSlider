package app.slider.imagesliderlib;


import android.net.Uri;

import java.util.ArrayList;

public class OConfig {
    private ArrayList<String> imagesUrls = new ArrayList<>();
    private ArrayList<Uri> imagesURIs = new ArrayList<>() ;
    private int colorActive,colorInactive;
    private  int currentImg=0;
    private int backGroundColor=-99;
    private int placeholder=-99;

    public ArrayList<String> getImagesUrls() {
        return imagesUrls;
    }

    public void setImagesUrls(ArrayList<String> imagesUrls) {
        this.imagesUrls = imagesUrls;
    }

    public ArrayList<Uri> getImagesURIs() {
        return imagesURIs;
    }

    public void setImagesURIs(ArrayList<Uri> imagesURIs) {
        this.imagesURIs = imagesURIs;
    }

    public int getColorActive() {
        return colorActive;
    }

    public void setColorActive(int colorActive) {
        this.colorActive = colorActive;
    }

    public int getColorInactive() {
        return colorInactive;
    }

    public void setColorInactive(int colorInactive) {
        this.colorInactive = colorInactive;
    }

    public int getCurrentImg() {
        return currentImg;
    }

    public void setCurrentImg(int currentImg) {
        this.currentImg = currentImg;
    }

    public int getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(int backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    public int getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(int placeholder) {
        this.placeholder = placeholder;
    }
}
