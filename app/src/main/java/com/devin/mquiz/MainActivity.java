package com.devin.mquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ShareActionProvider;

public class MainActivity extends AppCompatActivity {
     ImageButton playbtn,sharebtn,likebtmn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playbtn=findViewById(R.id.play);
        sharebtn=findViewById(R.id.share);
        likebtmn=findViewById(R.id.like);


        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent=new Intent(Intent.ACTION_SEND);
            String subBody="This is Test";
            String subject="This is Test";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,subBody);
            startActivity(Intent.createChooser(intent,"Share Using"));

            }
        });
    }
}