package ViewRestoran;

import Controller.BerandaController;

import java.util.Scanner;

public class BerandaView {


    private Scanner input = new Scanner(System.in);
    private BerandaController beranda = new BerandaController();

    public void viewBeranda(){
        int menu;

        do {
            System.out.println("==============================");
            System.out.println("   R E S T A U R A N T  ");
            System.out.println("==============================");
            System.out.println("""
                        1. ORDER
                        2. TRANSAKSI
                        3. EXIT """);
            System.out.println("===============================");
            System.out.println("Pilih : ");
            menu = input.nextInt();
            beranda.menus(menu);
        }while (menu != 0);
    }
}
