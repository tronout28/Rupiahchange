package com.example.rupiahchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.rupiahchanger.databinding.ActivityMainBinding;

public class Tugas_Radya extends AppCompatActivity {
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = binding.username.getText().toString();
                String password = binding.password.getText().toString();
                if (username.equalsIgnoreCase("admin") || password.equalsIgnoreCase("admin")){
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Sukses Login")
                            .setMessage("apakah anda ingin melanjutkan?")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
//                                    Intent intent = new Intent(MainActivity.this,fatih.class);
//                                    startActivity(intent);
                                }
                            })

                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }else{
                    Toast.makeText(getApplicationContext(), "maaf sepertinya username atau password anda salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}