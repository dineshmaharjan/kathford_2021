package edu.kathford.fragmentexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CalculationFragment extends Fragment {
    private EditText firstNumberEditText,
            secondNumberEditText;
    private TextView resultTextView;
    private Button actionButton;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calculation_fragment,
                container, false);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        firstNumberEditText = view.findViewById(R.id.firstNumberEditText);
        secondNumberEditText = view.findViewById(R.id.secondNumberEditText);
        resultTextView = view.findViewById(R.id.resultTextView);
        actionButton = view.findViewById(R.id.actionButton);

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberEditText
                        .getText().toString().trim());
                int secondNumber = Integer.parseInt(secondNumberEditText
                        .getText().toString().trim());

                int sum =firstNumber+secondNumber;

                resultTextView.setText("Result is "+sum);
            }
        });
    }
}
