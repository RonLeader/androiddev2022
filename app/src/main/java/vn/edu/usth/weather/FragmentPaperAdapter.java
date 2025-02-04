package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentPaperAdapter extends FragmentPagerAdapter {


    public FragmentPaperAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WeatherFragment();
            case 1:
                return new ForecastFragment();
            default:
                return new WeatherFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title="";

        switch (position){
            case 0:
                title= "Weather Fragment";
                break;
            case 1:
                title= "Forecast Fragment";
                break;

        }

        return title;
    }
}