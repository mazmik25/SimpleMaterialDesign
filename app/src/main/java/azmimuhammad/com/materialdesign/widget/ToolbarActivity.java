package azmimuhammad.com.materialdesign.widget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import azmimuhammad.com.materialdesign.R;

public class ToolbarActivity extends AppCompatActivity{
    private Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        btn1 = findViewById(R.id.standAloneToolbar);
        btn2 = findViewById(R.id.actionBarToolbar);
        btn3 = findViewById(R.id.contextualMenu);
        btn4 = findViewById(R.id.snackBarMenu);
        btn5 = findViewById(R.id.fabMenu);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ToolbarActivity.this, StandAloneActivity.class));
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ToolbarActivity.this, ActionBarActivity.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ToolbarActivity.this, ContextualMenuActivity.class));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ToolbarActivity.this, SnackBarActivity.class));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ToolbarActivity.this, FabActivity.class));
            }
        });
    }
}
