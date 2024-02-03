package com.example.braindeco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    private String mDisplayScore;
    private int mFinalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            mFinalScore = bundle.getInt("finalScore");
        }

        displayFinalResult();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void displayFinalResult() {
        if(mFinalScore <= 35){
            displayResult(R.string.tv1_a,R.drawable.upset,R.string.tv1_b);
          //  Toast.makeText(this,getString(R.string.tv1_a)+" "+mFinalScore+getString(R.string.from_hundred)+" "+ getString(R.string.tv1_a),Toast.LENGTH_SHORT).show();
        }else if(mFinalScore > 35 && mFinalScore <= 50){
            displayResult(R.string.tv2_a,R.drawable.smile,R.string.tv2_b);
        }else if(mFinalScore > 50 && mFinalScore <=75){
            displayResult(R.string.tv3_a,R.drawable.swag,R.string.tv3_b);
        }else{
            displayResult(R.string.tv4_a,R.drawable.faboulas,R.string.tv4_b);
        }
    }


    private void displayResult(int tv1, int emoji, int tv2) {
        TextView tv;
        ImageView imageView;

        tv = findViewById(R.id.result_TV1);
        tv.setText(tv1);

        tv = findViewById(R.id.result_TV2);
        mDisplayScore = mFinalScore + getString(R.string.from_hundred);
        tv.setText(mDisplayScore);


        imageView = findViewById(R.id.emojiID);
        imageView.setImageResource(emoji);

        tv = findViewById(R.id.feedback);
        tv.setText(tv2);
    }

    public void restart(View view) {
        Intent intent = new Intent(this,MainActivity.class);   //(from , to)
        startActivity(intent);
        finish();
    }

    public void exit(View view) {
        finish();
        System.exit(0);

    }
}