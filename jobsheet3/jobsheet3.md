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


### Percobaan 2

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
package jobsheet3;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public float getSimpanan(){
        return simpanan;
    }
    public void setor(float uang){
        simpanan += uang;
    }
    public void pinjam(float uang){
        simpanan -= uang;
    }
}
```
```
package jobsheet3;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan sukarno Hattta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp " +anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp " +anggota1.getSimpanan());
    }
}
```

Output

<img width="345" height="56" alt="image" src="https://github.com/user-attachments/assets/c1cc80eb-3c14-4c92-bd11-ae3128df28ec" />


### Langkah 4
```
package jobsheet3;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp " +anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan sukarno Hattta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp " +anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp " +anggota1.getSimpanan());
    }
}
```

Output

<img width="361" height="76" alt="image" src="https://github.com/user-attachments/assets/a93b6025-7500-4f48-afe6-515a4e917640" />

```
package jobsheet3;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan Setiawan", "jalan Mawar");
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp " +anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan sukarno Hattta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp " +anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp " +anggota1.getSimpanan());
    }
}
```

Output

<img width="364" height="76" alt="image" src="https://github.com/user-attachments/assets/66aec0b3-7b0a-4d9a-a7d5-fcfabb016cf3" />


### Pertanyaan percobaan 3&4

1. -Getter adalah metode yang dipakai untuk membaca atau mengambil nilai dari suatu properti yang bersifat privat.
   -Setter adalah adalah metode yang dipakai untuk mengubah atau mengisi nilai ke dalam suatu properti yang bersifat privat.
2. Untuk melihat atau mengambi nilai simpanan anggota
3. Mehod setor()
4. Konstruktor adalah method khusus yang otomatis dijalankan saat objek dibuat
5. Nama konstruktor harus sama dengan nama class, tidak memiliki tipe return, dan tidak boleh menggunakan abstract, static, final, atau synchronized
6. Boleh, untuk membatasi pembuatan objek dari luar class
7. Saat objek membutuhkan nilai tertentu ketika pertama kali dibuat
8. Inisialisasi adalah memberikan nilai pada atribut, sedangkan instansiasi adalah membuat objek dari class
9. Method dibuat di dalam class, sedangkan method tidak perlu diinstansiasi dan cukup dipanggil saat dibutuhkan

### Tugas

1. <img width="342" height="59" alt="image" src="https://github.com/user-attachments/assets/879dc849-cc6a-4f91-b1f6-7012ce71fc0f" />

2. Karena ada method steAge
3. atribut age dapat diberi nilai maksimal 30 dan minimal 18
   ```
   public void setAge(int newAge){
        if (newAge > 30) {
            age = 30;
        }else if (newAge < 18) {
            age = 18;
        }else {
            age = newAge;
        }
    }
   ```
4. Membuat sistem penyimanan logistik

code
```
package jobsheet3;
import java.util.Scanner;

public class TestLogistik {

    public static void main(String[] args) {

        Kontainer kontainerAlfa =
            new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println(
            "Nama Pemilik Kontainer: "
            + kontainerAlfa.getNamaPemilik()
        );

        System.out.println(
            "Kapasitas Maksimal: "
            + kontainerAlfa.getKapasitasMaksimal()
            + " kg"
        );

        System.out.println(
            "\nMemasukkan muatan baru seberat 6.000 kg..."
        );

        kontainerAlfa.tambahMuatan(6000);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        System.out.println(
            "\nMemasukkan muatan baru seberat 4.000 kg..."
        );

        kontainerAlfa.tambahMuatan(4000);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        System.out.println(
            "\nMembongkar muat/menurunkan barang seberat 500 kg..."
        );

        kontainerAlfa.turunkanMuatan(500);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        System.out.println(
            "\nMembongkar muat/menurunkan barang seberat 1.500 kg..."
        );

        kontainerAlfa.turunkanMuatan(1500);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );
    }
}
```
Output:


<img width="418" height="288" alt="image" src="https://github.com/user-attachments/assets/5012fe6f-94d6-40a5-91a7-de2fb30d3f84" />

5.Menurunkan 50% dari muatan

code
```
package jobsheet3;

