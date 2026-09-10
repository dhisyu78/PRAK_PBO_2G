public class TugasPraktikumDemo {
    public static void main(String[] args) {
        // 1. Instansiasi Objek
        Tas tasUmum = new Tas();
        TasRansel ranselConverse = new TasRansel();
        TasJinjing jinjingLenovo = new TasJinjing();
        MagicCom riceCookerMiyako = new MagicCom();
        Keyboard keyboardRexus = new Keyboard();

        // 2. Data Induk Tas
        System.out.println("=== Info Tas Dasar ===");
        tasUmum.setMerk("Tas Generic");
        tasUmum.setBahan("Kain");
        tasUmum.cetakInfo();
        System.out.println();

        // 3. Data Tas Ransel (Sesuai Foto 1)
        System.out.println("=== Info Tas Ransel ===");
        ranselConverse.setMerk("Converse");
        ranselConverse.setBahan("Kanvas Hitam");
        ranselConverse.setJumlahKantong(2); // Kantong utama dan depan terlihat di foto
        ranselConverse.setAdaTempatLaptop(true);
        ranselConverse.cetakInfo();

        // 4. Data Tas Jinjing (Sesuai Foto 2)
        System.out.println("=== Info Tas Jinjing ===");
        jinjingLenovo.setMerk("Lenovo");
        jinjingLenovo.setBahan("Nylon Hitam");
        jinjingLenovo.setPanjangTali(110); // Estimasi panjang tali selempang
        jinjingLenovo.setJenisPenutup("Resleting Ganda");
        jinjingLenovo.cetakInfo();

        // 5. Data Magic Com (Sesuai Foto 3)
        riceCookerMiyako.setMerk("Miyako");
        riceCookerMiyako.setWarna("Putih Kombinasi Biru");
        riceCookerMiyako.cetakInfo();

        // 6. Data Keyboard (Sesuai Foto 4)
        keyboardRexus.setMerk("Rexus (TKL RGB)");
        keyboardRexus.setTipeKoneksi("Kabel USB");
        keyboardRexus.cetakInfo();
    }
}