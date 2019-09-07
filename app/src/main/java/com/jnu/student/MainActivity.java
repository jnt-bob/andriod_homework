package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView hello_android;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello_android=(TextView)findViewById(R.id.text_view_hello_world);
        String hello=this.getString(R.string.hello_android);
        hello_android.setText(hello);
    }
}
