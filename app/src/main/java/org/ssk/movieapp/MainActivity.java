package org.ssk.movieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer heartcnt = 0;
    TextView hearttext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heartcnt = 200;
        hearttext = (TextView) findViewById(R.id.hearttext);
        hearttext.setText(heartcnt.toString());
    }

    public void onClick_HeartBtn(View v)
    {
        heartcnt++;
        hearttext.setText(heartcnt.toString());

        Toast.makeText(getApplicationContext(),"하트를 주셨습니다.",Toast.LENGTH_SHORT).show();
    }

    public void onClickedWrite(View v)
    {
        Toast.makeText(getApplicationContext(),"작성하기 클릭",Toast.LENGTH_SHORT).show();
    }

    public void onClickedAllView(View v)
    {
        Toast.makeText(getApplicationContext(),"모두보기 클릭",Toast.LENGTH_SHORT).show();
    }

    public void onClickedFacebook(View v)
    {
        Toast.makeText(getApplicationContext(),"페이스북 클릭",Toast.LENGTH_SHORT).show();
    }

    public void onClickedKakao(View v)
    {
        Toast.makeText(getApplicationContext(),"카카오 클릭",Toast.LENGTH_SHORT).show();
    }

    public void onClickedGive(View v)
    {
        Toast.makeText(getApplicationContext(),"예매하기 클릭",Toast.LENGTH_SHORT).show();
    }


}
