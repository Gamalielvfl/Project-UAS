package Entity;

public class EntityMenu {
    public int kodeMenu;
    public String namaMenu;
    public int harga;

    public EntityMenu(int kodeMenu, String namaMenu, int harga) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public int getKodeMenu() {
        return kodeMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public int getHarga() {
        return harga;
    }

}
