package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.minhtien.demoswipeableviews.GamesFragment;
import com.minhtien.demoswipeableviews.MoviesFragment;
import com.minhtien.demoswipeableviews.TopRatedFragment;

/**
 * Created by minhtien on 1/13/16.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {


    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new TopRatedFragment();
            case 1:
                return new GamesFragment();
            case 2:
                return new MoviesFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
