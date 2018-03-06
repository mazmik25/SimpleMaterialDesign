package azmimuhammad.com.materialdesign.feedback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import azmimuhammad.com.materialdesign.R;

public class RippleActivity extends AppCompatActivity {
    private TextView txtRippleWithBorder, txtRippleWithoutBorder,
            txtCustomRippleWithBorder, txtCustomRippleWithoutBorder;
    private android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Ripple Animations");
    }

    public void dummyClick(View view) {
        //in order to activate Ripple effect, we need to specift the onClick event
        //try to delete this method, and see what happen
    }
}
