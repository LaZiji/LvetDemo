package com.lzj.lvetdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvContent;
    private Button btnSubmit;
    private ListViewAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContent = (ListView) findViewById(R.id.lv_content);
        btnSubmit = (Button) findViewById(R.id.btn_submit);
        mAdapter = new ListViewAdapter(this,initData());
        lvContent.setAdapter(mAdapter);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, mAdapter.getParams()+"", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<String> initData(){
        List<String> dataList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            dataList.add("不觉危机"+i);
        }
        return dataList;
    }
}
