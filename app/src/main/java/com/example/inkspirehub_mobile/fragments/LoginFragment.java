package com.example.inkspirehub_mobile.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.inkspirehub_mobile.MainActivity;
import com.example.inkspirehub_mobile.R;


public class LoginFragment extends Fragment {
    private static final String LOGIN_FRAGMENT = "LOGIN_FRAGMENT";
    private EditText emailText, passwordText;
    private Button loginButton;
    private TextView dontHaveAccountLogin;
    private MainActivity activity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (MainActivity) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_login, container, false);
        init(root);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginIntoSystem();
            }
        });
        dontHaveAccountLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.replaceFragment(new SignUpFragment());
            }
        });
        return root;
    }

    private void loginIntoSystem() {
        Log.i(LOGIN_FRAGMENT, "loginIntoSystem() called!!");
        final String email = emailText.getText().toString();
        final String password = passwordText.getText().toString();
        Toast.makeText(getContext(), "Successfull : " + email + "\t" + password, Toast.LENGTH_SHORT).show();
    }

    private void init(View root) {
        Log.i(LOGIN_FRAGMENT, "Widgets defined in init()");
        emailText = (EditText) root.findViewById(R.id.email_et);
        passwordText = root.findViewById(R.id.password_et);
        loginButton = root.findViewById(R.id.loginButton);
        dontHaveAccountLogin = root.findViewById(R.id.goto_signup);
    }
}