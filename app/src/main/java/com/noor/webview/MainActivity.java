package com.noor.webview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnWeb1,btnWeb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWeb1=(Button)findViewById(R.id.btn_web1);
        btnWeb2=(Button)findViewById(R.id.btn_web2);

        btnWeb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,LoadWeb.class);
                intent.putExtra("data","1");
                startActivity(intent);

            }
        });



        btnWeb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,LoadWeb.class);
                intent.putExtra("data","2");
                startActivity(intent);


            }
        });
    }
}
