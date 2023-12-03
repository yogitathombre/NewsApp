package com.example.newsrecy.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.newsrecy.R;
import com.example.newsrecy.adapter.MyAdapter;
import com.example.newsrecy.api.ApiClient;
import com.example.newsrecy.model.NewsApiService;
import com.example.newsrecy.model.NewsResponse;
import com.google.android.material.navigation.NavigationView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    DrawerLayout drawerLayout;

    NavigationView navigationView;
    Toolbar toolbar;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        drawerLayout=findViewById(R.id.drawer_layout);


        navigationView=findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(this);
        toolbar=findViewById(R.id.customtoolbar);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,drawerLayout,toolbar,R.string.opendrawer,R.string.closedrawer
        );

        drawerLayout.addDrawerListener(toggle);
        fragmentManager = getSupportFragmentManager();
        openFragment(new HomeFragment());

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int menuItem =item.getItemId();
        if(menuItem == R.id.homefrag)
        {
            openFragment(new HomeFragment());
        }






        drawerLayout.closeDrawer(GravityCompat.START);


        return true;

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            if(drawerLayout.isDrawerOpen(GravityCompat.START))
            {
                drawerLayout.closeDrawer(GravityCompat.START);
            }
            else
            {
                super.onBackPressed();

            }

        }

    }

    private  void openFragment(Fragment fragment)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container,fragment);
        transaction.commit();
    }
}

