package edu.kathford.dialogexample;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("MissingInflatedId")
public class MainActivity extends AppCompatActivity {

    private Button logoutButton,
            dialogFragmentButton,
            customDialogButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logoutButton = findViewById(R.id.logoutButton);
        dialogFragmentButton = findViewById(R.id.dialogFragmentButton);
        customDialogButton = findViewById(R.id.customDialogButton);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this);

                builder.setCancelable(false);
                builder.setTitle("Logout");
                builder.setMessage("Are you sure want to logout?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        dialogFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogoutDialogFragment logoutDialogFragment =
                        new LogoutDialogFragment();
                logoutDialogFragment.show(getSupportFragmentManager(),
                        "LogoutDialog");
            }
        });

        customDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this);

                View view = getLayoutInflater().inflate(R.layout.dialog_calculation,
                        null);
                EditText firstNumberEditText = view.findViewById(R.id.firstNumberEditText);
                EditText secondNumberEditText = view.findViewById(R.id.secondNumberEditText);
                TextView resultTextView = view.findViewById(R.id.resultTextView);
                Button calculationButton = view.findViewById(R.id.calculationButton);

                calculationButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int first = Integer.parseInt(firstNumberEditText.getText().toString());
                        int second = Integer.parseInt(secondNumberEditText.getText().toString());

                        int sum = first + second;

                        resultTextView.setText("Result is: "+sum);
                    }
                });

                builder.setView(view);
                AlertDialog alertDialog =builder.create();
                alertDialog.show();
            }
        });
    }
}
