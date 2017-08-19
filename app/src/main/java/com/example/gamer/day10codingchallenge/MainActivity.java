package com.example.gamer.day10codingchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Result;
    EditText mytx1,mytx2;
    String mystr1,mystr2;
    Float num1,num2,num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytx1 = (EditText)findViewById(R.id.txt1);
        mytx2 = (EditText)findViewById(R.id.txt2);
        Result = (TextView)findViewById(R.id.result);
    }

    public void onclick(View view) {
        mystr1 = mytx1.getText().toString();
        num1 = Float.parseFloat(mystr1);
        mystr2 = mytx2.getText().toString();
        num2 = Float.parseFloat(mystr2);
        if(num2==0)
        {
            Result.setText("Division Not Possible");
        }
        else
        {
            Divide(num1,num2);
        }
    }
    public float Divide(float x,float y)
    {
        num3 = x/y;
        Result.setText(String.valueOf(num3));
        return num3;
    }
}
