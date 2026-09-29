package quiz;

public class reservasi extends operator {

    private int KodeReservasi;
    private int JumlahTiket;
    private operator operator;

    public reservasi(String namaOperator, double Biayalayanan, int KodeReservasi, int JumlahTiket) {
        super(namaOperator, Biayalayanan);
        this.KodeReservasi = KodeReservasi;
        this.JumlahTiket = JumlahTiket;
        this.operator = new operator(namaOperator, Biayalayanan);
    }

    public int getKodeReservasi() {
        return KodeReservasi;
    }

    public int getJumlahTiket() {
        return JumlahTiket;
    }

    public operator getOperator() {
        return operator;
    }

    public void setKodeReservasi(int KodeReservasi) {
        this.KodeReservasi = KodeReservasi;
    }

    public void setJumlahTiket(int JumlahTiket) {
        this.JumlahTiket = JumlahTiket;
    }

    public void setOperator(operator operator) {
        this.operator = operator;
    }
}

    

