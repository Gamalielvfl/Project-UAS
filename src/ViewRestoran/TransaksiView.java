package ViewRestoran;

import Controller.TransaksiController;

public class TransaksiView {
    private TransaksiController showTransaksi = new TransaksiController();

    public void viewTransaksi(){
        System.out.println("===================================");
        System.out.println("        T R A N S A K S I          ");
        System.out.println("===================================");
        showTransaksi.showTransaksi();
    }

}
