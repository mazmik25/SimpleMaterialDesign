package azmimuhammad.com.materialdesign.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import azmimuhammad.com.materialdesign.R;

public class ActionBarActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_tutorial);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Action Bar Toolbar!");
        toolbar.setSubtitle("by mazmik25");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save:
                msg = item.getTitle().toString();
                break;
            case R.id.settings:
                msg = item.getTitle().toString();
                break;
            case R.id.email:
                msg = item.getTitle().toString();
                break;
            case R.id.camera:
                msg = item.getTitle().toString();
                break;
            case R.id.web_search:
                msg = item.getTitle().toString();
                break;
            case R.id.help:
                msg = item.getTitle().toString();
                break;
            default:
                break;
        }

        Toast.makeText(this, msg + " Selected!", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
