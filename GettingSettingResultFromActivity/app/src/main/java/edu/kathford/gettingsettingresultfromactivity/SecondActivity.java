package edu.kathford.gettingsettingresultfromactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView fullNameTextView;
    private Button sendBackButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        fullNameTextView = findViewById(R.id.fullNameTextView);
        sendBackButton = findViewById(R.id.sendResultBackButton);

        Intent intent = getIntent();
        String fullName = intent.getStringExtra("fullName");
        fullNameTextView.setText(fullName);

        sendBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.putExtra("result", "Data pass success");
                setResult(201, intent1);
                finish();
            }
        });
    }
}
