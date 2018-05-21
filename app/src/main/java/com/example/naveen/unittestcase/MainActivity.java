package com.example.naveen.unittestcase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText mFirstNumberEt;
    private EditText mSecondNumberEt;
    private TextView mResultTv;
    private Calculator mCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstNumberEt=(EditText)findViewById(R.id.first_number_et);
        mSecondNumberEt=(EditText)findViewById(R.id.second_number_et);
        mResultTv=(TextView)findViewById(R.id.result_tv);

        mCalc=new Calculator();
    }

    public void add(View view)
    {
        int a=Integer.parseInt(mFirstNumberEt.getText().toString());
        int b=Integer.parseInt(mSecondNumberEt.getText().toString());
        int result=mCalc.add(a,b);
        mResultTv.setText(String.valueOf(result));
    }

    public void subtract(View view)
    {
        int a=Integer.parseInt(mFirstNumberEt.getText().toString());
        int b=Integer.parseInt(mSecondNumberEt.getText().toString());
        int result=mCalc.subtract(a,b);
        mResultTv.setText(String.valueOf(result));
    }

    public void multiply(View view)
    {
        int a=Integer.parseInt(mFirstNumberEt.getText().toString());
        int b=Integer.parseInt(mSecondNumberEt.getText().toString());
        int result=mCalc.multiply(a,b);
        mResultTv.setText(String.valueOf(result));
    }

    public void divide(View view)
    {
        int a=Integer.parseInt(mFirstNumberEt.getText().toString());
        int b=Integer.parseInt(mSecondNumberEt.getText().toString());
        int result=mCalc.divide(a,b);
        mResultTv.setText(String.valueOf(result));
    }
}