public class TestLogistik {

    public static void main(String[] args) {

        Kontainer kontainerAlfa =
            new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println(
            "Nama Pemilik Kontainer: "
            + kontainerAlfa.getNamaPemilik()
        );

        System.out.println(
            "Kapasitas Maksimal: "
            + kontainerAlfa.getKapasitasMaksimal()
            + " kg"
        );

        System.out.println(
            "\nMemasukkan muatan baru seberat 4.000 kg..."
        );

        kontainerAlfa.tambahMuatan(4000);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        System.out.println(
            "\nMembongkar muatan seberat 1.500 kg..."
        );

        kontainerAlfa.turunkanMuatan(1500);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        System.out.println(
            "\nMembongkar muatan seberat 1.500 kg..."
        );

        kontainerAlfa.turunkanMuatan(1500);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );
    }
}
```

Output:


<img width="791" height="229" alt="image" src="https://github.com/user-attachments/assets/8a1171ff-b742-4d66-9952-6757494f2f4a" />

6.
code
```
package jobsheet3;
import java.util.Scanner;

public class TestLogistik {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Kontainer kontainerAlfa =
            new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("=== SISTEM LOGISTIK KONTAINER ===");

        System.out.println(
            "Nama Pemilik Kontainer: "
            + kontainerAlfa.getNamaPemilik()
        );

        System.out.println(
            "Kapasitas Maksimal: "
            + kontainerAlfa.getKapasitasMaksimal()
            + " kg"
        );

        // Input tambah muatan
        System.out.print(
            "\nMasukkan berat muatan yang ingin ditambahkan (kg): "
        );

        double beratTambah = input.nextDouble();

        kontainerAlfa.tambahMuatan(beratTambah);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        // Input tambah muatan kedua
        System.out.print(
            "\nMasukkan berat muatan tambahan (kg): "
        );

        double beratTambah2 = input.nextDouble();

        kontainerAlfa.tambahMuatan(beratTambah2);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        // Input turunkan muatan
        System.out.print(
            "\nMasukkan berat muatan yang ingin diturunkan (kg): "
        );

        double beratTurun = input.nextDouble();

        kontainerAlfa.turunkanMuatan(beratTurun);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        // Input turunkan muatan kedua
        System.out.print(
            "\nMasukkan berat muatan yang ingin diturunkan lagi (kg): "
        );

        double beratTurun2 = input.nextDouble();

        kontainerAlfa.turunkanMuatan(beratTurun2);

        System.out.println(
            "Berat muatan saat ini: "
            + kontainerAlfa.getBeratMuatanSaatIni()
            + " kg"
        );

        input.close();
    }
}
```


Output:


<img width="805" height="301" alt="image" src="https://github.com/user-attachments/assets/d47ea700-6eae-428a-9d30-0d6407090893" />

7. Sistem tiket bioskop
code
```
public class TestBioskop {

    public static void main(String[] args) {

        Tiket tiket1 =
            new Tiket("Avengers: Endgame", -50000);

        System.out.println(
            "Film: " + tiket1.getJudulFilm()
        );

        System.out.println(
            "Harga Tiket: " + tiket1.getHargaDasar()
        );

        System.out.println(
            "Status Lunas: "
            + tiket1.isStatusPembayaran()
        );

        System.out.println("\nMemproses pembayaran...");

        tiket1.lakukanPembayaran();

        System.out.println(
            "Status Lunas Terbaru: "
            + tiket1.isStatusPembayaran()
        );
    }
}
```

Output

<img width="367" height="124" alt="image" src="https://github.com/user-attachments/assets/221c46b3-43f0-4e63-8577-59b5d7b94661" />

