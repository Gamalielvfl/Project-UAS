package utils;

import Entity.EntityMenu;

public class StrukPesanan {
    public static void cetakstruk(String nama, int jumlah, int harga,int total){
        System.out.println(jumlah);
        if (jumlah > 10){
            System.out.print(" ");
        }
        else
        {
            System.out.println(" ");
        }
        int panjang = nama.length();
        System.out.println(nama);
        for (int i = panjang; i<= 15; i++){
            System.out.print(" ");
        }
        System.out.println(harga+" "+total);
    }

    public static void cetakstruk() {
    }
}
