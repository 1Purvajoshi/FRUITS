package com.example.purvajoshi.fruits;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager myPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPage = (ViewPager) findViewById(R.id.myPager);

        myPage.setAdapter(new MyOwnPagerAdapter(getSupportFragmentManager()));
    }

    class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String data[] = {"Banana", "Cherry", "Grape", "Jamun", "Kiwi", "Lychee", "Mango", "Orange", "Papaya", "Pear", "Pineapple", "Strawberry","Watermelon"};

        public MyOwnPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new Banana();
            }
            if (position == 1) {
                return new Cherry();
            }
            if (position == 2) {
                return new Grape();
            }
            if (position == 3) {
                return new Jamun();
            }
            if (position == 4) {
                return new Kiwi();
            }
            if (position == 5) {
                return new Lychee();

            }
            if (position == 6) {
                return new Mango();
            }
            if (position == 7) {
                return new Orange();
            }
            if (position == 8) {
                return new Papaya();
            }
            if (position == 9) {
                return new Pear();
            }
            if (position == 10) {
                return new Pineapple();
            }
            if (position == 11) {
                return new Strawberry();
            }
            if (position==12)
            {
                return new Watermelon();
            }

            return null;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }

    }
}



