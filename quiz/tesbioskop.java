package quiz;

public class tesbioskop {
    
    public static void main(String[] args) {
        operator operator1 = new operator("Andra", 5000.00);
        reservasi reservasi1 = new reservasi("Andra", 5000.00, 12345, 2);
        studio studio1 = new studio("Studio A", 1000.000);
     

        System.out.println("Nama Operator: " + operator1.getNamaOperator());
        System.out.println("Biaya Layanan: " + operator1.getBiayalayanan());
        System.out.println("Kode Reservasi: " + reservasi1.getKodeReservasi());
        System.out.println("Jumlah Tiket: " + reservasi1.getJumlahTiket());
        System.out.println("Nama Studio: " + studio1.getNamaStudio());
        System.out.println("Tarif Sewa per Jam: " + studio1.getTarifsewaperjam());
        

        System.out.println("\nMemproses pembayaran...");
        operator1.prosesPembayaran();
        studio1.tampilkanInfoStudio();
      

        System.out.println("\nMemproses reservasi...");
        System.out.println("Reservasi berhasil dengan kode: " + reservasi1.getKodeReservasi());

        System.out.println( "\nPembayaran berhasil. Terima kasih telah menggunakan layanan kami!");
    }
}
