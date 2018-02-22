package himynameisfil.com.curbyourendings;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CurbYourEndings extends Activity {
    MediaPlayer audio;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        audio = MediaPlayer.create(this, R.raw.curb_your_enthusiasm_end);
        audio.start();
        new CountDownTimer(26100, 1000) {
            public void onTick(long milisUntilFinished) {}
            public void onFinish(){
                audio.stop();
            }

        }.start();
        finish();
        return;
    }
}
