package edu.kathford.loginsignupexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button signInButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        signInButton = findViewById(R.id.signInButton);


        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText()
                        .toString().trim();
                String password = passwordEditText.getText()
                        .toString().trim();

//           validationOne(username,password);
                validationTwo(username, password);


                Log.d("Username", username);
                Log.d("Password", password);
//                Toast.makeText(LoginActivity.this,
//                        "Sign-in button clicked",
//                        Toast.LENGTH_LONG).show();

            }
        });


    }


    private void validationOne(String username,
                               String password) {

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(LoginActivity.this,
                    "Invalid username or password",
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(LoginActivity.this,
                    "Login success",
                    Toast.LENGTH_LONG).show();
            ;
        }
    }

    private void validationTwo(String username,
                               String password) {
        if (username.isEmpty()) {
            usernameEditText.setError("Invalid username");
        } else {
            if (password.isEmpty()) {
                passwordEditText.setError("Invalid password");
            } else {
                Toast.makeText(LoginActivity.this,
                        "Login Successful", Toast.LENGTH_LONG).show();
                ;
            }
        }
    }

}
