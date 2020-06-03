package com.example.visitingnyc;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LocationCategoryAdapter extends FragmentPagerAdapter {
    final int TAB_COUNT=4;
    private Context mContext;

    public LocationCategoryAdapter(Context context, FragmentManager fm){
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.mContext=context;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new RestaurantsFragment();
            case 1:
                return new LandmarksFragment();
            case 2:
                return new CultureFragment();
            case 3:
                return new ShoppingFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return mContext.getString(R.string.category_restaurants);
            case 1:
                return mContext.getString(R.string.category_landmarks);
            case 2:
                return mContext.getString(R.string.category_culture);
            case 3:
                return mContext.getString(R.string.category_shopping);
            default:
                return null;
        }
    }
}
