package com.uassyifa.destinasiwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.uassyifa.destinasiwisata.setting.GlobalVar;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    List<Adapter_Array> listData;
    ListView LV_Data;
    public static final String IDDESTINASI = "iddestinasi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Inisial();
        Set_Object();
        Listen_LV();
    }

    private void Inisial() {
        listData = new ArrayList<>();
        String Header1 = getString(R.string.txt_judul1);
        String Header2 = getString(R.string.txt_judul2);
        String Header3 = getString(R.string.txt_judul3);
        String Header4 = getString(R.string.txt_judul4);
        String Header5 = getString(R.string.txt_judul5);
        String Header6 = getString(R.string.txt_judul6);
        String Header7 = getString(R.string.txt_judul7);
        String Header8 = getString(R.string.txt_judul8);
        String Header9 = getString(R.string.txt_judul9);
        String Header10 = getString(R.string.txt_judul10);
        String Header11 = getString(R.string.txt_judul11);
        String Lok_1 = getString(R.string.txt_lok1);
        String Lok_2 = getString(R.string.txt_lok2);
        String Lok_3 = getString(R.string.txt_lok3);
        String Lok_4 = getString(R.string.txt_lok4);
        String Lok_5 = getString(R.string.txt_lok5);
        String Lok_6 = getString(R.string.txt_lok6);
        String Lok_7 = getString(R.string.txt_lok7);
        String Lok_8 = getString(R.string.txt_lok8);
        String Lok_9 = getString(R.string.txt_lok9);
        String Lok_10 = getString(R.string.txt_lok10);
        String Lok_11 = getString(R.string.txt_lok11);
        listData.clear();
        listData.add(new Adapter_Array(Header1,Lok_1,R.drawable.nsutama, "1"));
        listData.add(new Adapter_Array(Header2,Lok_2,R.drawable.ndutama, "2"));
        listData.add(new Adapter_Array(Header3,Lok_3,R.drawable.ntutama, "3"));
        listData.add(new Adapter_Array(Header4,Lok_4,R.drawable.neutama, "4"));
        listData.add(new Adapter_Array(Header5,Lok_5,R.drawable.nlutama, "5"));
        listData.add(new Adapter_Array(Header6,Lok_6,R.drawable.nenutama, "6"));
        listData.add(new Adapter_Array(Header7,Lok_7,R.drawable.ntuutama, "7"));
        listData.add(new Adapter_Array(Header8,Lok_8,R.drawable.ndelutama, "8"));
        listData.add(new Adapter_Array(Header9,Lok_9,R.drawable.nsemutama, "9"));
        listData.add(new Adapter_Array(Header10,Lok_10,R.drawable.nseputama, "10"));
        listData.add(new Adapter_Array(Header11,Lok_11,R.drawable.nsebutama, "11"));
        LV_Data = findViewById(R.id.ListView_Data);
    }

    private void Set_Object() {
        Adapter_Listview adapterListview = new Adapter_Listview(HomeActivity.this,R.layout.template_list,listData);
        LV_Data.setAdapter(adapterListview);
    }

    private void Listen_LV() {
        LV_Data.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(HomeActivity.this,DetailActivity.class);
            intent.putExtra(GlobalVar.EXTRA_NAMA,listData.get(position).Header);
            intent.putExtra(GlobalVar.EXTRA_LOKASI,listData.get(position).Lokasi);
            intent.putExtra(IDDESTINASI,listData.get(position).Val);
            intent.putExtra(GlobalVar.EXTRA_GAMBAR,listData.get(position).ResID);
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_language) {
            Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(mIntent);
        }
        else if (id == R.id.about) {
            Intent intent = new Intent(HomeActivity.this, AboutActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}