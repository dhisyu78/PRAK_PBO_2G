NAMA : YUDHISTIRA ANDHIKA HERMAWANTO
KELAS : TI-2G

LANGKAH 2

Code
```
package jobsheet2;

public class Rectangle {
    int widith;
    int height;
}
```
```
package jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.widith = 6;
        r.height = 4;

        System.out.println("Rectangle " + r.widith + "x" + r.height);
    }
}
```
Output


<img width="352" height="38" alt="image" src="https://github.com/user-attachments/assets/e4eb3f70-b5df-439e-9a77-1d8bf5454c8a" />

Langkah 3
Code
```
package jobsheet2;

public class Rectangle {
    int width;
    int height;

    int area(){
        return width * height;
    }

    int perimeter(){
        return 2 * (width + height);
    }
}
```
```
package jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 6;
        r.height = 4;

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
```

Output



<img width="347" height="54" alt="image" src="https://github.com/user-attachments/assets/bebe3e46-2d52-455d-9953-9f359b34cd9b" />


Langkah 4

Code
```
package jobsheet2;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width=width;
        this.height=height;
    }
    int area(){
        return width * height;
    }

    int perimeter(){
        return 2 * (width + height);
    }
}
```
```
package jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(6, 4);

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
```

Output

<img width="354" height="57" alt="image" src="https://github.com/user-attachments/assets/4941c9cd-ecfa-4747-88aa-7203f9ad1447" />

Langkah 5

Code (sebelum diperbaiki)
```
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle original  = new Rectangle(6, 4);

        System.out.println("Area: " + original.area());

        Rectangle copy = original;
        copy.width = 10;
        System.out.println("Via original: " + original.area());
        System.out.println("Via copy: " + copy.area());

        Rectangle empty = null;
        System.out.println(empty.area());
        
    }
}
```

Output


<img width="898" height="105" alt="image" src="https://github.com/user-attachments/assets/e3a82336-9d30-42b2-83a3-6a350972db6b" />


Code (setelah diperbaiki)
```
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle original  = new Rectangle(6, 4);

        System.out.println("Area: " + original.area());

        Rectangle copy = original;
        copy.width = 10;
        System.out.println("Via original: " + original.area());
        System.out.println("Via copy: " + copy.area());

    }
}
```

Output

<img width="360" height="72" alt="image" src="https://github.com/user-attachments/assets/2f28c3bc-6e2a-49f2-92f3-f996b943b5b0" />

Langkah 6

Code
```
package jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle original = new Rectangle(6, 4);
        System.out.println("Area: " + original.area());

        Rectangle copy = original;
        copy.width = 10;

        System.out.println("Via original: " + original.area());
        System.out.println("Via copy: " + copy.area());

        Student s = new Student("Nadia", "S001", 3.8);
        System.out.println(s.describe());
    }
}
```
```
package jobsheet2;

public class Student {
    private String name;
    private String studentId;
    private double gpa;

    Student(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String describe() {
        return name + " (" + studentId + ", GPA: " + gpa + ")";
    }
}
```

Output

<img width="357" height="89" alt="image" src="https://github.com/user-attachments/assets/336a2160-e0b3-4107-ad09-4d5558bae7a7" />

Langkah 7

Code
```
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = new Rectangle(6, 4);
        shapes[1] = new Rectangle(3, 3);
        shapes[2] = new Rectangle(8, 2);

        for (Rectangle r : shapes) {
            System.out.println("Area: " + r.area() + ", Perimeter: " + r.perimeter() );
        }

        Student s = new Student("Nadia", "S001", 3.8 );
        System.out.println(s.describe());
    }
}
```

Output

<img width="358" height="93" alt="image" src="https://github.com/user-attachments/assets/78650789-6c33-4cfe-825e-f147f90dea4c" />
