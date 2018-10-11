package app.slider.imagesliderlib;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;

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
    public void start(Context context,int requestCode){
        Intent ii = new Intent(context,OSliderActivity.class);
        ii.putExtra("data",new Gson().toJson(constants));
        ((AppCompatActivity)context).startActivityForResult(ii,requestCode);
    }

}
