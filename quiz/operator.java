package quiz;

public class operator {

    private String namaOperator;
    private double Biayalayanan;

    public operator(String namaOperator, double Biayalayanan) {
        this.namaOperator = namaOperator;
        this.Biayalayanan = Biayalayanan;
    }

    public String getNamaOperator() {
        return namaOperator;
    }

    public double getBiayalayanan() {
        return Biayalayanan;
    }

    public void setNamaOperator(String namaOperator) {
        this.namaOperator = namaOperator;
    }

    public void setBiayalayanan(double Biayalayanan) {
        this.Biayalayanan = Biayalayanan;
    }

    public void prosesPembayaran() {
        System.out.println("Proses pembayaran oleh operator: " + namaOperator);
        System.out.println("Biaya layanan: " + Biayalayanan);
    }


}