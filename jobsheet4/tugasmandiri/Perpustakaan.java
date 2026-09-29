package jobsheet4.tugasmandiri;

public class Perpustakaan {

    private String nama;
    private Anggota anggota;
    private KartuAnggota kartuAnggota;

    public Perpustakaan(String nama, Anggota anggota) {
        this.nama = nama;
        this.anggota = anggota;

        // Composition
        this.kartuAnggota = new KartuAnggota(
            anggota.getNomorAnggota()
        );
    }

    public void tampilkanInfo() {
        System.out.println("=== INFORMASI PERPUSTAKAAN ===");
        System.out.println("Nama Perpustakaan: " + nama);

        System.out.println("\nData Anggota:");
        anggota.tampilkanInfo();

        System.out.println("\nData Kartu Anggota:");
        kartuAnggota.tampilkanInfo();
    }

    public void cetakLaporan(Laporan laporan) {
        laporan.cetak(nama, anggota.getNama());
    }
}