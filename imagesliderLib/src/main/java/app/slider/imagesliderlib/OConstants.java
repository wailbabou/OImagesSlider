package app.slider.imagesliderlib;


import android.net.Uri;

import java.util.ArrayList;

public class OConstants {
    private ArrayList<String> imagesUrls = new ArrayList<>();
    private ArrayList<Uri> imagesURIs = new ArrayList<>() ;
    private int colorActive,colorInactive;


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
}
