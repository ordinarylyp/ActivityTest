package com.lyp.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1=(Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(FirstActivity.this,"你在点按钮1",Toast.LENGTH_SHORT).show();
//                finish();//结束当前活动
/*                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);显示Intent 启动SecondActivity*/
               Intent intent=new Intent("com.lyp.activitytest.ACTION_START");
               intent.addCategory("com.lyp.activitytest.MY_CATEGORY");
                startActivity(intent);  /*隐式intent SecondActivity */

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "你在点击Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "你在点击Remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}

