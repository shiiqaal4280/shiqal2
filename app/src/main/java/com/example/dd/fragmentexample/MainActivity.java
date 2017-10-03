package com.example.dd.fragmentexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView orangeFragment,chipsFragment,chickenFragment,pastoFragment,riceFragment,fishFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// get the reference of Button's

        orangeFragment= (TextView) findViewById(R.id.orangeFragment);
        chipsFragment= (TextView) findViewById(R.id.chipsFragment);
        chickenFragment= (TextView) findViewById(R.id.chickenFragment);
        pastoFragment= (TextView) findViewById(R.id.pastoFragment);
        riceFragment= (TextView) findViewById(R.id.riceFragment);
        fishFragment= (TextView) findViewById(R.id.fishFragment);




        orangeFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new OrangeFragment());
            }
        });


        chickenFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new chipsFragment());
            }
        });


        chickenFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new chickenFragment());
            }
        });

        pastoFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new pastoFragment());
            }
        });

        riceFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new riceFragment());
            }
        });

        fishFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new fishFragment());
            }
        });
    }



    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}