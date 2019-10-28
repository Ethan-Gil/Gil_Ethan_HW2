/*
    Author: Ethan Gil
    Date: 10/28/2019
    Course: CSC 415

    Description:
    This app simulates a very simple calculator that can provide basic mathematical
    operations on two values. These operations will then be outputted on the screen.

 */

package com.example.gil_ethan_hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0;
    private Button btn_Add, btn_Sub, btn_Mul, btn_Div, btn_equal, btn_dec, btn_clear;

    private EditText edit1;

    private float Value1, Value2;
    private boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Fetching all values and assigning them to the objects */
        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);
        btn_Add = (Button)findViewById(R.id.btn_Add);
        btn_Sub = (Button)findViewById(R.id.btn_Sub);
        btn_Mul = (Button)findViewById(R.id.btn_Mul);
        btn_Div = (Button)findViewById(R.id.btn_Div);
        btn_dec = (Button)findViewById(R.id.btn_dec);
        btn_equal = (Button)findViewById(R.id.btn_equal);
        btn_clear = (Button)findViewById(R.id.btn_clear);

        edit1 = (EditText)findViewById(R.id.edit1);

        /** Adding functionality to number buttons */
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "9");
            }
        });

        /** Adding functionality to operator buttons */
        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + ".");
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "+");

                /* Updating status flags */
                add = true;
                sub = false;
                mul = false;
                div = false;
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "-");

                add = false;
                sub = true;
                mul = false;
                div = false;
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "*");

                add = false;
                sub = false;
                mul = true;
                div = false;
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "/");

                add = false;
                sub = false;
                mul = false;
                div = true;
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText("");

                add = false;
                sub = false;
                mul = false;
                div = false;
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                try {
                    String text = edit1.getText().toString();
                    String tokens[] = text.split("-+|/+|\\*+|\\++");

                    Value1 = Float.parseFloat(tokens[0]);
                    Value2 = Float.parseFloat(tokens[1]);

                    if (add) edit1.setText("" + (Value1 + Value2));
                    if (sub) edit1.setText("" + (Value1 - Value2));
                    if (mul) edit1.setText("" + (Value1 * Value2));
                    if (div) edit1.setText("" + (Value1 / Value2));
                }
                catch (IllegalArgumentException e) {
                    edit1.setText("Error: Please use two arguments");
                }
                catch (Exception e) {
                    edit1.setText("Error");
                }

            }
        });

    }

}
