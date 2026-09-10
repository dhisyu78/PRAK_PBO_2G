public class Tas {
    private String merk;
    private String bahan;

    public void setMerk(String namaMerk) {
        merk = namaMerk;
    }

    public void setBahan(String jenisBahan) {
        bahan = jenisBahan;
    }

    public void cetakInfo() {
        System.out.println("Merk Tas   : " + merk);
        System.out.println("Bahan Tas  : " + bahan);
    }
}