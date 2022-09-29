package com.example.a11202113304_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nama_pahlawan[]={
                "A.H. Nasution",
                "Agus Salim",
                "Bung Tomo",
                "Kartini",
                "Mohammad Hatta",
                "Pakubuwono X",
                "Sudirman",
                "Soekarno",
                "Tan Malaka"
        };

        int gambar_pahlawan[]={
                R.drawable.abdul_haris_nasution,
                R.drawable.agus_salim,
                R.drawable.bung_tomo,
                R.drawable.kartini,
                R.drawable.mohammad_hatta,
                R.drawable.pakubuwono_x,
                R.drawable.sudirman,
                R.drawable.sukarno,
                R.drawable.tan_malaka,
        };

        String keterangan[]={
                "Ini adalah A.H. Nasution",
                "Ini adalah Agus Salim",
                "Ini adalah Bung Tomo",
                "Ini adalah Kartini",
                "Ini adalah Mohammad Hatta",
                "Ini adalah Pakubuwono X",
                "Ini adalah Sudirman",
                "Ini adalah Soekarno",
                "Ini adalah Tan Malaka"
        };

        listView = findViewById(R.id.list_item);
        AdapterList adapterList = new AdapterList(this,nama_pahlawan,gambar_pahlawan,keterangan);
        listView.setAdapter(adapterList);
    }
}