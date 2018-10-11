package app.slider.imageslidersample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import app.slider.imagesliderlib.OImageSlider;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ArrayList<String> imgs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        putImgs();
        initViews();
        initListeners();
    }

    public void initViews(){
        button = findViewById(R.id.button);
    }

    public void initListeners(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSlider();
            }
        });
    }

    public void putImgs(){
        imgs.add("https://image.flaticon.com/sprites/new_packs/1189106-friendship.png");
        imgs.add("https://image.flaticon.com/sprites/new_packs/1149162-internet-service.png");
        imgs.add("https://image.flaticon.com/sprites/new_packs/1183640-internet-technology.png");
    }

    public void startSlider(){
        OImageSlider oImageSlider = new OImageSlider();
        oImageSlider.setColorActive(Color.WHITE) //bottom indicator active color
                .setColorInactive(Color.GRAY) // bottom indicator inactive color
                .setImageUrls(imgs) // arraylist of image urls
                .setCurrentImage(1) // the selected image ( starting from 0 )
                .setBackgroundColor(Color.BLACK)
                .start(this,99);

    }
}
