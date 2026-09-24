package jobsheet4;

public class MainPercobaan1 {

    public static void main(String[] args) {

        // Percobaan menggunakan constructor berparameter
        Processor p = new Processor("Intel i5", 3);

        Laptop l = new Laptop("Thinkpad", p);

        l.info();

        System.out.println();

        // Percobaan menggunakan constructor default + setter
        Processor p1 = new Processor();

        p1.setMerk("Intel i5");
        p1.setCache(4);

        Laptop l1 = new Laptop();

        l1.setMerk("Thinkpad");
        l1.setProc(p1);

        l1.info();
    }
}