package course;

class A {
    public int show(int n1, int n2) {
        return n1 + n2;
    }

    public void config() {
        System.out.println("config");
    }
}

class B {

}

class C extends A {
    public int show(int n1, int n2) {
        return n1 + n2 + 1;
    }
}

public class Inheritance1 {
    public static void main(String a[]) {
        AdvCal obj = new AdvCal();
        int r1 = obj.add(1, 2);
        int r2 = obj.sub(1, 2);
        int r3 = obj.mul(1, 2);
        int r4 = obj.div(1, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " ");

        C obj3 = new C();
        System.out.println(obj3.show(3, 4));
        obj3.config();

    }
}
