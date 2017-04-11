package kr.hs.emirim.aza923.friendsimulator.choihyerim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "친구 시뮬레이터 : MainActivity";
    private ImageView mImageViewFriendVisual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       Log.d(TAG,"onCreate 메소드 호출");
        setContentView(R.layout.activity_main);
        mImageViewFriendVisual = (ImageView)findViewById(R.id.friend_visual);
        Log.d(TAG,"activity_main 레이아웃 세팅");
    }

    void onClick(View view){
        Log.d(TAG,"onClick 메소드 호출");
        Log.d(TAG,"클릭된 뷰 id: "+view.getId());
        switch (view.getId()){
            case R.id.button1:
                Log.d(TAG,"button1 click");
                Toast.makeText(this, "자냐?", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Log.d(TAG,"button2 click");
                Toast.makeText(this, "신곡 나온데", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Log.d(TAG,"button3 click");
                Toast.makeText(this, "탄산", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Log.d(TAG,"button4 click");
                Toast.makeText(this, "배고파", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Log.d(TAG,"button5 click");
                Toast.makeText(this, "아니야", Toast.LENGTH_SHORT).show();
                break;
            default:
                Log.d(TAG,"error click");
                Toast.makeText(this, "뭐라고 하는지 모르겠어요", Toast.LENGTH_SHORT).show();
                break;
        }
        Log.d(TAG,"onClick 메소드 종료");
    }
}
