package app.slider.imagesliderlib;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;


public class OSliderActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout dotsLayout;
    private TextView[] dots;
    OConfig constants;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Making notification bar transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        setContentView(R.layout.activity_o_slider);
        constants = new Gson().fromJson(getIntent().getStringExtra("data"),OConfig.class);

        viewPager = findViewById(R.id.view_pager);
        dotsLayout =  findViewById(R.id.layoutDots);

        setupViewPager(viewPager);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);


        viewPager.setCurrentItem(constants.getCurrentImg());
        addBottomDots(constants.getCurrentImg());
    }


    private void addBottomDots(int currentPage) {
        dots = new TextView[constants.getImagesUrls().size()];

        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(constants.getColorInactive());
            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0)
            dots[currentPage].setTextColor(constants.getColorActive());
    }

    private int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        if(constants.getImagesUrls().size()>0){
            for(int i=0 ; i<constants.getImagesUrls().size();i++){
                adapter.addFrag(new OSingleFragment(constants.getImagesUrls().get(i)));
            }
        }else if (constants.getImagesURIs().size()>0){
            for(int i=0 ; i<constants.getImagesURIs().size();i++){
                adapter.addFrag(new OSingleFragment(constants.getImagesURIs().get(i)));
            }
        }
        viewPager.setAdapter(adapter);
    }

    //  viewpager change listener
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            addBottomDots(position);
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };
    /**
     * View pager adapter
     */
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment) {
            mFragmentList.add(fragment);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }
    }
}