package com.south42studios.criminalintent;

import android.app.Fragment;

/**
 * Created by gilbertrodriguez on 6/10/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
