package azmimuhammad.com.materialdesign.widget;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import azmimuhammad.com.materialdesign.R;

public class StandAloneActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_tutorial);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Standalone Toolbar");
        toolbar.setSubtitle("by mazmik25");
        toolbar.setNavigationIcon(R.drawable.ic_close);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //TO DO: write logic
            toolbar.setElevation(10f);
        }

        toolbar.inflateMenu(R.menu.menu_options);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String title = (String) item.getTitle();
                Toast.makeText(StandAloneActivity.this, title + " Selected",
                        Toast.LENGTH_SHORT).show();
                switch (item.getItemId()) {
                    case R.id.save:
                        //DO ACTIONS
                        break;
                    case R.id.settings:
                        //DO ACTIONS
                        break;
                    //etc
                }
                return true;
            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, ToolbarActivity.class));
    }
}
