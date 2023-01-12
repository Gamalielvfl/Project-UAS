package Controller;

import ViewRestoran.BerandaView;

public class BerandaController {
    public void show(){
        BerandaView berandaView = new BerandaView();
        berandaView.viewBeranda();
    }

    public void menus(int menu){
        switch (menu){
            case 1:
                OrderingController order = new OrderingController();
                order.show();
                break;
            case 2:
                TransaksiController transaksiController = new TransaksiController();
                transaksiController.show();
                break;

        }
    }
}
