package jobsheet3;
import java.util.Scanner;

public class TestLogistik {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Kontainer kontainerAlfa =
            new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("=== SISTEM LOGISTIK KONTAINER ===");

        System.out.println(
            "Nama Pemilik Kontainer: "
            + kontainerAlfa.getNamaPemilik()
        );

        System.out.println(
            "Kapasitas Maksimal: "
            + kontainerAlfa.getKapasitasMaksimal()
            + " kg"
        );

        // Input tambah muatan
        System.out.print(
            "\nMasukkan berat muatan yang ingin ditambahkan (kg): "
        );

        double beratTambah = input.nextDouble();

        kontainerAlfa.tambahMuatan(beratTambah);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        // Input tambah muatan kedua
        System.out.print(
            "\nMasukkan berat muatan tambahan (kg): "
        );

        double beratTambah2 = input.nextDouble();

        kontainerAlfa.tambahMuatan(beratTambah2);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        // Input turunkan muatan
        System.out.print(
            "\nMasukkan berat muatan yang ingin diturunkan (kg): "
        );

        double beratTurun = input.nextDouble();

        kontainerAlfa.turunkanMuatan(beratTurun);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        // Input turunkan muatan kedua
        System.out.print(
            "\nMasukkan berat muatan yang ingin diturunkan lagi (kg): "
        );

        double beratTurun2 = input.nextDouble();

        kontainerAlfa.turunkanMuatan(beratTurun2);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        input.close();
    }
}