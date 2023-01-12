package Model;

import Entity.EntityTransaksi;

import java.util.ArrayList;

public class TransaksiModel {
    private static ArrayList<EntityTransaksi> transaksiArrayList = new ArrayList<>();
    public static ArrayList<EntityTransaksi> getTransaksiArrayList(){
        return transaksiArrayList;
    }

    public static void create(EntityTransaksi transaksi){
        transaksiArrayList.add(transaksi);
    }

    public static void update(EntityTransaksi transaksi,int index){
        transaksiArrayList.set(index,transaksi);
    }

    public static void delete(int index){
        transaksiArrayList.remove(index);
    }

    public static void cetakTransaksi(){
        for (EntityTransaksi transaksi : transaksiArrayList){
            transaksi.cetakTransaksi();
        }
    }
}
