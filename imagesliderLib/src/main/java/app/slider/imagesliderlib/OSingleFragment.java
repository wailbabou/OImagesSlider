package app.slider.imagesliderlib;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;


public class OSingleFragment extends Fragment {

    private PhotoView picture;
    private String imgUrl;
    private Uri imgUri;
    private int placeholder = R.drawable.placeholder;

    public OSingleFragment(){
    }

    @SuppressLint("ValidFragment")
    public OSingleFragment(String url,int placeholder){
        imgUrl=url;
        if(placeholder!=-99)
            this.placeholder = placeholder;
    }
    @SuppressLint("ValidFragment")
    public OSingleFragment(Uri uri,int placeholder){
        imgUri=uri;
        if(placeholder!=-99)
            this.placeholder = placeholder;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_single_image,container,false);
        initView(rootView);
        return rootView;

    }

    public void initView(View view){
        picture = view.findViewById(R.id.image);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if(imgUrl!=null){
            Glide.with(this).load(imgUrl).into(picture);
        }else if(imgUri!=null){
            Glide.with(this).load(imgUri).into(picture);
        }

    }
}
