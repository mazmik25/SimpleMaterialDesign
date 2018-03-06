package azmimuhammad.com.materialdesign.widget;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import azmimuhammad.com.materialdesign.R;

/**
 * Created by mazmik25 on 2/28/2018.
 */

public class FabActivity extends AppCompatActivity {
    private FloatingActionButton floatingActionButton;
    private CoordinatorLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        floatingActionButton = findViewById(R.id.fab);
        rootLayout = findViewById(R.id.rootLayout);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(rootLayout, "Simple Snackbar Example", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
