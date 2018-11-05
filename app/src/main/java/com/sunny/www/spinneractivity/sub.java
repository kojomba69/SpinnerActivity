package com.sunny.www.spinneractivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class sub extends AppCompatActivity {
Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        TextView textView;

        bundle = getIntent().getExtras();
        String sun=bundle.getString("sun", "No Data");
        textView=findViewById(R.id.textView);
        textView.setText(sun);
    }
}
