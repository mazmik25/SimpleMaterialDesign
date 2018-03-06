package azmimuhammad.com.materialdesign.appbarlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import azmimuhammad.com.materialdesign.R;

public class AppBarActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("App Bar Layout");
    }
}
