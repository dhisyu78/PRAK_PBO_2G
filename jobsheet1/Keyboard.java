public class Keyboard {
    private String merk;
    private String tipeKoneksi;

    public void setMerk(String namaMerk) {
        merk = namaMerk;
    }

    public void setTipeKoneksi(String koneksi) {
        tipeKoneksi = koneksi;
    }

    public void cetakInfo() {
        System.out.println("=== Info Keyboard ===");
        System.out.println("Merk       : " + merk);
        System.out.println("Koneksi    : " + tipeKoneksi + "\n");
    }
}