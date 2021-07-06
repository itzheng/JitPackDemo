package org.itzheng.jitpack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.itzheng.jitlib.MyJitLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.tvText);
        textView.setText(MyJitLib.WELCOME);
    }
}
