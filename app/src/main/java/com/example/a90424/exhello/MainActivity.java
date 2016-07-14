package com.example.a90424.exhello;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    String sen="";
    int a=0,b,c;
    int cnt=0;
    String mark = "";


    public void find(){
        if(a!=0) {
            a += Integer.parseInt(sen);
        }
        else{
            a = Integer.parseInt(sen);
        }
        sen ="";
        mark = "+";
    }

    public void minus(){
        if(a!=0) {
            a = (a) - (Integer.parseInt(sen));
        }
        else{
            a = Integer.parseInt(sen);
        }
        sen = "";
        mark = "-";
    }

    public void mat(){
        if(a!=0){
            a = a * (Integer.parseInt(sen));
        }
        else{
            a = Integer.parseInt(sen);
        }
        sen = "";
        mark = "*";
    }

    public void goal(){
        b = Integer.parseInt(sen);
        switch(mark){
            case "+":
                c=a+b;
                break;

            case "-":
                c=a-b;
                break;

            case "*":
                c=a*b;
                break;
        }

        String str = Integer.toString(c);

        sen = str;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        text.setTextColor(Color.BLUE);
        findViewById(R.id.b1).setOnClickListener(mClickListener);
        findViewById(R.id.b2).setOnClickListener(mClickListener);
        findViewById(R.id.b3).setOnClickListener(mClickListener);
        findViewById(R.id.b4).setOnClickListener(mClickListener);
        findViewById(R.id.b5).setOnClickListener(mClickListener);
        findViewById(R.id.b6).setOnClickListener(mClickListener);
        findViewById(R.id.b7).setOnClickListener(mClickListener);
        findViewById(R.id.b8).setOnClickListener(mClickListener);
        findViewById(R.id.b9).setOnClickListener(mClickListener);
        findViewById(R.id.b0).setOnClickListener(mClickListener);
        findViewById(R.id.b_start).setOnClickListener(mClickListener);
        findViewById(R.id.b_mat).setOnClickListener(mClickListener);
        findViewById(R.id.b_plus).setOnClickListener(mClickListener);
        findViewById(R.id.b_minus).setOnClickListener(mClickListener);
        findViewById(R.id.b_clear).setOnClickListener(mClickListener);

        /*
        Log.v("my tag : " , "onCreate-verbose");
        Log.v("my tag : " , "debug");
        Log.v("my tag : " , "information");
        Log.v("my tag : " , "warning");
        Log.v("my tag : " , "error");
        */

    }


    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {


            String string;
            switch (v.getId()) {
                case R.id.b1:
                    string = Integer.toString(1);
                    sen += string;
                    text.setText(sen);
                    cnt=0;
                    break;

                case R.id.b2:
                    string = Integer.toString(2);
                    sen += string;
                    text.setText(sen);
                    cnt=0;
                    break;

                case R.id.b3:
                    string = Integer.toString(3);
                    sen += string;
                    text.setText(sen);
                    cnt=0;
                    break;

                case R.id.b4:
                    string = Integer.toString(4);
                    sen += string;
                    text.setText(sen);
                    cnt=0;
                    break;

                case R.id.b5:
                    string = Integer.toString(5);
                    sen += string;
                    text.setText(sen);
                    cnt=0;
                    break;

                case R.id.b6:
                    string = Integer.toString(6);
                    sen += string;
                    text.setText(sen);
                    cnt=0;
                    break;

                case R.id.b7:
                    string = Integer.toString(7);
                    sen += string;
                    text.setText(sen);
                    cnt=0;
                    break;

                case R.id.b8:
                    string = Integer.toString(8);
                    sen += string;
                    text.setText(sen);
                    cnt=0;
                    break;

                case R.id.b9:
                    string = Integer.toString(9);
                    sen += string;
                    text.setText(sen);
                    cnt=0;
                    break;

                case R.id.b0:
                    string = Integer.toString(0);
                    sen += string;
                    text.setText(sen);
                    cnt=0;
                    break;

                case R.id.b_clear:
                    sen = "";
                    a=0;
                    b=0;
                    c=0;
                    text.setText(sen);
                    cnt=0;
                    break;

                case R.id.b_plus:
                    if(cnt==0)find();
                    cnt=1;

                    break;

                case R.id.b_start:
                    if(cnt==0)goal();
                    text.setText(sen);
                    sen ="";
                    cnt=1;

                    break;

                case R.id.b_minus:
                    if(cnt==0)minus();
                    cnt=1;

                    break;

                case R.id.b_mat:
                    if(cnt==0)mat();
                    cnt=1;

                    break;


            }
        }

    };

}
