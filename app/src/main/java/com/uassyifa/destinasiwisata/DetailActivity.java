package com.uassyifa.destinasiwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView TV_Header, TV_Lokasi, TV_Alamat, TV_Deskripsi, TV_Capt1, TV_Capt2, TV_Capt3, TV_Sejarah, TV_Info;
    ImageView IV_GambarUtama, IV_Pict1, IV_Pict2, IV_Pict3, IV_Pict4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Inisial();
        Set_Object();
    }

    private void Inisial() {
        IV_GambarUtama = findViewById(R.id.imageView_Detail_Gambar);
        TV_Header = findViewById(R.id.textView_Detail_Header);
        TV_Lokasi = findViewById(R.id.textView_Detail_Lokasi);
        TV_Alamat = findViewById(R.id.textView_Detail_Alamat);
        TV_Deskripsi = findViewById(R.id.textView_Detail_Deskripsi);
        IV_Pict1 = findViewById(R.id.imageView_Gambar1);
        IV_Pict2 = findViewById(R.id.imageView_Gambar2);
        IV_Pict3 = findViewById(R.id.imageView_Gambar3);
        TV_Capt1 = findViewById(R.id.textView_Caption1);
        TV_Capt2 = findViewById(R.id.textView_Caption2);
        TV_Capt3 = findViewById(R.id.textView_Caption3);
        TV_Sejarah = findViewById(R.id.textView_Detail_Sejarah);
        TV_Info = findViewById(R.id.textView_Detail_Info);
        IV_Pict4 = findViewById(R.id.imageView_Gambar4);
    }

    private void Set_Object() {
        Intent intent = getIntent();
        String IDDESTINASI = intent.getStringExtra(HomeActivity.IDDESTINASI);
        if(IDDESTINASI.equals("1")) {
            String Header = getString(R.string.txt_judul1);
            String Lokasi = getString(R.string.txt_lok1);
            String Alamat = getString(R.string.txt_loklengkap1);
            String Desc = getString(R.string.txt_desc1);
            String Capt1 = getString(R.string.img_no1_1);
            String Capt2 = getString(R.string.img_no1_2);
            String Capt3 = getString(R.string.img_no1_3);
            String Sejarah = getString(R.string.txt_sejarah1);
            String Info = getString(R.string.txt_shortdesc1);

            IV_GambarUtama.setImageResource(R.drawable.nsutama);
            TV_Header.setText(Header);
            TV_Lokasi.setText(Lokasi);
            TV_Alamat.setText(Alamat);
            TV_Deskripsi.setText(Desc);
            IV_Pict1.setImageResource(R.drawable.nsdua);
            IV_Pict2.setImageResource(R.drawable.nstiga);
            IV_Pict3.setImageResource(R.drawable.nsempat);
            TV_Capt1.setText(Capt1);
            TV_Capt2.setText(Capt2);
            TV_Capt3.setText(Capt3);
            TV_Sejarah.setText(Sejarah);
            TV_Info.setText(Info);
            IV_Pict4.setImageResource(R.drawable.nslimaa);
        }
        if(IDDESTINASI.equals("2")) {
            String Header = getString(R.string.txt_judul2);
            String Lokasi = getString(R.string.txt_lok2);
            String Alamat = getString(R.string.txt_loklengkap2);
            String Desc = getString(R.string.txt_desc2);
            String Capt1 = getString(R.string.img_no2_1);
            String Capt2 = getString(R.string.img_no2_2);
            String Capt3 = getString(R.string.img_no2_3);
            String Sejarah = getString(R.string.txt_sejarah2);
            String Info = getString(R.string.txt_shortdesc2);

            IV_GambarUtama.setImageResource(R.drawable.ndutama);
            TV_Header.setText(Header);
            TV_Lokasi.setText(Lokasi);
            TV_Alamat.setText(Alamat);
            TV_Deskripsi.setText(Desc);
            IV_Pict1.setImageResource(R.drawable.nddua);
            IV_Pict2.setImageResource(R.drawable.ndtiga);
            IV_Pict3.setImageResource(R.drawable.ndempat);
            TV_Capt1.setText(Capt1);
            TV_Capt2.setText(Capt2);
            TV_Capt3.setText(Capt3);
            TV_Sejarah.setText(Sejarah);
            TV_Info.setText(Info);
            IV_Pict4.setImageResource(R.drawable.ndlima);
        }
        if(IDDESTINASI.equals("3")) {
            String Header = getString(R.string.txt_judul3);
            String Lokasi = getString(R.string.txt_lok3);
            String Alamat = getString(R.string.txt_loklengkap3);
            String Desc = getString(R.string.txt_desc3);
            String Capt1 = getString(R.string.img_no3_1);
            String Capt2 = getString(R.string.img_no3_2);
            String Capt3 = getString(R.string.img_no3_3);
            String Sejarah = getString(R.string.txt_sejarah3);
            String Info = getString(R.string.txt_shortdesc3);

            IV_GambarUtama.setImageResource(R.drawable.ntutama);
            TV_Header.setText(Header);
            TV_Lokasi.setText(Lokasi);
            TV_Alamat.setText(Alamat);
            TV_Deskripsi.setText(Desc);
            IV_Pict1.setImageResource(R.drawable.ntdua);
            IV_Pict2.setImageResource(R.drawable.nttiga);
            IV_Pict3.setImageResource(R.drawable.ntempat);
            TV_Capt1.setText(Capt1);
            TV_Capt2.setText(Capt2);
            TV_Capt3.setText(Capt3);
            TV_Sejarah.setText(Sejarah);
            TV_Info.setText(Info);
            IV_Pict4.setImageResource(R.drawable.ntlima);
        }
        if(IDDESTINASI.equals("4")) {
            String Header = getString(R.string.txt_judul4);
            String Lokasi = getString(R.string.txt_lok4);
            String Alamat = getString(R.string.txt_loklengkap4);
            String Desc = getString(R.string.txt_desc4);
            String Capt1 = getString(R.string.img_no4_1);
            String Capt2 = getString(R.string.img_no4_2);
            String Capt3 = getString(R.string.img_no4_3);
            String Sejarah = getString(R.string.txt_sejarah4);
            String Info = getString(R.string.txt_shortdesc4);

            IV_GambarUtama.setImageResource(R.drawable.neutama);
            TV_Header.setText(Header);
            TV_Lokasi.setText(Lokasi);
            TV_Alamat.setText(Alamat);
            TV_Deskripsi.setText(Desc);
            IV_Pict1.setImageResource(R.drawable.nedua);
            IV_Pict2.setImageResource(R.drawable.netiga);
            IV_Pict3.setImageResource(R.drawable.neempat);
            TV_Capt1.setText(Capt1);
            TV_Capt2.setText(Capt2);
            TV_Capt3.setText(Capt3);
            TV_Sejarah.setText(Sejarah);
            TV_Info.setText(Info);
            IV_Pict4.setImageResource(R.drawable.nelima);
        }
        if(IDDESTINASI.equals("5")) {
            String Header = getString(R.string.txt_judul5);
            String Lokasi = getString(R.string.txt_lok5);
            String Alamat = getString(R.string.txt_loklengkap5);
            String Desc = getString(R.string.txt_desc5);
            String Capt1 = getString(R.string.img_no5_1);
            String Capt2 = getString(R.string.img_no5_2);
            String Capt3 = getString(R.string.img_no5_3);
            String Sejarah = getString(R.string.txt_sejarah5);
            String Info = getString(R.string.txt_shortdesc5);

            IV_GambarUtama.setImageResource(R.drawable.nlutama);
            TV_Header.setText(Header);
            TV_Lokasi.setText(Lokasi);
            TV_Alamat.setText(Alamat);
            TV_Deskripsi.setText(Desc);
            IV_Pict1.setImageResource(R.drawable.nldua);
            IV_Pict2.setImageResource(R.drawable.nltiga);
            IV_Pict3.setImageResource(R.drawable.nlempat);
            TV_Capt1.setText(Capt1);
            TV_Capt2.setText(Capt2);
            TV_Capt3.setText(Capt3);
            TV_Sejarah.setText(Sejarah);
            TV_Info.setText(Info);
            IV_Pict4.setImageResource(R.drawable.nllima);
        }
        if(IDDESTINASI.equals("6")) {
            String Header = getString(R.string.txt_judul6);
            String Lokasi = getString(R.string.txt_lok6);
            String Alamat = getString(R.string.txt_loklengkap6);
            String Desc = getString(R.string.txt_desc6);
            String Capt1 = getString(R.string.img_no6_1);
            String Capt2 = getString(R.string.img_no6_2);
            String Capt3 = getString(R.string.img_no6_3);
            String Sejarah = getString(R.string.txt_sejarah6);
            String Info = getString(R.string.txt_shortdesc6);

            IV_GambarUtama.setImageResource(R.drawable.nenutama);
            TV_Header.setText(Header);
            TV_Lokasi.setText(Lokasi);
            TV_Alamat.setText(Alamat);
            TV_Deskripsi.setText(Desc);
            IV_Pict1.setImageResource(R.drawable.nendua);
            IV_Pict2.setImageResource(R.drawable.nentiga);
            IV_Pict3.setImageResource(R.drawable.nenempat);
            TV_Capt1.setText(Capt1);
            TV_Capt2.setText(Capt2);
            TV_Capt3.setText(Capt3);
            TV_Sejarah.setText(Sejarah);
            TV_Info.setText(Info);
            IV_Pict4.setImageResource(R.drawable.nenlima);
        }
        if(IDDESTINASI.equals("7")) {
            String Header = getString(R.string.txt_judul7);
            String Lokasi = getString(R.string.txt_lok7);
            String Alamat = getString(R.string.txt_loklengkap7);
            String Desc = getString(R.string.txt_desc7);
            String Capt1 = getString(R.string.img_no7_1);
            String Capt2 = getString(R.string.img_no7_2);
            String Capt3 = getString(R.string.img_no7_3);
            String Sejarah = getString(R.string.txt_sejarah7);
            String Info = getString(R.string.txt_shortdesc7);

            IV_GambarUtama.setImageResource(R.drawable.ntuutama);
            TV_Header.setText(Header);
            TV_Lokasi.setText(Lokasi);
            TV_Alamat.setText(Alamat);
            TV_Deskripsi.setText(Desc);
            IV_Pict1.setImageResource(R.drawable.ntudua);
            IV_Pict2.setImageResource(R.drawable.ntutiga);
            IV_Pict3.setImageResource(R.drawable.ntuempat);
            TV_Capt1.setText(Capt1);
            TV_Capt2.setText(Capt2);
            TV_Capt3.setText(Capt3);
            TV_Sejarah.setText(Sejarah);
            TV_Info.setText(Info);
            IV_Pict4.setImageResource(R.drawable.ntulima);
        }
        if(IDDESTINASI.equals("8")) {
            String Header = getString(R.string.txt_judul8);
            String Lokasi = getString(R.string.txt_lok8);
            String Alamat = getString(R.string.txt_loklengkap8);
            String Desc = getString(R.string.txt_desc8);
            String Capt1 = getString(R.string.img_no8_1);
            String Capt2 = getString(R.string.img_no8_2);
            String Capt3 = getString(R.string.img_no8_3);
            String Sejarah = getString(R.string.txt_sejarah8);
            String Info = getString(R.string.txt_shortdesc8);

            IV_GambarUtama.setImageResource(R.drawable.ndelutama);
            TV_Header.setText(Header);
            TV_Lokasi.setText(Lokasi);
            TV_Alamat.setText(Alamat);
            TV_Deskripsi.setText(Desc);
            IV_Pict1.setImageResource(R.drawable.ndeldua);
            IV_Pict2.setImageResource(R.drawable.ndeltiga);
            IV_Pict3.setImageResource(R.drawable.ndelempat);
            TV_Capt1.setText(Capt1);
            TV_Capt2.setText(Capt2);
            TV_Capt3.setText(Capt3);
            TV_Sejarah.setText(Sejarah);
            TV_Info.setText(Info);
            IV_Pict4.setImageResource(R.drawable.ndellima);
        }
        if(IDDESTINASI.equals("9")) {
            String Header = getString(R.string.txt_judul9);
            String Lokasi = getString(R.string.txt_lok9);
            String Alamat = getString(R.string.txt_loklengkap9);
            String Desc = getString(R.string.txt_desc9);
            String Capt1 = getString(R.string.img_no9_1);
            String Capt2 = getString(R.string.img_no9_2);
            String Capt3 = getString(R.string.img_no9_3);
            String Sejarah = getString(R.string.txt_sejarah9);
            String Info = getString(R.string.txt_shortdesc9);

            IV_GambarUtama.setImageResource(R.drawable.nsemutama);
            TV_Header.setText(Header);
            TV_Lokasi.setText(Lokasi);
            TV_Alamat.setText(Alamat);
            TV_Deskripsi.setText(Desc);
            IV_Pict1.setImageResource(R.drawable.nsemdua);
            IV_Pict2.setImageResource(R.drawable.nsemtiga);
            IV_Pict3.setImageResource(R.drawable.nsemempat);
            TV_Capt1.setText(Capt1);
            TV_Capt2.setText(Capt2);
            TV_Capt3.setText(Capt3);
            TV_Sejarah.setText(Sejarah);
            TV_Info.setText(Info);
            IV_Pict4.setImageResource(R.drawable.nsemlima);
        }
        if(IDDESTINASI.equals("10")) {
            String Header = getString(R.string.txt_judul10);
            String Lokasi = getString(R.string.txt_lok10);
            String Alamat = getString(R.string.txt_loklengkap10);
            String Desc = getString(R.string.txt_desc10);
            String Capt1 = getString(R.string.img_no10_1);
            String Capt2 = getString(R.string.img_no10_2);
            String Capt3 = getString(R.string.img_no10_3);
            String Sejarah = getString(R.string.txt_sejarah10);
            String Info = getString(R.string.txt_shortdesc10);

            IV_GambarUtama.setImageResource(R.drawable.nseputama);
            TV_Header.setText(Header);
            TV_Lokasi.setText(Lokasi);
            TV_Alamat.setText(Alamat);
            TV_Deskripsi.setText(Desc);
            IV_Pict1.setImageResource(R.drawable.nsepdua);
            IV_Pict2.setImageResource(R.drawable.nseptiga);
            IV_Pict3.setImageResource(R.drawable.nsepempat);
            TV_Capt1.setText(Capt1);
            TV_Capt2.setText(Capt2);
            TV_Capt3.setText(Capt3);
            TV_Sejarah.setText(Sejarah);
            TV_Info.setText(Info);
            IV_Pict4.setImageResource(R.drawable.nseplima);
        }
        if(IDDESTINASI.equals("11")) {
            String Header = getString(R.string.txt_judul11);
            String Lokasi = getString(R.string.txt_lok11);
            String Alamat = getString(R.string.txt_loklengkap11);
            String Desc = getString(R.string.txt_desc11);
            String Capt1 = getString(R.string.img_no11_1);
            String Capt2 = getString(R.string.img_no11_2);
            String Capt3 = getString(R.string.img_no11_3);
            String Sejarah = getString(R.string.txt_sejarah11);
            String Info = getString(R.string.txt_shortdesc11);

            IV_GambarUtama.setImageResource(R.drawable.nsebutama);
            TV_Header.setText(Header);
            TV_Lokasi.setText(Lokasi);
            TV_Alamat.setText(Alamat);
            TV_Deskripsi.setText(Desc);
            IV_Pict1.setImageResource(R.drawable.nsebdua);
            IV_Pict2.setImageResource(R.drawable.nsebtiga);
            IV_Pict3.setImageResource(R.drawable.nsebempat);
            TV_Capt1.setText(Capt1);
            TV_Capt2.setText(Capt2);
            TV_Capt3.setText(Capt3);
            TV_Sejarah.setText(Sejarah);
            TV_Info.setText(Info);
            IV_Pict4.setImageResource(R.drawable.nseblima);
        }
    }
}