package com.sunny.www.spinneractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String> (this,android.R.layout.simple_spinner_item,list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        String selected = ((TextView)view).getText().toString();
        String text = adapterView.getItemAtPosition(position).toString();

        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();

        long item_id = adapterView.getSelectedItemId();
        Bundle bundle = new Bundle();
        bundle.putString("sun", text);
        Intent intent = new Intent(this, sub.class);
        intent.putExtras(bundle);
        startActivity(intent);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
