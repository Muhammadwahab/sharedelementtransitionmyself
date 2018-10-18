package com.mujadidiainc.sharedelementtransitionwithdailog.sharedelementstest;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mujadidiainc.sharedelementtransitionwithdailog.R;


public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

//        ((View)findViewById(R.id.card).getParent()).setOnClickListener(new View.OnClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//            @Override
//            public void onClick(View v) {
//                finishAfterTransition();
//            }
//        });
//        findViewById(R.id.card).setOnClickListener(null);
    }
}
