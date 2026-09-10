public class MagicCom {
    private String merk;
    private String warna; 

    public void setMerk(String namaMerk) {
        merk = namaMerk;
    }

    public void setWarna(String warnaMagicCom) {
        warna = warnaMagicCom;
    }

    public void cetakInfo() {
        System.out.println("=== Info Magic Com ===");
        System.out.println("Merk       : " + merk);
        System.out.println("Warna      : " + warna + "\n");
    }
}