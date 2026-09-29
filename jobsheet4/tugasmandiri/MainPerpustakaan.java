package jobsheet4.tugasmandiri;

public class MainPerpustakaan {

    public static void main(String[] args) {

        // Membuat objek Anggota dari luar Perpustakaan
        Anggota anggota = new Anggota(
            "Yudhis",
            "A001"
        );

        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan(
            "Perpustakaan Polinema",
            anggota
        );

        // Menampilkan informasi
        perpustakaan.tampilkanInfo();

        // Membuat objek Laporan
        Laporan laporan = new Laporan();

        // Dependency
        perpustakaan.cetakLaporan(laporan);
    }
}