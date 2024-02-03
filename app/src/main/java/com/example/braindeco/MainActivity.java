package com.example.braindeco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private RadioGroup mRadioGroup;
    private RadioButton mQuestion1State,mQuestion2State,mQuestion3State,mQuestion4State,mQuestion5State,mQuestion6State,mQuestion7State,mQuestion8State,mQuestion9State,mQuestion10State;
    private int mUserQ1Ans, mUserQ2Ans, mUserQ3Ans, mUserQ4Ans, mUserQ5Ans, mUserQ6Ans, mUserQ7Ans, mUserQ8Ans, mUserQ9Ans, mUserQ10Ans;
    private int finalScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        mRadioGroup = (RadioGroup) findViewById(R.id.Question_1_Group);
        mUserQ1Ans=mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQ1Ans",mUserQ1Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.Question_2_Group);
        mUserQ2Ans=mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQ2Ans",mUserQ2Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.Question_3_Group);
        mUserQ3Ans=mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQ3Ans",mUserQ3Ans);


        mRadioGroup = (RadioGroup) findViewById(R.id.Question_4_Group);
        mUserQ4Ans=mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQ4Ans",mUserQ4Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.Question_5_Group);
        mUserQ5Ans=mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQ5Ans",mUserQ5Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.Question_6_Group);
        mUserQ6Ans=mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQ6Ans",mUserQ6Ans);


        mRadioGroup = (RadioGroup) findViewById(R.id.Question_7_Group);
        mUserQ7Ans=mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQ7Ans",mUserQ7Ans);


        mRadioGroup = (RadioGroup) findViewById(R.id.Question_8_Group);
        mUserQ8Ans=mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQ8Ans",mUserQ8Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.Question_9_Group);
        mUserQ9Ans=mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQ9Ans",mUserQ9Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.Question_10_Group);
        mUserQ10Ans=mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQ10Ans",mUserQ10Ans);

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mUserQ1Ans = savedInstanceState.getInt("mUserQ1Ans");
        if(mUserQ1Ans != -1){
            mQuestion1State = findViewById(mUserQ1Ans);
            mQuestion1State.setChecked(true);
        }
        mUserQ2Ans = savedInstanceState.getInt("mUserQ2Ans");
        if(mUserQ2Ans != -1){
            mQuestion2State = findViewById(mUserQ2Ans);
            mQuestion2State.setChecked(true);
        }
        mUserQ3Ans = savedInstanceState.getInt("mUserQ3Ans");
        if(mUserQ3Ans != -1){
            mQuestion3State = findViewById(mUserQ3Ans);
            mQuestion3State.setChecked(true);
        }
        mUserQ4Ans = savedInstanceState.getInt("mUserQ4Ans");
        if(mUserQ4Ans != -1){
            mQuestion4State = findViewById(mUserQ4Ans);
            mQuestion4State.setChecked(true);
        }
        mUserQ5Ans = savedInstanceState.getInt("mUserQ5Ans");
        if(mUserQ5Ans != -1){
            mQuestion5State = findViewById(mUserQ5Ans);
            mQuestion5State.setChecked(true);
        }
        mUserQ6Ans = savedInstanceState.getInt("mUserQ6Ans");
        if(mUserQ6Ans != -1){
            mQuestion6State = findViewById(mUserQ6Ans);
            mQuestion6State.setChecked(true);
        }

        mUserQ7Ans = savedInstanceState.getInt("mUserQ7Ans");
        if(mUserQ7Ans != -1){
            mQuestion7State = findViewById(mUserQ7Ans);
            mQuestion7State.setChecked(true);
        }
        mUserQ8Ans = savedInstanceState.getInt("mUserQ8Ans");
        if(mUserQ8Ans != -1){
            mQuestion8State = findViewById(mUserQ8Ans);
            mQuestion8State.setChecked(true);
        }
        mUserQ9Ans = savedInstanceState.getInt("mUserQ9Ans");
        if(mUserQ9Ans != -1){
            mQuestion9State = findViewById(mUserQ9Ans);
            mQuestion9State.setChecked(true);
        }
        mUserQ10Ans = savedInstanceState.getInt("mUserQ10Ans");
        if(mUserQ10Ans != -1){
            mQuestion10State = findViewById(mUserQ10Ans);
            mQuestion10State.setChecked(true);
        }
    }

    public void submit(View view) {
        int temp = 0;
        finalScore = 0;
        
        temp = question1();
        if(temp == -1){
            setToastForSelectAll();
            return;
        }else{
            finalScore=finalScore+temp;
        }

        temp = question2();
        if(temp == -1){
            setToastForSelectAll();
            return;
        }else{
            finalScore=finalScore+temp;
        }

        temp = question3();
        if(temp == -1){
            setToastForSelectAll();
            return;
        }else{
            finalScore=finalScore+temp;
        }

        temp = question4();
        if(temp == -1){
            setToastForSelectAll();
            return;
        }else{
            finalScore=finalScore+temp;
        }

        temp = question5();
        if(temp == -1){
            setToastForSelectAll();
            return;
        }else{
            finalScore=finalScore+temp;
        }

        temp = question6();
        if(temp == -1){
            setToastForSelectAll();
            return;
        }else{
            finalScore=finalScore+temp;
        }

        temp = question7();
        if(temp == -1){
            setToastForSelectAll();
            return;
        }else{
            finalScore=finalScore+temp;
        }


        temp = question8();
        if(temp == -1){
            setToastForSelectAll();
            return;
        }else{
            finalScore=finalScore+temp;
        }


        temp = question9();
        if(temp == -1){
            setToastForSelectAll();
            return;
        }else{
            finalScore=finalScore+temp;
        }

        temp = question10();
        if(temp == -1){
            setToastForSelectAll();
            return;
        }else{
            finalScore=finalScore+temp;
        }

        displayFinalMessage();
    }

    private int question10() {
        RadioGroup radioGroup = findViewById(R.id.Question_10_Group);
        if(radioGroup.getCheckedRadioButtonId() == -1){
            return -1;
        }else{
            RadioButton radioButton = findViewById(R.id.Question_10_op3);
            if(radioButton.isChecked()){
                return 10;
            }else{
                return 0;
            }
        }
    }

    private void displayFinalMessage() {
        Intent scoreIntent = new Intent(this,ResultActivity.class);
        scoreIntent.putExtra("finalScore",finalScore);
        startActivity(scoreIntent);
        finish();
    }

    private int question9() {
        RadioGroup radioGroup = findViewById(R.id.Question_9_Group);
        if(radioGroup.getCheckedRadioButtonId() == -1){
            return -1;
        }else{
            RadioButton radioButton = findViewById(R.id.Question_9_op2);
            if(radioButton.isChecked()){
                return 10;
            }else{
                return 0;
            }
        }
    }

    private int question8() {
        RadioGroup radioGroup = findViewById(R.id.Question_8_Group);
        if(radioGroup.getCheckedRadioButtonId() == -1){
            return -1;
        }else{
            RadioButton radioButton = findViewById(R.id.Question_8_op2);
            if(radioButton.isChecked()){
                return 10;
            }else{
                return 0;
            }
        }
    }

    private int question7() {
        RadioGroup radioGroup = findViewById(R.id.Question_7_Group);
        if(radioGroup.getCheckedRadioButtonId() == -1){
            return -1;
        }else{
            RadioButton radioButton = findViewById(R.id.Question_7_op2);
            if(radioButton.isChecked()){
                return 10;
            }else{
                return 0;
            }
        }
    }

    private int question6() {
        RadioGroup radioGroup = findViewById(R.id.Question_6_Group);
        if(radioGroup.getCheckedRadioButtonId() == -1){
            return -1;
        }else{
            RadioButton radioButton = findViewById(R.id.Question_6_op2);
            if(radioButton.isChecked()){
                return 10;
            }else{
                return 0;
            }
        }
    }

    private int question5() {
        RadioGroup radioGroup = findViewById(R.id.Question_5_Group);
        if(radioGroup.getCheckedRadioButtonId() == -1){
            return -1;
        }else{
            RadioButton radioButton = findViewById(R.id.Question_5_op1);
            if(radioButton.isChecked()){
                return 10;
            }else{
                return 0;
            }
        }

    }

    private int question4() {
        RadioGroup radioGroup = findViewById(R.id.Question_4_Group);
        if(radioGroup.getCheckedRadioButtonId() == -1){
            return -1;
        }else{
            RadioButton radioButton = findViewById(R.id.Question_4_op4);
            if(radioButton.isChecked()){
                return 10;
            }else{
                return 0;
            }
        }
    }

    private int question3() {
        RadioGroup radioGroup = findViewById(R.id.Question_3_Group);
        if(radioGroup.getCheckedRadioButtonId() == -1){
            return -1;
        }else{
            RadioButton radioButton = findViewById(R.id.Question_3_op2);
            if(radioButton.isChecked()){
                return 10;
            }else{
                return 0;
            }
        }
    }

    private int question2() {
        RadioGroup radioGroup = findViewById(R.id.Question_2_Group);
        if(radioGroup.getCheckedRadioButtonId() == -1){
            return -1;
        }else{
            RadioButton radioButton = findViewById(R.id.Question_2_op1);
            if(radioButton.isChecked()){
                return 10;
            }else{
                return 0;
            }
        }
    }

    private int question1() {
        RadioGroup radioGroup = findViewById(R.id.Question_1_Group);
        if(radioGroup.getCheckedRadioButtonId() == -1){
            return -1;
        }else{
            RadioButton radioButton = findViewById(R.id.Question_1_op3);
            if(radioButton.isChecked()){
                return 10;
            }else{
                return 0;
            }
        }
    }
    private void setToastForSelectAll() {
        Toast.makeText(this,getString(R.string.attempt_all_question),Toast.LENGTH_SHORT).show();

    }

}