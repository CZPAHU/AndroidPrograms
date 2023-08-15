package com.example.buttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.buttonexample.util.DateUtil;

public class MainActivity extends AppCompatActivity {

    private TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result = findViewById(R.id.tv_result);
    }

    public void doClick(View view){
        String desc =String.format("%s 点击了按钮: %s", DateUtil.getNowTime(), ((Button) view).getText());
        tv_result.setText(desc);
    }
}
