package azmimuhammad.com.materialdesign.feedback;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import azmimuhammad.com.materialdesign.R;

public class SharedElementActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView txtInfo;
    private Button exit;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //specify this before running setContentView()
        //try to move it below setContentView and see what happen
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_element);
        toolbar = findViewById(R.id.toolbar);
        exit = findViewById(R.id.button2);
        txtInfo = findViewById(R.id.txtInfo);
        constraintLayout = findViewById(R.id.circularAnimation);
        constraintLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                makeCircularAnimation(constraintLayout);
                return true;
            }
        });

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Shared Elements");

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    finishAfterTransition();
                }
            }
        });
    }

    private void makeCircularAnimation(View view) {
        int centerX = (view.getLeft() + view.getRight()) / 2;
        int centerY = (view.getTop() + view.getBottom()) / 2;
        float radius = Math.max(txtInfo.getWidth(), txtInfo.getHeight()) * 2.0f;
        if (txtInfo.getVisibility() == View.INVISIBLE) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                txtInfo.setVisibility(View.VISIBLE);
                txtInfo.setText("Welcome to circular animation");
                ViewAnimationUtils.createCircularReveal(txtInfo, centerX, centerY, 0, radius).start();
            }
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Animator reveal = ViewAnimationUtils.createCircularReveal(txtInfo, centerX, centerY, radius, 0);
                reveal.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animation) {
                        txtInfo.setVisibility(View.INVISIBLE);
                    }
                });
                reveal.start();
            }
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            onBackPressed();
        }
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAfterTransition();
        }
        super.onBackPressed();
    }
}
