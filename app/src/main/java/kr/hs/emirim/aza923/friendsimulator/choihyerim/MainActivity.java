package kr.hs.emirim.aza923.friendsimulator.choihyerim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClick(View view){
        switch (view.getId()){
            case R.id.button1:
                Toast.makeText(this, "냐~", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "신곡 나온데", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "탄산", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "배고파", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "안돼안돼", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "뭐라고 하는지 모르겠어요", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
