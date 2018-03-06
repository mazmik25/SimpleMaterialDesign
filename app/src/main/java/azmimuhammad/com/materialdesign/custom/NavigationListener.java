package azmimuhammad.com.materialdesign.custom;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.widget.Toast;

import azmimuhammad.com.materialdesign.R;

/**
 * Created by mazmik25 on 3/5/2018.
 */

public class NavigationListener implements NavigationView.OnNavigationItemSelectedListener {
    private Activity activity;
    private DrawerLayout drawerLayout;

    public NavigationListener(Activity activity, DrawerLayout drawerLayout) {
        this.activity = activity;
        this.drawerLayout = drawerLayout;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        String item_name = (String) item.getTitle();
        Toast.makeText(activity, item_name + " Clicked", Toast.LENGTH_SHORT).show();

        drawerLayout.closeDrawer(GravityCompat.START);

        switch (item.getItemId()) {
            case R.id.save:
                //PUT SOME ACTION
            case R.id.settings:
                //PUT SOME ACTION
            case R.id.archive:
                //PUT SOME ACTION
            case R.id.camera:
                //PUT SOME ACTION
            case R.id.location:
                //PUT SOME ACTION
            case R.id.mail:
                //PUT SOME ACTION
        }
        return false;
    }
}
