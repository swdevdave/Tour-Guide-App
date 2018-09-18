package com.example.android.tourguideapp;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private final Context mContext;


    CategoryAdapter(Context context, FragmentManager manager) {
        super(manager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TheatersFragment();
            case 1:
                return new OutdoorsFragment();
            case 2:
                return new LandmarksFragment();
            default:
                return new FunFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_theaters);
            case 1:
                return mContext.getString(R.string.category_outdoors);
            case 2:
                return mContext.getString(R.string.category_landmarks);
            default:
                return mContext.getString(R.string.category_fun);
        }
    }
}
