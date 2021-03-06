package com.yeepbank.android.widget;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by WW on 2015/8/21.
 */
public class GuidePagerAdapter extends PagerAdapter {

    private ImageView[] mImageViews;

    private int[] mImageRes;

    public GuidePagerAdapter(ImageView[] imageViews, int[] imageRes) {
        this.mImageViews = imageViews;
        this.mImageRes = imageRes;

    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if (mImageRes.length == 1) {
            return mImageViews[0];
        } else {
            ((ViewPager) container).addView(mImageViews[position % mImageRes.length], 0);
        }
        return mImageViews[position % mImageRes.length];
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        if (mImageRes.length == 1) {
            ((ViewPager) container).removeView(mImageViews[0]);
        } else {
            ((ViewPager) container).removeView(mImageViews[position % mImageRes.length]);
        }
    }
}
