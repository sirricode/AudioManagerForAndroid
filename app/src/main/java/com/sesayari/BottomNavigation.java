package com.sesayari;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

@RequiresApi(api = Build.VERSION_CODES.N)
public class BottomNavigation extends AppCompatActivity {

    private TextView mTextMessage;
    View notificationLayout;
    android.support.design.widget.FloatingActionButton addButton;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    notificationLayout= findViewById(R.id.notificationFragment);
                    notificationLayout.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_notifications:
                    notificationLayout= findViewById(R.id.notificationFragment);
                    notificationLayout.setVisibility(View.VISIBLE);
                    addButton = (FloatingActionButton) findViewById(R.id.floatingActionButton8);
                    addButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            CustomDialogClass cdd = new CustomDialogClass(BottomNavigation.this);
                            cdd.show();
                        }
                    });
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        notificationLayout= findViewById(R.id.notificationFragment);
        notificationLayout.setVisibility(View.GONE);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }

}
