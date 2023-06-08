package com.example.inkspirehub_mobile.fragments;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.inkspirehub_mobile.R;

public class SignUpFragment extends Fragment {
    private static final String SIGNUP_FRAGMENT = "SIGNUP_FRAGMENT";
    private EditText emailText, passwordText, confirmPasswordText;
    private Button signUpButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_sign_up, container, false);
        init(root);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUpIntoSystem();
            }
        });
        return root;
    }

    private void signUpIntoSystem() {
        Log.i(SIGNUP_FRAGMENT, "signUpIntoSystem() called!!");
        final String email = emailText.getText().toString();
        final String password = passwordText.getText().toString();
        final String confirmPassword = confirmPasswordText.getText().toString();
        Toast.makeText(getContext(), email + "\n" + password + "\n" + confirmPassword, Toast.LENGTH_SHORT)
                .show();
    }

    private void init(View root) {
        Log.i(SIGNUP_FRAGMENT, "widgets defined in init()");
        emailText = root.findViewById(R.id.email_et);
        passwordText = root.findViewById(R.id.password_et);
        confirmPasswordText = root.findViewById(R.id.confirm_password_et);
        signUpButton = root.findViewById(R.id.signUpButton);

    }
}