package jobsheet3;

public class Tiket {

    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    // Konstruktor
    public Tiket(String judulFilm, double hargaDasar) {

        this.judulFilm = judulFilm;

        // Jika harga negatif, gunakan harga default
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }

        // Status awal selalu belum dibayar
        this.statusPembayaran = false;
    }

    // Getter judul film
    public String getJudulFilm() {
        return judulFilm;
    }

    // Getter harga dasar
    public double getHargaDasar() {
        return hargaDasar;
    }

    // Getter status pembayaran
    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    // Method untuk melakukan pembayaran
    public void lakukanPembayaran() {
        statusPembayaran = true;
    }
}