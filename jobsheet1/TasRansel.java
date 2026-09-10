public class TasRansel extends Tas {
    private int jumlahKantong;
    private boolean adaTempatLaptop;

    public void setJumlahKantong(int jumlah) {
        jumlahKantong = jumlah;
    }

    public void setAdaTempatLaptop(boolean status) {
        adaTempatLaptop = status;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo(); 
        System.out.println("Jml Kantong: " + jumlahKantong);
        System.out.println("Tmpt Laptop: " + (adaTempatLaptop ? "Ada" : "Tidak Ada"));
        System.out.println("Jenis      : Tas Ransel\n");
    }
}