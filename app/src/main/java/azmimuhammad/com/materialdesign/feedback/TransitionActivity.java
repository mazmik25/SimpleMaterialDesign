package azmimuhammad.com.materialdesign.feedback;

import android.os.Build;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import azmimuhammad.com.materialdesign.R;
import azmimuhammad.com.materialdesign.custom.Utils;

public class TransitionActivity extends AppCompatActivity {
    private Utils.TransitionType type;
    private String titleToolbar;
    private Toolbar toolbar;

    private ImageView imgLogo, imgClose;
    private TextView txtLogoName;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //specify this before running setContentView()
        //try to move it below setContentView and see what happen
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

        imgLogo = findViewById(R.id.logo);
        txtLogoName = findViewById(R.id.txtTitle);
        imgClose = findViewById(R.id.close);
        toolbar = findViewById(R.id.toolbar);
        exit = findViewById(R.id.button2);

        type = (Utils.TransitionType) getIntent().getSerializableExtra(Utils.KEY_ANIM_TYPE);
        titleToolbar = getIntent().getExtras().getString(Utils.KEY_TITLE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(titleToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        initAnimation();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setAllowEnterTransitionOverlap(false);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //membalik alur transisi
            finishAfterTransition();
        }
        super.onBackPressed();
    }

    private void initAnimation() {
        switch (type) {
            case ExplodeJava:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Explode explode = new Explode();
                    explode.setDuration(getResources().getInteger(R.integer.anim_duration_long));
                    getWindow().setEnterTransition(explode);
                    break;
                }
            case ExplodeXML:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.explode);
                    getWindow().setEnterTransition(transition);
                    break;
                }
            case SlideJava:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Slide slide = new Slide();
                    slide.setSlideEdge(Gravity.RIGHT);
                    slide.setDuration(getResources().getInteger(R.integer.anim_duration_long));
                    slide.setInterpolator(new FastOutSlowInInterpolator());
                    getWindow().setEnterTransition(slide);
                    break;
                }
            case SlideXML:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.slide);
                    getWindow().setEnterTransition(transition);
                    break;
                }
            case FadeJava:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Fade fade = new Fade();
                    fade.setDuration(getResources().getInteger(R.integer.anim_duration_medium));
                    getWindow().setEnterTransition(fade);
                    break;
                }
            case FadeXML:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.fade);
                    getWindow().setEnterTransition(transition);
                    break;
                }
        }
    }
}
