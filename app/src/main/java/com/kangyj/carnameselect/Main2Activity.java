package com.kangyj.carnameselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.kangyj.carnameselect.view.LabelView;

public class Main2Activity extends AppCompatActivity {

    private LabelView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        text = findViewById(R.id.text);
//        text.setLabelDistance(30);
//        text.setLabelOrientation(60);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("Mr.kang", "onTouchEvent: "+event.getAction());
        return super.onTouchEvent(event);
    }
}
