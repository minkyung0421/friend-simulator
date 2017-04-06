package kr.hs.emirim.aza923.friendsimulator.choihyerim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    voic onClick(Viwe view){
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }
}
