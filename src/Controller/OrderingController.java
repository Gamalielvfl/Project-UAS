package Controller;

import Entity.EntityMenu;
import Entity.EntityTransaksi;
import Entity.detTransaksi;
import Model.TransaksiModel;
import ViewRestoran.OrderingView;

public class OrderingController {

    private int id = AllObjectModel.transaksiModel.getTransaksiArrayList().size() + 1;
    public EntityTransaksi transaksi = new EntityTransaksi(id);

    public void show(){
        OrderingView orderingView = new OrderingView();
        orderingView.orderingView();

    }

    public void daftarMenu(int menu,int jmlh,int index){
        switch (menu)
        {
            case 1:
                detTransaksi rendang = new detTransaksi(1,"Nasi Rendang Komplit + Terong Balado + EsTeh",24500);
                rendang.setTotal(rendang.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(rendang);
                break;
            case 2:
                detTransaksi dendeng = new detTransaksi(2,"Nasi Dendeng + Gulai Nangka + EsTeh",24500);
                dendeng.setTotal(dendeng.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(dendeng);
                break;
            case 3:
                detTransaksi gulai = new detTransaksi(3,"Nasi Gulai Ayam Komplit + Perkedel + EsTeh",23000);
                gulai.setTotal(gulai.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(gulai);
                break;
            case 4:
                detTransaksi telur = new detTransaksi(4, "Nasi Telur Balado Komplit + Daun Ubi Rebus + EsTeh",22500);
                telur.setTotal(telur.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(telur);
                break;
            case 5:
                detTransaksi ikan = new detTransaksi(5, "Nasi Ikan Mujair + Gulai kikil + EsTeh ",24500);
                ikan.setTotal(ikan.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(ikan);
                break;
            case 6:
                detTransaksi Lrendang = new detTransaksi(6,"Rendang",12000);
                Lrendang.setTotal(Lrendang.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(Lrendang);
                break;
            case 7:
                detTransaksi Ldendeng = new detTransaksi(7,"Dendeng",10000);
                Ldendeng.setTotal(Ldendeng.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(Ldendeng);
                break;
            case 8:
                detTransaksi Lgulai = new detTransaksi(8,"Gulai Ayam",8000);
                Lgulai.setTotal(Lgulai.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(Lgulai);
                break;
            case 9:
                detTransaksi Ltelur = new detTransaksi(9,"Telur Dadar",7000);
                Ltelur.setTotal(Ltelur.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(Ltelur);
                break;
            case 10:
                detTransaksi Likan = new detTransaksi(10,"Ikan Mujair Goreng",8000);
                Likan.setTotal(Likan.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(Likan);
                break;
            case 11:
                detTransaksi nangka = new detTransaksi(11,"Sayur Nangka",5000);
                nangka.setTotal(nangka.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(nangka);
                break;
            case 12:
                detTransaksi daunSingkong = new detTransaksi(12,"Sayur Daun Singkong",4000);
                daunSingkong.setTotal(daunSingkong.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(daunSingkong);
                break;
            case 13:
                detTransaksi perkedel = new detTransaksi(13,"Perkedel",5000);
                perkedel.setTotal(perkedel.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(perkedel);
                break;
            case 14:
                detTransaksi kikil = new detTransaksi(14,"Gulai Kikil",9000);
                kikil.setTotal(kikil.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(kikil);
                break;
            case 15:
                detTransaksi mineral = new detTransaksi(15,"Air Mineral ",4000);
                mineral.setTotal(mineral.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(mineral);
                break;
            case 16:
                detTransaksi esJeruk = new detTransaksi(16,"Es Jeruk",5000);
                esJeruk.setTotal(esJeruk.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(esJeruk);
                break;
            case 17:
                detTransaksi esTeh = new detTransaksi(17,"Es Teh ",4000);
                esTeh.setTotal(esTeh.getHarga()*jmlh);
                transaksi.setJumlah(index,jmlh);
                transaksi.addpembelian(esTeh);
                break;
        }
    }

    public void payment(int cash){
        transaksi.setCash(cash);
        AllObjectModel.transaksiModel.getTransaksiArrayList().add(transaksi);
        transaksi.cetakTransaksi();
        transaksi.cetakTrans1();
    }
}
