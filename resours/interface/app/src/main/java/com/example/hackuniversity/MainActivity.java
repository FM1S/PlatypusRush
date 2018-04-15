package com.example.hackuniversity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_target:
                    mTextMessage.setText(R.string.title_target);
                    setContentView(R.layout.menu1);
                    return true;
                case R.id.navigation_programm:
                    mTextMessage.setText(R.string.title_programm);
                    setContentView(R.layout.menu1);
                    return true;
                case R.id.navigation_timeline:
                    mTextMessage.setText(R.string.title_timeline);
                    setContentView(R.layout.menu1);
                    return true;
                case R.id.navigation_rutine:
                    mTextMessage.setText(R.string.title_rutine);
                    return true;
                case R.id.navigation_menu:
                    mTextMessage.setText(R.string.title_menu);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }


}
