package azmimuhammad.com.materialdesign.widget;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import azmimuhammad.com.materialdesign.R;

public class SnackBarActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private CoordinatorLayout rootLayout;
    private Snackbar snackbar;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);

        floatingActionButton = findViewById(R.id.fab);
        rootLayout = findViewById(R.id.rootLayout);
        toolbar = findViewById(R.id.toolbar);

        floatingActionButton.setVisibility(View.GONE);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Snackbar Menu");
        toolbar.setSubtitle("by mazmik25");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_snackbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.simple_snackbar:
                showSimpleSnackBar();
                break;
            case R.id.snackbar_action_callback:
                showSnackbarActionCallback();
                break;
            case R.id.custom_snackbar:
                showCustomSnackbar();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showSimpleSnackBar() {
        Snackbar.make(rootLayout, "Simple Snackbar Example", Snackbar.LENGTH_SHORT).show();
    }

    private void showSnackbarActionCallback() {
        snackbar = Snackbar.make(rootLayout, "File deleted", Snackbar.LENGTH_LONG);
        snackbar.setAction("UNDO", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(rootLayout, "File recovered", Snackbar.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }

    private void showCustomSnackbar() {

    }
}
