package com.example.e.combawaychenqing0710;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private AddDecView adv;
    private Button btnGet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adv = (AddDecView) findViewById(R.id.adv);

//        adv.setCount(10);
        adv.setListener(new AddDecView.onClickLisner() {
            @Override
            public void onClick(int count) {
                Toast.makeText(MainActivity.this,"自定义view的当前值是",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
