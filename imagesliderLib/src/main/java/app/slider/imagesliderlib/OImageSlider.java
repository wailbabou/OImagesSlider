package app.slider.imagesliderlib;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.google.gson.Gson;

import java.util.ArrayList;

public class OImageSlider {
    private OConfig constants  = new OConfig();
    public OImageSlider setColorActive(int color){
        constants.setColorActive(color);
        return  this;
    }
    public OImageSlider setColorInactive(int color){
        constants.setColorInactive(color);
        return  this;
    }
    public OImageSlider setImageUrls(ArrayList<String> imgs){
        constants.setImagesUrls(imgs);
        return  this;
    }
    public OImageSlider setImageURIs(ArrayList<Uri> imgs){
        constants.setImagesURIs(imgs);
        return  this;
    }
    public OImageSlider setCurrentImage(int position){
        constants.setCurrentImg(position);
        return  this;
    }
    public OImageSlider setPlaceholder(int placeholder){
        constants.setPlaceholder(placeholder);
        return  this;
    }
    public OImageSlider setBackgroundColor(int color){
        constants.setBackGroundColor(color);
        return  this;
    }
    public void start(Context context){
        Intent ii = new Intent(context,OSliderActivity.class);
        ii.putExtra("data",new Gson().toJson(constants));
        context.startActivity(ii);
    }

}
