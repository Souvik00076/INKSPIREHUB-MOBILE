package com.example.inkspirehub_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.inkspirehub_mobile.fragments.LoginFragment;

public class MainActivity extends AppCompatActivity {
    private static final String MAIN = "MAIN_ACTIVITY";
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        replaceFragment(new LoginFragment());
    }

    @Override
    public void onBackPressed() {

        int backStackEntryCount = fragmentManager.getBackStackEntryCount();

        if (backStackEntryCount > 0) {
            // If there are fragments in the back stack, pop the back stack
            fragmentManager.popBackStack();
        } else {


        }
    }

    public void replaceFragment(Fragment fragment) {


        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}