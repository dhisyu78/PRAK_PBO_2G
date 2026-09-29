NAMA : YUDHISTIRA ANDHIKA H
KELAS : TI 2G

### PERCOBAAN 1
Output:

<img width="217" height="122" alt="image" src="https://github.com/user-attachments/assets/9b21d3dc-3233-4631-bea3-eeb86a0e2740" />

### Jawaban pertanyaan percobaan 1

1.Setter digunakan untuk memberikan atau mengubah nilai atribut private, sedangkan getter digunakan untuk mengambil nilai atribut private.

2.Constructor default tidak membutuhkan parameter ketika objek dibuat.

3.<img width="189" height="26" alt="image" src="https://github.com/user-attachments/assets/9203758c-af87-4a00-aadb-6f1997160969" />

4.digunakan untuk memanggil method info() milik objek Processor.

5.keduanya menghasilkan informasi yang sama karena sama-sama memberikan objek Processor kepada Laptop.

### PERCOBAAN 2
Output:

<img width="364" height="61" alt="image" src="https://github.com/user-attachments/assets/97a2811f-0022-4f19-b5b2-1a40eecd186d" />

### Jawaban pertanyaan prcobaan 2

1.<img width="177" height="42" alt="image" src="https://github.com/user-attachments/assets/c3ca7044-5132-4b92-81d0-2dbe0f5da0ae" />

2.Karena class Mobil dan Sopir tidak memiliki atribut hari. Jumlah hari diketahui oleh Pelanggan, sehingga nilai hari diberikan sebagai argument ketika method dipanggil.

3.Keduanya digunakan untuk menghitung biaya berdasarkan jumlah hari.

4.Keduanya digunakan untuk memasukkan referensi objek Mobil dan Sopir ke dalam objek Pelanggan.

5.Method tersebut digunakan untuk menghitung total biaya rental yang terdiri dari biaya mobil dan biaya sopir.

6.Pertama p.getMobil() mengambil objek Mobil dari pelanggan. Setelah itu getMerk() dipanggil untuk mengambil merk mobil tersebut

7.Akan terjadi NullPointerException saat hitungBiayaTotal() dijalankan karena mobil masih bernilai null

### PERCOBAAN 3
Output:

<img width="345" height="181" alt="image" src="https://github.com/user-attachments/assets/d6206aa6-355d-44b7-9c7e-0cc06f2de5ae" />

### Jawaban pertanyaan prcobaan 3

1.Digunakan untuk memanggil method info() dari masing-masing objek Pegawai yang berperan sebagai masinis dan asisten.

2.Program mengalami NullPointerException. Penyebabnya adalah constructor tiga parameter tidak mengisi asisten, sehingga asisten masih null

3.Berisi null

4.Tidak,karena kedua constructor selalu menerima masinis

5.Iya,karena dua objek pegawai yg berbeda

### PERCOBAAN 4
Output:

<img width="379" height="204" alt="image" src="https://github.com/user-attachments/assets/6945948f-b456-4c46-9fd9-8127ef6c231c" />

### Jawaban pertanyaan prcobaan 4

1.10 kursi

2.digunakan untuk mengecek apakah kursi sudah memiliki penumpang.

3.Karena nomor kursi dimulai dari 1, sedangkan index array Java dimulai dari 0.

4.Penumpang pada kursi 1 akan diganti dari Mr. Krab menjadi Budi,Jadi nilai penumpang yang sebelumnya menunjuk ke Mr. Krab sekarang menunjuk ke Budi.

5.Array digunakan karena Gerbong memiliki banyak Kursi dengan jumlah yang dapat berbeda-beda.

6.Array untuk banyak objek sejenis; atribut satu per satu untuk objek yang memiliki role berbeda.

7.Gerbong yang membuat Kursi, sehingga Composition, dan Penumpang dibuat di luar Kursi, sehingga Aggregation

### PERCOBAAN 5

Output

<img width="349" height="63" alt="image" src="https://github.com/user-attachments/assets/f39628ee-e5a0-4a88-9608-3250ab8c9205" />

### Jawaban pertanyaan prcobaan 5
1. Baris 10 pada class Mobil
2. Jika setMesin() digunakan untuk memasukkan mesin yang dibuat dari luar, hubungan tersebut tidak lagi menunjukkan kepemilikan eksklusif seperti sebelumnya dan mengarah ke Aggregation
3. Pada Laptop-Processor, Processor dibuat di luar Laptop lalu diberikan ke Laptop. Pada Mobil-Mesin, Mesin dibuat langsung di dalam constructor Mobil
4. Mesin tersebut tidak lagi digunakan karena hanya dimiliki oleh Mobil tersebut
5. Jika constructor tersebut digunakan dengan Mesin yang dibuat dari luar, maka pola hubungannya menjadi Aggregation, karena Mobil menerima objek Mesin yang sudah dibuat dari luar

### PERCOBAAN 6

Output

<img width="346" height="79" alt="image" src="https://github.com/user-attachments/assets/02e8f798-59a3-42dd-a682-e2c2c8340ffa" />

### Jawaban pertanyaan prcobaan 6
1. Tidak, pada Percobaan 1 Processor disimpan sebagai bagian dari objek Laptop, sedangkan Printer pada Percobaan 6 hanya digunakan sementara di dalam method
2. Tidak. Printer hanya digunakan sebagai parameter method
3. Karena Laptop hanya menggunakan Printer sementara melalui parameter method**. Printertidak disimpan sebagai atribut di dalam Laptop
4. Ya, relasinya menjadi Aggregation apabila Printer disimpan sebagai atribut dan objek Printer diberikan dari luar
5. -Aggregation: objek bagian disimpan sebagai atribut, tetapi objek tersebut dibuat dari luar class pemilik.
   -Composition: objek bagian disimpan sebagai atribut dan dibuat langsung oleh class pemilik.
   -Dependency: objek tidak disimpan sebagai atribut, tetapi hanya digunakan sementara, biasanya melalui parameter method
