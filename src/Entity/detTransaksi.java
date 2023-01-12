package Entity;

public class detTransaksi extends EntityMenu{

    private int total;

    public detTransaksi(int kodeMenu, String namaMenu, int harga) {
        super(kodeMenu, namaMenu, harga);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
