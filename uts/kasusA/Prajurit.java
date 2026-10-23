package kasusA;

public class Prajurit extends Karakter {
    


    public Prajurit(String nama, int hp, int hpMaks, int dayaDasar) {
        super(nama, hp, hpMaks, dayaDasar);
    }

    @Override
    public String info() {
        return String.format("Prajurit %s: HP = %d/%d", getNama(), getHp(), getHpMaks(), dayaDasar());
    }
}
