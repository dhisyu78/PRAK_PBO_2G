package jobsheet6.tugas1;

public class MainTugas1 {
    public static void main(String[] args) {

        Pegawai pegawai = new Pegawai(
            "P001",
            "Budi",
            "Malang"
        );

        Dosen dosen = new Dosen(
            "D001",
            "Siti",
            "Surabaya",
            12
        );

        DaftarGaji daftarGaji = new DaftarGaji(2);

        daftarGaji.addPegawai(pegawai);
        daftarGaji.addPegawai(dosen);

        daftarGaji.printSemuaGaji();
    }
}