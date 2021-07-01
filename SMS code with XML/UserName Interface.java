package com.example.gateotp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //    EditText name;
    CheckBox remember;
    public static final String EXTRA_NAME = "com.example.gateotp.extra.Name";
    EditText name;
    Button login;
    String st;
    String atst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.Name);
        login = findViewById(R.id.button);
        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);
        SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
        String st1 = preferences.getString("st", "");
        name.setText(st1);
        String checkbox = preferences.getString("remember", "");
        

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String nameText = name.getText().toString();
                intent.putExtra(EXTRA_NAME, nameText);
                SharedPreferences preferences = getSharedPreferences("checkbox", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("remember", "true");
                st = name.getText().toString();
                atst=st;
                editor.putString("st", st);
                editor.apply();
                startActivity(intent);
            }
        });
//        remember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(buttonView.isChecked()){
//                    SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
//                    SharedPreferences.Editor editor=preferences.edit();
//                    editor.putString("remember","true");
//                    st=name.getText().toString();
//                    editor.putString("st",st);
//                    editor.apply();
//                    Toast.makeText(MainActivity.this, "CHECKED", Toast.LENGTH_SHORT).show();
//
//
//                }else if (!buttonView.isChecked()){
//                    SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
//                    SharedPreferences.Editor editor=preferences.edit();
//                    editor.putString("remember","false");
//                    editor.apply();
//                    Toast.makeText(MainActivity.this, "UNCHECKED", Toast.LENGTH_SHORT).show();
//
//                }
    }
}




