package org.techtown.custom_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

        RadioButton rb_thin = findViewById(R.id.rb_thin); // rb_thin 버튼 찾아오기
        RadioButton rb_middle = findViewById(R.id.rb_middle); // rb_middle 버튼 찾아오기
        RadioButton rb_thick = findViewById(R.id.rb_thick); // rb_thick 버튼 찾아오기

        // 라디오 버튼 누르면 자꾸 오류나서.. 내일..하겠슴둥...
    }
}