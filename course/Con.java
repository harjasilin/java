package course;

class Human2 {
    int age;
    String name;

    public Human2() {
        age = 12;
        name = "hallo";
    }

    public Human2(int a, String n) {
        this.age = a;
        this.name = n;
    }
}

class A {
    public A() {
        super();
        System.out.println("hjbsdj A");
    }

    public A(int a) {
        super();
        System.out.println("hjbsdj A+");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("hjbsdj B");
    }

    public B(int a) {

        this();
        System.out.println("hjbsdj B+");
    }
}

public class Con {
    public static void main(String a[]) {
        Human2 obj = new Human2();
        System.out.println(obj.age + obj.name);
        Human2 obj2 = new Human2(14, "mango");

        System.out.println(obj2.age + obj2.name);

        // B obj3 = new B(2);
        B obj4 = new B(5);
    }
}
