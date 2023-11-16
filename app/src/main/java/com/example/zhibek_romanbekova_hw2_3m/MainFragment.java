package com.example.zhibek_romanbekova_hw2_3m;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    private TextView textView;
    private Button plus_btn;
    private Button minus_btn;

    private int currentValue = 0;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        textView = view.findViewById(R.id.textView);
        plus_btn = view.findViewById(R.id.plus_btn);
        minus_btn = view.findViewById(R.id.minus_btn);

        updateText();

        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue++;
                updateText();
            }
        });

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue--;
                updateText();
            }
        });

        return view;
    }

    private void updateText() {
        if (textView != null) {
            textView.setText(String.valueOf(currentValue));
        }
    }
}