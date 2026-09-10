public class TasJinjing extends Tas {
    private int panjangTali; // dalam cm
    private String jenisPenutup;

    public void setPanjangTali(int panjang) {
        panjangTali = panjang;
    }

    public void setJenisPenutup(String penutup) {
        jenisPenutup = penutup;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Pnjng Tali : " + panjangTali + " cm");
        System.out.println("Penutup    : " + jenisPenutup);
        System.out.println("Jenis      : Tas Jinjing\n");
    }
}