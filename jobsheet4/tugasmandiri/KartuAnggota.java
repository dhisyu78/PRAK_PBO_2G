package jobsheet4.tugasmandiri;

public class KartuAnggota {
    private String nomorKartu;

    public KartuAnggota(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Kartu: " + nomorKartu);
    }
}