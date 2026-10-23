package kasusA;

public class Karakter extends Senjata {
    
    private String nama;
    private int hp;
    private int hpMaks;
    private int dayaDasar;
    private Senjata pasangSenjata;

    public Karakter(String nama, int hp, int hpMaks, Senjata pasangSenjata) {
        this.nama = nama;
        this.hp = hp;
        this.hpMaks = hpMaks;
        this.dayaDasar = dayaDasar;
        this.senjata = pasangSenjata;
    }

    public String getNama() {
        return nama;
    }

    public int getHp() {
        return hp;
    }

    public int getHpMaks() {
        return hpMaks;
    }

    public Senjata getpasangSenjata() {
        return senjata;
    }

    public int hitungDamage() {
        if (senjata != null) {
            return senjata.getBonusDamage();
        } else {
            return 0;
        }
    }

    public int terimaDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
        return hp;
    }

    public boolean isHidup() {
        return hp > 0;
    }

    public int dayaDasar() {
        return dayaDasar;
    }

    public void pasangSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public String info() {
        return String.format("Karakter %s: HP = %d/%d, Daya Dasar = %d", nama, hp, hpMaks, dayaDasar());
    }
}
