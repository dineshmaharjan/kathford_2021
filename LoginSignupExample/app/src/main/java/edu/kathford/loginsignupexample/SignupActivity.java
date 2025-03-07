package edu.kathford.loginsignupexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    private EditText fullNameEditText,
            mobileNumberEditText, passwordEditText;
    private Spinner countrySpinner;
    private RadioGroup genderRadioGroup;
    private CheckBox termsAndConditionCheckbox;
    private Button signupButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
        fullNameEditText= findViewById(R.id.fullNameEditText);
        mobileNumberEditText=findViewById(R.id.mobileNumberEditText);
        genderRadioGroup= findViewById(R.id.genderRadioGroup);
        countrySpinner =findViewById(R.id.countrySpinner);
        passwordEditText=findViewById(R.id.passwordEditText);
        termsAndConditionCheckbox =findViewById(R.id.termsAndConditionCheckbox);
        signupButton = findViewById(R.id.signupButton);

    }
}
