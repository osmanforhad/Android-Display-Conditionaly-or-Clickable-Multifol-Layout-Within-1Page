package com.osmanforhad.framelayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    //Declare a variable for type LinearLayout
    LinearLayout AfterClickLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         //Initial XML Layout by XML id for click action
        AfterClickLayout = (LinearLayout) findViewById(R.id.secondlayout);
    }

//Write A Method for Display Another Layout After click
    public void seeOther(View v){
        /*Setup a Condition for checking layout  setup Attribute
         from XML
        Whence its Visible or not*/
       if (AfterClickLayout.getVisibility() == View.GONE){
           /*Set a Function for do click action
            After first Click*/
           AfterClickLayout.setVisibility(View.VISIBLE);
       } else{
           /*Set a Function for do click action
            After Second Click*/
           AfterClickLayout.setVisibility(View.GONE);
       }
    }
}
