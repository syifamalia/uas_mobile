package com.uassyifa.destinasiwisata;

public class Adapter_Array {
    String Header, Lokasi, Val;
    int ResID;

    public Adapter_Array(String nama, String lokasi, int resID, String val) {
        Header = nama;
        Lokasi = lokasi;
        Val = val;
        ResID = resID;
    }

    public String getHeader() {
        return Header;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public String getVal() { return Val; }

    public int getResID() {
        return ResID;
    }
}
