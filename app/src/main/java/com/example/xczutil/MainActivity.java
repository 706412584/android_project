package com.example.xczutil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import i.app.iActivity;
import i.runlibrary.app.v.文本;

public class MainActivity extends iActivity {


    public void onCreate(Bundle icicle) {

        super.onCreate(icicle);
        setContentView(R.layout.mian);
        Button btnAdd = (Button) findViewById(R.id.button);
        文本 wb1 = 视图.文本(R.id.textView1);
        wb1.字符("你好");
        wb1.视图.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gj.ts("点击了文本");
            }
        });

        btnAdd.setOnClickListener(v -> onAnClick());
    }

    //实现按钮点击事件
    public void onAnClick() {

        gj.ts("点击了按钮");
        gj.jmxc(new Runnable() {
            @Override
            public void run() {
                gj.sc("有人吗");
            }
        });

    }

}
