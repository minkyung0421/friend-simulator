package kr.hs.emirim.aza923.friendsimulator.choihyerim;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "친구 시뮬레이터 : MainActivity";
    private ImageView mImageViewFriendVisual;
    private MediaPlayer mMediaPlayer; //m -> 멤버변수
    private Vibrator mVib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate 메소드 호출");
        setContentView(R.layout.activity_main);
        mImageViewFriendVisual = (ImageView) findViewById(R.id.friend_visual);
        Log.d(TAG, "activity_main 레이아웃 세팅");
        mMediaPlayer = MediaPlayer.create(this, R.raw.m5);
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();
        mVib = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        mVib.vibrate(1000);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMediaPlayer.pause();
        mMediaPlayer.stop();
    }

    void onClick(View view) {
        Log.d(TAG, "onClick 메소드 호출");
        Log.d(TAG, "클릭된 뷰 id: " + view.getId());
        mVib.vibrate(1000);
        if (mMediaPlayer.isPlaying()) {
            mMediaPlayer.pause();
        }
        switch (view.getId()) {
            case R.id.button1:
                Log.d(TAG, "button1 click");
                mImageViewFriendVisual.setImageResource(R.drawable.p3);
                Toast.makeText(this, "자냐?", Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.m4);
                mMediaPlayer.start();
                break;
            case R.id.button2:
                Log.d(TAG, "button2 click");
                mImageViewFriendVisual.setImageResource(R.drawable.p4);
                Toast.makeText(this, "신곡 나온데", Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.m2);
                mMediaPlayer.start();
                break;
            case R.id.button3:
                Log.d(TAG, "button3 click");
                mImageViewFriendVisual.setImageResource(R.drawable.p2);
                Toast.makeText(this, "탄산", Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.m5);
                mMediaPlayer.start();
                break;
            case R.id.button4:
                Log.d(TAG, "button4 click");
                mImageViewFriendVisual.setImageResource(R.drawable.p1);
                Toast.makeText(this, "배고파", Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.m1);
                mMediaPlayer.start();
                break;
            case R.id.button5:
                Log.d(TAG, "button5 click");
                mImageViewFriendVisual.setImageResource(R.drawable.p5);
                Toast.makeText(this, "아니야", Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.m3);
                mMediaPlayer.start();
                break;
            default:
                Log.d(TAG, "error click");
                Toast.makeText(this, "뭐라고 하는지 모르겠어요", Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.m5);
                mMediaPlayer.start();
                break;
        }
        Log.d(TAG, "onClick 메소드 종료");
    }
}
