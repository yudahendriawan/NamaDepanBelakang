package com.example.Welcome;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btnOK;
    private EditText Nama,Nama1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nama = (EditText)
                findViewById(R.id.etNama);
        Nama1 = (EditText) findViewById(R.id.etNama1);
        btnOK = (Button) findViewById(R.id.btnOK);
        btnOK.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Selamat Datang");
        alertDialog.setMessage("Halo, "+Nama.getText().toString()+" "+Nama1.getText().toString()+"..Bagaimana " +
                "Kabarmu?");
        alertDialog.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items the action bar if it is present.
                getMenuInflater().inflate(R.menu.activity_main,
                menu);
        return true;
}
}
