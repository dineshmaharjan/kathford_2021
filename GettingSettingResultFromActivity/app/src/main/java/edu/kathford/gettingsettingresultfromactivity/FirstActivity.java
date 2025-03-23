package edu.kathford.gettingsettingresultfromactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText fullNameEditText;
    private Button sendButton;
    private TextView resultTextView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        fullNameEditText = findViewById(R.id.fullNameEditText);
        sendButton = findViewById(R.id.sendButton);
        resultTextView = findViewById(R.id.resultTextView);


        sendButton.setOnClickListener(this);
//        sendButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        String fullName = fullNameEditText.getText()
                .toString().trim();
       //explicit intent
        Intent intent = new Intent(
                FirstActivity.this,
                SecondActivity.class);
        intent.putExtra("fullName", fullName);


        startActivityForResult(intent,
                200);
    }


    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == 201){
            String result = data.getStringExtra("result");

            resultTextView.setText(result);
        }
    }
}
