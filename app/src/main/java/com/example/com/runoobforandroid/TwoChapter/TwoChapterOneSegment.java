package com.example.com.runoobforandroid.TwoChapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.com.runoobforandroid.R;

/**
 * Created by Administrator on 2019/5/31.
 */

public class TwoChapterOneSegment extends Activity {
    private Button mBtnTwoChapterOneSegment;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_chapter_one_segment);
        initViews();
    }

    private void initViews(){
        mBtnTwoChapterOneSegment = findViewById(R.id.two_chapter_one_segment);

        mBtnTwoChapterOneSegment.setOnClickListener(mOnClickListener);
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int nViewID = v.getId();
            if (nViewID == R.id.two_chapter_one_segment) {
                Intent intent = new Intent(TwoChapterOneSegment.this,TwoChapterOneSegmentForLinearLayout.class);
                startActivity(intent);
            }
        }
    };
}
