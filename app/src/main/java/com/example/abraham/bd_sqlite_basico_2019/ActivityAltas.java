package com.example.abraham.bd_sqlite_basico_2019;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class ActivityAltas extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altas);
    }

    public void abrirAltas(View v){
       switch (v.getId()){
           case R.id.btn_alta:
               Intent i= new Intent(this,ActivityAltas.class);
               startActivity(i);
               break;
       }
    }
}
