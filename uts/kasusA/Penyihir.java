package kasusA;

public class Penyihir extends Karakter {
    private int mana;

    public Penyihir(String nama, int hp, int hpMaks, int mana, int dayaDasar) {
        super(nama, hp, hpMaks, dayaDasar);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    Karakter getSenjata() {
        return super.getSenjata();
    }

    public void pasangSenjata(Senjata senjata) {
        super.pasangSenjata(senjata);
    }

    public int hitungDamage() {
        int damage = super.hitungDamage();
        if (mana > 0) {
            damage += 5; // Tambahkan bonus damage jika masih memiliki mana
            mana -= 10; // Kurangi mana setelah menyerang
        }
        return damage;
    }

    public void terimaDamage(int damage) {
        super.terimaDamage(damage);
    }

    public boolean isHidup() {
        return super.isHidup();
    }

    public int dayaDasar() {
        return super.dayaDasar();
    }



    @Override
    public String info() {
        return String.format("Penyihir %s: HP = %d/%d, Mana = %d", getNama(), getHp(), getHpMaks(), dayaDasar(), mana);
    }
    

}
