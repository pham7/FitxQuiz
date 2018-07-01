package com.example.user.fitxquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.CheckBox;
import android.text.Html;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int score = 0, score1 = 0, score3 = 0 ,score4 = 0, score5 = 0,score6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void ans (View view){
        boolean checked = ((RadioButton) view ).isChecked();

        switch (view.getId()){

            case R.id.button_1a:
                if (checked)
                    score = +1;
                break;

            case R.id.button_1b:
                if (checked)
                    score = 0;
                break;

            case R.id.button_1c:
                if (checked)
                    score = 0;
                break;


            case R.id.button_2a:
                if (checked)
                    score1 = +1;
                break;


            case R.id.button_2b:
                if (checked)
                    score1 = 0;
                break;


        }


    }



    public void answer (View view){
        boolean checked = ((RadioButton) view ).isChecked();

        switch (view.getId()){

            case R.id.checkBox_1a:
                if (checked)
                    score3 = 0;
                break;

            case R.id.checkBox_1b:
                if (checked)
                    score3 = 0;
                break;

            case R.id.checkBox_1c:
                if (checked)
                    score3 = +1;
                break;

            case R.id.checkBox_2a:
                if (checked)
                    score4 = +1;
                break;

            case R.id.checkBox_2b:
                if (checked)
                    score4 = 0;
                break;

            case R.id.checkBox_2c:
                if (checked)
                    score4 = 0;
                break;


        }


    }




    public void answ (View view){
        boolean checked = ((RadioButton) view ).isChecked();

        switch (view.getId()){

            case R.id.checkBox_4a:
                if (checked)
                    score5 = 0;
                break;

            case R.id.checkBox_4b:
                if (checked)
                    score5 = 0;
                break;

            case R.id.checkBox_4c:
                if (checked)
                    score5 = +1;
                break;


        }


    }


    private void ans(){
        RadioButton buttonOne = findViewById(R.id.button_1a);//the answer
        RadioButton buttonTwo = findViewById(R.id.button_1c);
        RadioButton buttonThree = findViewById(R.id.button_1b);
        if (buttonTwo.isChecked()){
            buttonTwo.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans1 = findViewById(R.id.answerEnglish1);
            ans1.setText(getResources().getString(R.string.ansEnglish1));
            ans1.setVisibility(View.VISIBLE);


        }else if (buttonThree.isChecked()){
            buttonThree.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans1 = findViewById(R.id.answerEnglish1);
            ans1.setText(getResources().getString(R.string.ansEnglish1));
            ans1.setVisibility(View.VISIBLE);

        }
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
    }









}
