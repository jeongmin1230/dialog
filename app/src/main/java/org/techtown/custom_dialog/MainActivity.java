package org.techtown.custom_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Dialog custom_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        custom_dialog = new Dialog(MainActivity.this); // Dialog 초기화
        custom_dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // 타이틀 제거
        custom_dialog.setContentView(R.layout.custom_dialog); // 만든 custom dialog 랑 연결
    }

    public void onClickShowDialog(View view) {
        custom_dialog.show(); // 다이얼로그 띄우기

        }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rb_thin: //가늘게 버튼을 눌렀을 때
                Toast.makeText(getApplicationContext(), "press rb_thin", Toast.LENGTH_SHORT).show();
                break;

            case R.id.rb_middle: //중간 버튼을 눌렀을 때
                Toast.makeText(getApplicationContext(), "press rb_middle", Toast.LENGTH_SHORT).show();
                break;

            case R.id.rb_thick: //두껍게 버튼을 눌렀을 때
                Toast.makeText(getApplicationContext(), "press rb_thick", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}