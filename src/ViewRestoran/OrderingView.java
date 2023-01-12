package ViewRestoran;

import Controller.OrderingController;

import java.util.Scanner;

public class OrderingView {
    private Scanner input = new Scanner(System.in);
    private OrderingController orderingController = new OrderingController();
    int index = 0;

    public void orderingView(){
        int menu,jmlh,cash;
        char lagi;

        do {
            System.out.println("==============================");
            System.out.println("           O R D E R          ");
            System.out.println("==============================");
            System.out.println("""
                        ------------------ P A K E T  S P E S I A L ----------------------
                        1. Nasi Rendang Komplit + Terong Balado + EsTeh         RP 24500
                        2. Nasi Dendeng + Gulai Nangka + EsTeh                  RP 24500
                        3. Nasi Gulai Ayam Komplit + Perkedel + EsTeh           RP 23000
                        4. Nasi Telur Balado Komplit + Daun Ubi Rebus + EsTeh   RP 22500
                        5. Nasi Ikan Mujair + Gulai kikil + EsTeh               RP 24500
                        ------------------------------------------------------------------
                        --------- M A K A N A N ---------
                        6. Rendang               RP 12000
                        7. Dendeng               RP 10000
                        8. Gulai Ayam            RP 8000
                        9. Telur Dadar           RP 7000
                        10. Ikan Mujair Goreng   RP 8000
                        11. Sayur Nangka         RP 5000
                        12. Sayur Daun Singkong  RP 4000
                        13. Perkedel             RP 5000
                        14. Gulai Kikil          RP 9000
                        --------- M I N U M A N ----------
                        15. Air Mineral          RP 4000
                        16. Es Jeruk             RP 5000
                        17. Es Teh               RP 4000""");
            System.out.println("====================================");
            System.out.println("Pilih : ");
            menu = input.nextInt();
            System.out.println("Jumlah : ");
            jmlh = input.nextInt();
            orderingController.daftarMenu(menu,jmlh,index);
            System.out.println("=====================================");
            orderingController.transaksi.cetakTransaksi();
            System.out.println("=====================================");
            System.out.println("Ingin Memesan Lagi ? (Y/T) : ");
            lagi = input.next().charAt(0);
            index++;
        }while (lagi == 'y' || lagi == 'Y');

        System.out.println("==========================================");
        System.out.println("CASH : ");
        cash = input.nextInt();
        orderingController.payment(cash);
    }
}
