package himynameisfil.com.curbyoursuspicions;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;



/**
 * Created by Fil on 2/21/2018.
 */

public class CurbYourSuspicionsDriver extends Activity {
    MediaPlayer audio;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        audio = MediaPlayer.create(this, R.raw.curb_your_enthusiasm_suspicious_glare);
        audio.start();
        new CountDownTimer(audio.getDuration(), 1000) {
            public void onTick(long milisUntilFinished) {}
            public void onFinish(){
                audio.stop();
            }

        }.start();
        finish();
        return;
    }
}
