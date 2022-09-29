package com.example.a11202113304_listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterList extends ArrayAdapter {
    String namapahlawan[];
    String keterangan[];
    int gambar_pahlawan[];
    Activity activity;

    public AdapterList(MainActivity activity, String[] nama_pahlawan, int[] gambar_pahlawan, String[] keterangan) {
        super(activity, R.layout.list_resource,nama_pahlawan);
        this.namapahlawan = nama_pahlawan;
        this.keterangan = keterangan;
        this.gambar_pahlawan = gambar_pahlawan;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.list_resource,null);

        ImageView gambare;
        TextView nama_pahlawan;

        gambare = v.findViewById(R.id.gambar_pahlawan);
        nama_pahlawan = v.findViewById(R.id.nama_pahlawan);

        gambare.setImageResource(gambar_pahlawan[position]);
        nama_pahlawan.setText(namapahlawan[position]);

        return v;
    }
}
