package Controller;

import ViewRestoran.TransaksiView;

public class TransaksiController {
    public void show(){
        TransaksiView transaksiView = new TransaksiView();
        transaksiView.viewTransaksi();
    }

    public void showTransaksi(){
        AllObjectModel.transaksiModel.cetakTransaksi();
    }
}
