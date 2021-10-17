package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static String TAG="AppCallLink";
    Button btnalamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void maps (View view) {
        Uri uri = Uri.parse("geo:-2.707549, 111.644462");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
}