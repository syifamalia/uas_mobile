package com.uassyifa.destinasiwisata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter_Listview extends BaseAdapter {
    Context context;
    int layputResourceID;
    List<Adapter_Array> Data;

    public Adapter_Listview(Context context, int layputResourceID, List<Adapter_Array> data) {
        this.context = context;
        this.layputResourceID = layputResourceID;
        Data = data;
    }

    @Override
    public int getCount() {
        return Data.size();
    }

    @Override
    public Adapter_Array getItem(int i) {
        return Data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View barisData;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        barisData = inflater.inflate(layputResourceID,viewGroup,false);
        ImageView IV_Gambar = barisData.findViewById(R.id.imageView_Template_Gambar);
        TextView TV_Val = barisData.findViewById(R.id.textView_List_Val);
        TextView TV_Header = barisData.findViewById(R.id.textView_Template_Header);
        TextView TV_Lokasi = barisData.findViewById(R.id.textView_Template_Lokasi);
        Adapter_Array adapter_array = this.getItem(i);
        TV_Val.setText(adapter_array.Val);
        TV_Header.setText(adapter_array.Header);
        TV_Lokasi.setText(adapter_array.Lokasi);
        IV_Gambar.setImageResource(adapter_array.ResID);
        return barisData;
    }
}
