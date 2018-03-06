package azmimuhammad.com.materialdesign.appbarlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import azmimuhammad.com.materialdesign.R;

public class MainAppBarActivity extends AppCompatActivity {
    private Button button1, button2;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app_bar);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("App Bar Layout");

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainAppBarActivity.this, AppBarActivity.class));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainAppBarActivity.this, AppBarImageActivity.class));
            }
        });
    }
}
