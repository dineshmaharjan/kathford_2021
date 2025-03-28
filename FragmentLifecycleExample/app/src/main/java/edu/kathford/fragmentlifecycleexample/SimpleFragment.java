package edu.kathford.fragmentlifecycleexample;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SimpleFragment extends Fragment {

    private final String TAG = "SimpleFragment";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach() callback method method");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simple,
                container,
                false);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() callback method");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated() callback method");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() callback method");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() callback method");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() callback method");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() callback method");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView() callback method");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() callback method");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach() callback method");
    }
}
