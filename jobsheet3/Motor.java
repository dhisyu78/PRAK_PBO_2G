package jobsheet3;

public class Motor {
    public in kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus() {
        if (kontakOn ==){
            System.out.println("Kontak On");
        }
        else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }

}
