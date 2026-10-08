package jobsheet6.percobaan1;

import jobsheet6.ClassA;

public class ClassB extends ClassA {

    public int z;

    public void getNilaiZ() {
        System.out.println("nilai z: " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah: " + (x + y + z));
    }
}