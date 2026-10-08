Nama: Yudhistira Andhika Hermawanto
Kelas: TI-2G

### Percobaan 1
Kode awal:
```
package jobsheet6;

public class ClassB {

    public int z;

    public void getNilaiZ() {
        System.out.println("nilai z: " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah: " + (x + y + z));
    }
}
```

Output:

<img width="831" height="105" alt="image" src="https://github.com/user-attachments/assets/535ca657-894d-4231-8e34-dfb190b22343" />



Setelah dibenarkan:
```
package jobsheet6;

public class ClassB extends ClassA {

    public int z;

    public void getNilaiZ() {
        System.out.println("nilai z: " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah: " + (x + y + z));
    }
}
```
Output:


<img width="137" height="95" alt="image" src="https://github.com/user-attachments/assets/690f1914-d91e-4c0b-91b3-9b7908757f16" />

### Pertanyaan Percobaan 1
1.Karena ClassB belum mewarisi ClassA, sehingga atribut x dan y tidak dikenal oleh ClassB.
2. public class ClassB { diubah menjadi public class ClassB extends ClassA {
3.Dari ClassA:
x
y
getNilai()
Dari ClassB:
z
getNilaiZ()
getJumlah()
4.Karena objek hitung bertipe ClassB, dan ClassB merupakan subclass dari ClassA.
5.Atribut dapat diubah langsung dari class lain.
6.Tidak

### Percobaan 2
Kode awal:
```
package jobsheet6.percobaan2;

public class ClassA {

    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai() {
        System.out.println("nilai x: " + x);
        System.out.println("nilai y: " + y);
    }
}
```
Output:


<img width="939" height="171" alt="image" src="https://github.com/user-attachments/assets/d6374839-cf18-491c-8f0b-161134f7c685" />

Kode setelah dibenarkan:
```
package jobsheet6.percobaan2;

public class ClassA {

    protected int x;
    protected int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai() {
        System.out.println("nilai x: " + x);
        System.out.println("nilai y: " + y);
    }
}
```

Output:


<img width="149" height="105" alt="image" src="https://github.com/user-attachments/assets/6ce2ffa3-61e7-4cce-bb5d-ae92014cb48a" />

### Pertanyaan Percobaan 2
1.Error muncul pada file ClassB.java, tepatnya pada method getJumlah(), ketika kode mencoba mengakses x dan y secara langsung
2.Penyebab error adalah atribut x dan y pada ClassA memiliki access modifier private.
3.Pemanggilan tersebut diperbolehkan karena MainPercobaan2 tidak mengakses atribut x secara langsung.
4.Perbaikan A (protected) memungkinkan ClassB mengakses x dan y secara langsung.
5.Jika ClassA dan ClassB berada di package yang berbeda, atribut protected tetap dapat diakses oleh ClassB karena ClassB merupakan subclass dari ClassA.


### Percobaan 3

Kode awal :
```
package jobsheet6.percobaan3;

public class Tabung extends Bangun {

    protected int t;

    public void setSuperPhi(double phi) {
        super.phi = phi;
    }

    public void setSuperR(int r) {
        super.r = r;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void volume() {
        System.out.println("Volume Tabung adalah: "
                + (super.phi * super.r * super.r * this.t));
    }
}
```

Output:


<img width="238" height="50" alt="image" src="https://github.com/user-attachments/assets/4f7b42b6-b175-4c2a-b490-3c7213dbd2e1" />

Kode baru:
```
package jobsheet6.percobaan3;

public class Tabung extends Bangun {

    protected int r = 5;
    protected int t;

    public void setSuperPhi(double phi) {
        super.phi = phi;
    }

    public void setSuperR(int r) {
        super.r = r;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void volume() {
        System.out.println(
            "Volume Tabung adalah: "
            + (super.phi * super.r * super.r * this.t)
        );
    }

    public void cekR() {
        System.out.println("r       = " + r);
        System.out.println("this.r  = " + this.r);
        System.out.println("super.r = " + super.r);
    }
}
```

Output:


<img width="234" height="106" alt="image" src="https://github.com/user-attachments/assets/cf787f25-3a90-46ae-ac5a-ca7a1355e003" />

### Pertanyaan percobaan 3
1.super digunakan untuk merujuk pada member milik superclass, yaitu Bangun.
2.super.phi → mengambil atribut phi dari superclass Bangun.
super.r → mengambil atribut r dari superclass Bangun.
this.t → mengambil atribut t dari class Tabung sendiri.
3.Tabung tetap dapat mengakses phi dan r karena kedua atribut tersebut dideklarasikan dengan modifier protected pada Bangun.
4.Tidak, output tidak berubah.
5.Pada Eksperimen 2, Tabung memiliki atribut r sendiri yaitu protected int r = 5; sedangkan Bangun juga memiliki atribut sendiri yaitu protected int r;

### Percobaan 4
 Kode awal:
 ```
package jobsheet6.percobaan4;

public class ClassC extends ClassB {

    ClassC() {
        super();
        System.out.println("konstruktor C dijalankan");
    }
}
```
Output:

<img width="209" height="73" alt="image" src="https://github.com/user-attachments/assets/75658e5e-01cb-43ed-aa7b-d12561d53260" />

Kode setelah diganti:
```
package jobsheet6.percobaan4;

public class ClassC extends ClassB {

    ClassC() {
        System.out.println("konstruktor C dijalankan");
        super();
    }
}
```

Output:


<img width="235" height="93" alt="image" src="https://github.com/user-attachments/assets/953ab1ae-4ee8-42f7-b7a1-e168a7399324" />

### Pertanyaan percobaan 4
1.Karena dalam inheritance, constructor superclass harus dijalankan terlebih dahulu sebelum constructor subclass.
2.super() digunakan untuk memanggil constructor dari superclass, yaitu constructor ClassB.
3.Program akan mengalami compile error.
4.Tidak selalu,Jika constructor subclass tidak menuliskan super(), Java akan secara otomatis mencoba memanggil constructor tanpa parameter (super()) dari superclass.
5.Percobaan 4 menggunakan multilevel inheritance, yaitu inheritance yang memiliki beberapa tingkat pewarisan.

### Percobaan 5

Kode awal:
```
package jobsheet6.percobaan5;

public class Desktop extends Komputer {

    protected String printer;

    public Desktop(String merk, int memory, int cpu, String printer) {
        super(merk, memory, cpu);
        this.printer = printer;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Printer          : " + printer);
    }
}
```

Output:

<img width="274" height="241" alt="image" src="https://github.com/user-attachments/assets/1974d391-f59c-401b-8206-9fc957a65445" />

Kode yang sudah dirubah:
```
package jobsheet6.percobaan5;

public class Desktop extends Komputer {

    protected String printer;

    public Desktop(String merk, int memory, int cpu, String printer) {
    this.printer = printer;
}

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Printer          : " + printer);
    }
}
```

Output:

<img width="1038" height="187" alt="image" src="https://github.com/user-attachments/assets/368a7445-a2d8-454c-a5d7-eb8670e1755a" />

### Pertanyaan percobaan 5
1.Program akan mengalami compile error, karena Komputer memiliki constructor yang membutuhkan tiga parameter
2.Karena Desktop dan Laptop merupakan subclass dari Komputer, sedangkan constructor Komputer membutuhkan parameter
3.@Override digunakan untuk memberitahu compiler bahwa method tersebut merupakan method yang meng-override method dari superclass.
4.Akan terjadi compile error.
5.super.showInfo() digunakan untuk menjalankan method showInfo() milik superclass Komputer.


### Latihan Mandiri

1. Tugas 1

