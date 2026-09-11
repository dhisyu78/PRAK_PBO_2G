NAMA : YUDHISTIRA ANDHIKA HERMAWANTO
KELAS : TI-2G
NIM :

Percobaan 1

Code 
```
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
```
```
package jobsheet3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.kontakOn = 50;
        motor.printStatus();
    }
}
```

Output

<img width="342" height="126" alt="image" src="https://github.com/user-attachments/assets/144cec13-92e3-48bc-b2b5-0f2c245eda68" />


