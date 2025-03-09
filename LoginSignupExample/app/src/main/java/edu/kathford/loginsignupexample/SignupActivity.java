package edu.kathford.loginsignupexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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

    private String gender;
    private boolean termsAndCondition;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
        fullNameEditText = findViewById(R.id.fullNameEditText);
        mobileNumberEditText = findViewById(R.id.mobileNumberEditText);
        genderRadioGroup = findViewById(R.id.genderRadioGroup);
        countrySpinner = findViewById(R.id.countrySpinner);
        passwordEditText = findViewById(R.id.passwordEditText);
        termsAndConditionCheckbox = findViewById(R.id.termsAndConditionCheckbox);
        signupButton = findViewById(R.id.signupButton);

        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group,
                                         int checkedId) {
                    if(checkedId == R.id.maleRadioButton){
                        gender= "Male";
                    }else if(checkedId == R.id.femaleRadioButton){
                        gender= "Female";
                    }else{
                        gender= "Others";
                    }

            }
        });

        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                //string array value
//                String[] country= new String[]{getString(R.array.country)};
//                country.get(position);
                //array position value retrieve
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        termsAndConditionCheckbox.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {
                        termsAndCondition=isChecked;
                    }
                }
        );
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullName = fullNameEditText.getText().toString().trim();
                String mobileNumber = mobileNumberEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                Log.d("Full Name", fullName);
                Log.d("Mobile Number", mobileNumber);
                Log.d("Password", password);
                Log.d("Gender", gender);
                Log.d("Terms and condition", String.valueOf(termsAndCondition));
            }
        });

    }
}
