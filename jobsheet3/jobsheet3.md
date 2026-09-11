NAMA : YUDHISTIRA ANDHIKA HERMAWANTO
KELAS : TI-2G
NIM :

### Percobaan 1

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


## Percobaan 2

Code
```
package jobsheet3;

public class Motor {
    public int  kecepatan = 0;
    public boolean kontakOn = false;
    public void nyalakanMesin() {
        kontakOn = true;
    }
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 5;
        }
        else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off!\n");
        }
    }
    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        }
        else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off!\n");
        }
    }
    public void printStatus() {
        if (kontakOn == true){
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
        motor.tambahKecepatan();
        
        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}
```

Output
<img width="412" height="317" alt="image" src="https://github.com/user-attachments/assets/21ea7bfc-df1e-44b2-9ee5-8421fcda8d94" />

### Percobaan 3

Code
```


