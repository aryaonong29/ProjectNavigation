package com.arianasp.projectnavigation;

/**
 * Created by mycomputer on 19/09/16.
 */

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class BaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    protected RelativeLayout fullLayout;
    protected FrameLayout frameLayout;
//    public LinearLayout containerDestacado;
    @Override
    public void setContentView(int layoutResID) {

        fullLayout = (RelativeLayout) getLayoutInflater().inflate(R.layout.base_activity, null);
        frameLayout = (FrameLayout) fullLayout.findViewById(R.id.drawer_frame);

        getLayoutInflater().inflate(layoutResID, frameLayout, true);

        super.setContentView(fullLayout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.nav_home:
                Intent home = new Intent(this, Home.class);
                startActivity(home);
                break;
            case R.id.nav_profile:
                Intent profile = new Intent(this, Profile.class);
                startActivity(profile);
                break;
            case R.id.nav_contact:
                Intent contact = new Intent(this, Contact.class);
                startActivity(contact);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
