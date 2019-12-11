package com.onboardapp.ui.onboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


import com.onboardapp.R;
import com.onboardapp.ui.main.MainActivity;

import java.util.ArrayList;

public class OnBoardActivity extends AppCompatActivity {
    private Toolbar toolbar;
    ViewPager viewPager;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        initViews();
        initListeners();
        setupViewPager();
    }

    private void initViews() {
        toolbar = findViewById(R.id.appBar);
//        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager);
        button = findViewById(R.id.button_1);

    }

    private void setupViewPager() {
        PagerAdapter adapter = new ViewPagerAdapter(getResourse());
        viewPager.setAdapter(adapter);

    }

    private ArrayList<OnBoardEntity> getResourse() {
        ArrayList<OnBoardEntity> list = new ArrayList<>();

        list.add(new OnBoardEntity("Here you are may learn", R.drawable.hi));
        list.add(new OnBoardEntity("Keep going ,keep moving", R.drawable.update));
        list.add(new OnBoardEntity("And delete the tresh from your mind", R.drawable.delete));
        list.add(new OnBoardEntity("Thank you go just ahead", R.drawable.thank_you));
        return list;
    }

    private void initListeners() {

        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_onboard, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.skip:
                MainActivity.start(this);
                finish();
                break;

        }
        return true;
    }


    public static void start(Context context) {
        context.startActivity(new Intent(context, OnBoardActivity.class));
    }

    public void jumpToPage(View view) {
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);

    }

}

