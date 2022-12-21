package org.changheon.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
// androidx는 새로운 버전이다. 전 시리즈와의 호환을 위해서는 예전 버전의 라이브러리로 자동변환을 해줘야한다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}