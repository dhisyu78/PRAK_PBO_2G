package kasusA;

public class Arena {
     
    public static void main(String[] args) {
        // Membuat senjata
        Senjata pedang = new Senjata("Pedang", 10);
        Senjata tongkat = new Senjata("Tongkat", 5);

        // Membuat karakter
        Prajurit prajurit = new Prajurit("Prajurit", 100, 100);
        Penyihir penyihir = new Penyihir("Penyihir", 80, 80, 50);

        // Memasang senjata pada karakter
        prajurit.pasangSenjata(pedang);
        penyihir.pasangSenjata(tongkat);
    }

    public void duel(Prajurit prajurit, Penyihir penyihir) {
        System.out.println("Pertarungan dimulai antara " + prajurit.getNama() + " dan " + penyihir.getNama());
        while (prajurit.isHidup() && penyihir.isHidup()) {
            // Prajurit menyerang Penyihir
            int damagePrajurit = prajurit.hitungDamage();
            penyihir.terimaDamage(damagePrajurit);
            System.out.println(prajurit.getNama() + " menyerang " + penyihir.getNama() + " dengan damage: " + damagePrajurit);
            System.out.println(penyihir.getNama() + " HP: " + penyihir.getHp() + "/" + penyihir.getHpMaks());

            if (!penyihir.isHidup()) {
                System.out.println(penyihir.getNama() + " telah kalah!");
                break;
            }

            // Penyihir menyerang Prajurit
            int damagePenyihir = penyihir.hitungDamage();
            prajurit.terimaDamage(damagePenyihir);
            System.out.println(penyihir.getNama() + " menyerang " + prajurit.getNama() + " dengan damage: " + damagePenyihir);
            System.out.println(prajurit.getNama() + " HP: " + prajurit.getHp() + "/" + prajurit.getHpMaks());

            if (!prajurit.isHidup()) {
                System.out.println(prajurit.getNama() + " telah kalah!");
                break;
            }
        }
    }
