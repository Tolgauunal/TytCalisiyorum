package com.tolgaunal.tytcaslisiyorum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Derslerim.Derslerim;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Home.HomeFragment;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.Profil.Profil;
import com.tolgaunal.tytcaslisiyorum.ChipNavigation.TestlerNavigation.TestlerFragment;
import com.tolgaunal.tytcaslisiyorum.databinding.ActivityMainBinding;

public class HomeActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    FrameLayout frameLayout;
    HomeFragment homeFragment;
    ChipNavigationBar chipNavigationBar;
    Profil profil;
    Derslerim derslerim;
    TestlerFragment testlerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        frameLayout = binding.fragmentContainer;
        homeFragment = new HomeFragment();
        profil = new Profil();
        derslerim = new Derslerim();
        testlerFragment = new TestlerFragment();
        setFragment(homeFragment);
        chipNavigationBar = binding.bottomNavMenu;
        chipNavigationBar.setItemSelected(R.id.chipNavHome, true);
        chipNavigationBar.setOnItemSelectedListener(i -> {
            switch (i) {
                case R.id.chipNavHome:
                    setFragment(homeFragment);
                    break;
                case R.id.chipNavUser:
                    setFragment(profil);
                    break;
                case R.id.chipDerslerim:
                    setFragment(derslerim);
                    break;
                case R.id.chipNavTestler:
                    setFragment(testlerFragment);
                    break;
            }
        });
        Intent intent = getIntent();
        String gelenIntentDeger = intent.getStringExtra("intentDeger");
        if (gelenIntentDeger != null) {
            switch (gelenIntentDeger) {
                case "Test":
                    setFragment(testlerFragment);
                    chipNavigationBar.setItemSelected(R.id.chipNavTestler, true);
                    break;
                case "homeFragment":
                    setFragment(homeFragment);
                    chipNavigationBar.setItemSelected(R.id.chipNavHome, true);
                    break;
                case "chipNavUser":
                    setFragment(profil);
                    chipNavigationBar.setItemSelected(R.id.chipNavUser, true);
                    break;
                case "chipDerslerim":
                    setFragment(derslerim);
                    chipNavigationBar.setItemSelected(R.id.chipDerslerim, true);
                    break;
            }
        }
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}