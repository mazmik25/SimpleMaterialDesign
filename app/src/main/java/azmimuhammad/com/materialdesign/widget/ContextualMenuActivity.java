package azmimuhammad.com.materialdesign.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import azmimuhammad.com.materialdesign.R;
import azmimuhammad.com.materialdesign.custom.ContextualCallback;

public class ContextualMenuActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button button;
    private ActionMode actionMode;
    private ContextualCallback contextualCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_menu);
        toolbar = findViewById(R.id.toolbar);
        button = findViewById(R.id.button);
        contextualCallback = new ContextualCallback();

        toolbar.setTitle("Standalone Toolbar");
        toolbar.setSubtitle("by mazmik25");
        toolbar.inflateMenu(R.menu.menu_options);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String title = item.getTitle().toString();
                Toast.makeText(ContextualMenuActivity.this, title + " Selected!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionMode = ContextualMenuActivity.this.startActionMode(contextualCallback);
            }
        });
    }
}
