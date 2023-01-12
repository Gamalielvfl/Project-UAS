package Entity;

import java.util.ArrayList;
import Entity.EntityMenu;
import utils.*;
public class EntityTransaksi {

        private int id_transaksi;
        private int total = 0;
        private int cash;
        private int kembalian;
    private int[] jumlah = new int[40];
    private ArrayList<EntityMenu> pembelian = new ArrayList<>();

    public EntityTransaksi(int id_transaksi, int total, int cash, int kembalian) {
        this.id_transaksi = id_transaksi;
        this.total = total;
        this.cash = cash;
        this.kembalian = kembalian;
    }

    public EntityTransaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public void setJumlah(int index, int jumlah){
        this.jumlah[index] = jumlah;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public int getTotal() {
        return total;
    }

    public int getCash() {
        return cash;
    }

    public int getKembalian() {
        return kembalian;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }


    public void addpembelian(EntityMenu menu){
        pembelian.add(menu);
    }

    public void cetakTransaksi(){
        total = 0;
        System.out.println("=============================");

        for(int i=0; i<pembelian.size(); i++){
            EntityMenu menu = pembelian.get(i);
            if ((jumlah[i] != 0) && (menu != null)){
                int totalBayar = 0;

                EntityMenu menu1 = (EntityMenu) menu;
                totalBayar = menu1.getHarga() * jumlah[i];
                total += totalBayar;
                utils.StrukPesanan.cetakstruk(menu.getNamaMenu(),jumlah[i], menu.harga,total);
            }
        }
        System.out.println("====================================");
        System.out.println("Total : "+total);
    }

    public void cetakTrans1(){
        kembalian = cash - total;
        System.out.println("Cash : "+cash);
        System.out.println("kembalian : "+kembalian);
    }
}

