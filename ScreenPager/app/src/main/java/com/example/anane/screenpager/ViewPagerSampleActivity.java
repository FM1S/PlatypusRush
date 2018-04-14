package com.example.anane.screenpager;
import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ViewPagerSampleActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    private List<View> allEds;
    FloatingActionButton fab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = LayoutInflater.from(this);
        List<View> pages = new ArrayList<View>();

//инициализировали наш массив с edittext.aьи
        allEds = new ArrayList<View>();
///

///


        View page = inflater.inflate(R.layout.page, null);
        TextView textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Понедельник");
        pages.add(page);
        FloatingActionButton act1 = (FloatingActionButton) pages.get(0).findViewById(R.id.add_task);
        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View view = getLayoutInflater().inflate(R.layout.dinamik_day, null);
                allEds.add(view);
                final LinearLayout linear = findViewById(R.id.linear);
                linear.addView(view);

            }
        });


        page = inflater.inflate(R.layout.page, null);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Вторник");
        pages.add(page);
        act1 = (FloatingActionButton) pages.get(1).findViewById(R.id.add_task);
        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View view = getLayoutInflater().inflate(R.layout.dinamik_day, null);
                allEds.add(view);
                final LinearLayout linear = findViewById(R.id.linear);
                linear.addView(view);

            }
        });

        page = inflater.inflate(R.layout.page, null);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Среда");
        pages.add(page);
        act1 = (FloatingActionButton) pages.get(2).findViewById(R.id.add_task);
        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View view = getLayoutInflater().inflate(R.layout.dinamik_day, null);
                allEds.add(view);
                final LinearLayout linear = findViewById(R.id.linear);
                linear.addView(view);

            }
        });

        page = inflater.inflate(R.layout.page, null);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Четверг");
        pages.add(page);
        act1 = (FloatingActionButton) pages.get(3).findViewById(R.id.add_task);
        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View view = getLayoutInflater().inflate(R.layout.dinamik_day, null);
                allEds.add(view);
                final LinearLayout linear = findViewById(R.id.linear);
                linear.addView(view);

            }
        });

        page = inflater.inflate(R.layout.page, null);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Пятница");
        pages.add(page);
       act1 = (FloatingActionButton) pages.get(4).findViewById(R.id.add_task);
        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View view = getLayoutInflater().inflate(R.layout.dinamik_day, null);
                allEds.add(view);
                final LinearLayout linear = findViewById(R.id.linear);
                linear.addView(view);

            }
        });

        page = inflater.inflate(R.layout.page, null);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Суббота");
        pages.add(page);
        act1 = (FloatingActionButton) pages.get(5).findViewById(R.id.add_task);
        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View view = getLayoutInflater().inflate(R.layout.dinamik_day, null);
                allEds.add(view);
                final LinearLayout linear = findViewById(R.id.linear);
                linear.addView(view);

            }
        });

        page = inflater.inflate(R.layout.page, null);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Суббота");
        pages.add(page);
        act1 = (FloatingActionButton) pages.get(6).findViewById(R.id.add_task);
        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View view = getLayoutInflater().inflate(R.layout.dinamik_day, null);
                allEds.add(view);
                final LinearLayout linear = findViewById(R.id.linear);
                linear.addView(view);

            }
        });

        SamplePagerAdapter pagerAdapter = new SamplePagerAdapter(pages);
        ViewPager viewPager = new ViewPager(this);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);


        /*fab = new FloatingActionButton(this);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View view = getLayoutInflater().inflate(R.layout.dinamik_day, null);
                allEds.add(view);
                final LinearLayout linear = findViewById(R.id.linear);
                linear.addView(view);

            }
        });
        viewPager.addView(fab);
        */
        setContentView(viewPager);




    }
   /* public void onClick(View v) {
        final View view = getLayoutInflater().inflate(R.layout.dinamik_day, null);
        allEds.add(view);
        final LinearLayout linear = (LinearLayout) findViewById(R.id.linear);
        linear.addView(view);
    }*/
}
/*               FloatingActionButton act1 = (FloatingActionButton) pages.get(0).findViewById(R.id.add_task);
        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View view = getLayoutInflater().inflate(R.layout.dinamik_day, null);
                allEds.add(view);
                final LinearLayout linear = findViewById(R.id.linear);
                linear.addView(view);

            }
        });*/