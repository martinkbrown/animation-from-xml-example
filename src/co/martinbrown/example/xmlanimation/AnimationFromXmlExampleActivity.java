package co.martinbrown.example.xmlanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class AnimationFromXmlExampleActivity extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button = (Button) findViewById(R.id.button1);

        Animation rotateAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.full_rotate);
        button.setAnimation(rotateAnim);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Animation rotateAnim;
                rotateAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.full_rotate);
                button.setAnimation(rotateAnim);
            }
        });
    }
}