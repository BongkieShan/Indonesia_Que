package com.example.android.indonesiaqu;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    RadioGroup groupRadio;
    AlertDialog.Builder builder1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        groupRadio = (RadioGroup) findViewById(R.id.grupRadio);
    }

    public void  onRadioButtonClicked(View view)
    {
        boolean checked = ( (RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio1:
                if (checked)
                    showAlert();
                break;
            case R.id.radio2:
                if (checked)
                    wrongAnswer();
                break;
            case R.id.radio3:
                if (checked)
                    wrongAnswer();
                break;
            case R.id.radio4:
                if (checked)
                  wrongAnswer();
                break;
        }
    }

    public void showAlert() {

        builder1 = new AlertDialog.Builder(this);
        builder1.setCancelable(false);
        builder1.setMessage("Good Work");
        builder1.setPositiveButton("Next", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent goNext = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(goNext);
                Toast.makeText(Main4Activity.this, "Congratulations", Toast.LENGTH_SHORT).show();
            }
        });

        builder1.setNegativeButton("Return", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                groupRadio.clearCheck();
            }
        });

        builder1.create().show();

    }

    public void wrongAnswer(){

        Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();

    }
}
