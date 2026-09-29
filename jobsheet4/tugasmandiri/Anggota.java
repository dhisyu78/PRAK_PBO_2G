package jobsheet4.tugasmandiri;

public class Anggota {
    private String nama;
    private String nomorAnggota;

    public Anggota(String nama, String nomorAnggota) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorAnggota() {
        return nomorAnggota;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Anggota: " + nama);
        System.out.println("Nomor Anggota: " + nomorAnggota);
    }
}