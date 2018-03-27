package com.example.ongor1.alertdialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder alertDialog;
    private Button showDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDialog = (Button)findViewById(R.id.showDialogID);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // show dialog (alert dialog)
                alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle(getResources().getString(R.string.title));

                // setMessage
                alertDialog.setMessage(getResources().getString(R.string.message));
                // setCancle
                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton(getResources().getString(R.string.yes),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Exit window Activity
                                MainActivity.this.finish();

                            }
                        });
                        alertDialog.setNegativeButton(getResources().getString(R.string.no),
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                       dialogInterface.cancel();
                                    }
                                });

                        AlertDialog dialog = alertDialog.create();

                        //show dialog
                dialog.show();



            }
        });

    }
}
