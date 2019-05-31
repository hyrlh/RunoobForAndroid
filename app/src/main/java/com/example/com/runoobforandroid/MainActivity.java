package com.example.com.runoobforandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.com.runoobforandroid.TwoChapter.TwoChapterOneSegment;
import com.example.com.runoobforandroid.TwoChapter.TwoChapterOneSegmentForLinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTest;
    private Button mBtnTwoChapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    private void initViews(){
        mBtnTest = findViewById(R.id.test);
        mBtnTwoChapter = findViewById(R.id.two_chapter);

        mBtnTest.setOnClickListener(mOnClickListener);
        mBtnTwoChapter.setOnClickListener(mOnClickListener);
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int nViewID = v.getId();
            Intent intent = null;
            if (nViewID == R.id.test) {
                intent = new Intent(MainActivity.this, TwoChapterOneSegmentForLinearLayout.class);
            } else if (nViewID == R.id.two_chapter) {
                intent = new Intent(MainActivity.this,TwoChapterOneSegment.class);
            }
            if (intent != null) {
                startActivity(intent);
            }
        }
    };
}
