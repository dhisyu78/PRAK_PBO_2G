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
Output
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
