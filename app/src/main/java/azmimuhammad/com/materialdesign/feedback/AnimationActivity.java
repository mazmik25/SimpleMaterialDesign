package azmimuhammad.com.materialdesign.feedback;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Slide;
import android.util.Pair;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import azmimuhammad.com.materialdesign.R;
import azmimuhammad.com.materialdesign.custom.Utils;

public class AnimationActivity extends AppCompatActivity {
    private Button rippleEffect, explodeWithJava, explodeWithXML,
            slideWithJava, slideWithXML, fadeWithJava, fadeWithXML;
    private Toolbar toolbar;
    private ImageView imgLogo, imgClose;
    private TextView txtLogoName;
    private ActivityOptions options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Animations");
        rippleEffect = findViewById(R.id.rippleEffect);
        imgLogo = findViewById(R.id.logo);
        imgClose = findViewById(R.id.close);
        txtLogoName = findViewById(R.id.txtLogoName);

        explodeWithJava = findViewById(R.id.explodeAnimationWithJava);
        explodeWithXML = findViewById(R.id.explodeAnimationXML);

        slideWithJava = findViewById(R.id.slideAnimationWithJava);
        slideWithXML = findViewById(R.id.slideAnimationXML);

        fadeWithJava = findViewById(R.id.fadeAnimationWithJava);
        fadeWithXML = findViewById(R.id.fadeAnimationXML);

        rippleEffect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnimationActivity.this, RippleActivity.class));
            }
        });

        setupAnimation();
    }

    private void setupAnimation() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Slide slide = new Slide();
            slide.setSlideEdge(Gravity.LEFT);
            slide.setDuration(getResources().getInteger(R.integer.anim_duration_long));
            getWindow().setEnterTransition(slide);

            getWindow().setExitTransition(slide);

            //use this method to perform overlapping layout when this activity is resumed
            getWindow().setAllowEnterTransitionOverlap(false);
        }
    }

    public void sharedElement(View view) {
        Intent intent = new Intent(this, SharedElementActivity.class);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Pair[] pair = new Pair[3];
            pair[0] = new Pair<View, String>(imgLogo, "logo_shared");
            pair[1] = new Pair<View, String>(imgClose, "logo_close");
            pair[2] = new Pair<View, String>(txtLogoName, "logo_name");
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this, pair);
            startActivity(intent, options.toBundle());
        } else
            startActivity(intent);
    }

    public void transitionAnimition(View view) {
        Intent intent = new Intent(this, TransitionActivity.class);
        switch (view.getId()) {
            case R.id.explodeAnimationWithJava:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options = ActivityOptions.makeSceneTransitionAnimation(this);
                    intent.putExtra(Utils.KEY_TITLE, "Explode By Java");
                    intent.putExtra(Utils.KEY_ANIM_TYPE, Utils.TransitionType.ExplodeJava);
                    startActivity(intent, options.toBundle());
                } else
                    startActivity(intent);
                break;
            case R.id.explodeAnimationXML:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options = ActivityOptions.makeSceneTransitionAnimation(this);
                    intent.putExtra(Utils.KEY_TITLE, "Explode By XML");
                    intent.putExtra(Utils.KEY_ANIM_TYPE, Utils.TransitionType.ExplodeXML);
                    startActivity(intent, options.toBundle());
                } else
                    startActivity(intent);
                break;
            case R.id.slideAnimationWithJava:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options = ActivityOptions.makeSceneTransitionAnimation(this);
                    intent.putExtra(Utils.KEY_TITLE, "Slide By Java");
                    intent.putExtra(Utils.KEY_ANIM_TYPE, Utils.TransitionType.SlideJava);
                    startActivity(intent, options.toBundle());
                } else
                    startActivity(intent);
                break;
            case R.id.slideAnimationXML:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options = ActivityOptions.makeSceneTransitionAnimation(this);
                    intent.putExtra(Utils.KEY_TITLE, "Slide By XML");
                    intent.putExtra(Utils.KEY_ANIM_TYPE, Utils.TransitionType.SlideXML);
                    startActivity(intent, options.toBundle());
                } else
                    startActivity(intent);
                break;

            case R.id.fadeAnimationWithJava:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options = ActivityOptions.makeSceneTransitionAnimation(this);
                    intent.putExtra(Utils.KEY_TITLE, "Fade By Java");
                    intent.putExtra(Utils.KEY_ANIM_TYPE, Utils.TransitionType.FadeJava);
                    startActivity(intent, options.toBundle());
                } else
                    startActivity(intent);
                break;
            case R.id.fadeAnimationXML:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    options = ActivityOptions.makeSceneTransitionAnimation(this);
                    intent.putExtra(Utils.KEY_TITLE, "Fade By XML");
                    intent.putExtra(Utils.KEY_ANIM_TYPE, Utils.TransitionType.FadeXML);
                    startActivity(intent, options.toBundle());
                } else
                    startActivity(intent);
                break;
        }
    }
}
