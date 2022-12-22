package org.changheon.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity {
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
//        삽입할 부분인 container
        container = findViewById(R.id.container);
//        button을 누르면 sub 페이지가 나오게 설정
        Button button = findViewById((R.id.button));
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                inflater를 이용하여 sub1을 container에 붙이도록 하고 checkBox가 나오게 한다.
                LayoutInflater inflater = (LayoutInflater)
                        getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                inflater.inflate(R.layout.sub1, container, true);
                CheckBox checkBox = container.findViewById(R.id.checkBox);
                checkBox.setText("로딩되었어요.");
            }
        });
    }
}