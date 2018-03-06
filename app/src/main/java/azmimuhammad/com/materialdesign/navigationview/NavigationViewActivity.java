package azmimuhammad.com.materialdesign.navigationview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import azmimuhammad.com.materialdesign.MainActivity;
import azmimuhammad.com.materialdesign.R;
import azmimuhammad.com.materialdesign.feedback.AnimationActivity;
import azmimuhammad.com.materialdesign.login.LoginActivity;
import azmimuhammad.com.materialdesign.widget.ToolbarActivity;

public class NavigationViewActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_view);
        toolbar = findViewById(R.id.toolbar);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        toolbar.setTitle("Navigation View");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NavigationViewActivity.this, SimpleNavigationViewActivity.class));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NavigationViewActivity.this, GroupNavigationViewActivity.class));
            }
        });
    }
}
