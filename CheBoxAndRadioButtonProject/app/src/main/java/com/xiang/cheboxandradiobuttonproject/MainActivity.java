package com.xiang.cheboxandradiobuttonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RadioGroup rg;
        final TextView show;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg= (RadioGroup) findViewById(R.id.rg);
        show= (TextView) findViewById(R.id.show);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //三元运算符
                String tip=checkedId==  R.id.female ?"你的性别是男人":"你的性别是女人";
                show.setText(tip);

            }
        });
    }
}
