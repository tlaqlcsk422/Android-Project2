package com.example.androidproject2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MonthCalendarAdapter  extends FragmentStateAdapter {
    private static int NUM_ITEM = 100;

    public MonthCalendarAdapter(Fragment fragment){
        super(fragment);
    }
    @Override
    public Fragment createFragment(int position) {
        //연, 월에 따라 달력을 만들어서 그걸 보냄
        int year;
        int month;

        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
