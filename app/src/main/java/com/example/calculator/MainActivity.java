package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void add(View view){
        int[] nums = getNumbers(view);
        int total = nums[0] + nums[1];
        goToActivity2(total + "");
    }

    public void sub(View view){
        int[] nums = getNumbers(view);
        int total = nums[0] - nums[1];
        goToActivity2(total + "");
    }

    public void mult(View view){
        int[] nums = getNumbers(view);
        int total = nums[0] * nums[1];
        goToActivity2(total + "");
    }

    public void div(View view){
        int[] nums = getNumbers(view);
        double total = (nums[0] + 0.0) / nums[1];
        goToActivity2(total + "");
    }

    public int[] getNumbers(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        int first = Integer.parseInt(firstNumber.getText().toString());

        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int second = Integer.parseInt(secondNumber.getText().toString());

        return new int[]{first, second};
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}