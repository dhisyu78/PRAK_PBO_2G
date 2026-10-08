package jobsheet6.tugas2;

public class TelevisiModern extends Televisi {
    private String judulDVD;

    public TelevisiModern(String merk, int jumlahChannel) {
        super(merk, jumlahChannel);
        this.judulDVD = "";
    }

    public void gantiModusTampilan(String modus) {
        System.out.println("Modus tampilan: " + modus);
    }

    public void masukkanDVD(String judul) {
        this.judulDVD = judul;
    }

    public void mainkanDVD() {
        if (judulDVD.isEmpty()) {
            System.out.println("Sedang memainkan DVD: kosong");
        } else {
            System.out.println("Sedang memainkan DVD: " + judulDVD);
        }
    }
}