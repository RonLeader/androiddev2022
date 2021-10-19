package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.Locale;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private static final int PAGE_COUNT = 3;

    public ViewpagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return WeatherAndForecastFragment.newInstance("0", "0");
            case 1:
                return new ForecastFragment();
            case 2:
                return new WeatherFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Hà Nội, Việt Nam";
            case 1:
                return "Paris, Pháp";
            case 2:
                return "Toulouse, Pháp";
        }
        return "null";
    }
}
