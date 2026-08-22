package course;

class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "jdhvsbch";
        System.out.println("dns vcj");
    }

    public Mobile() {
        brand = "";
        price = 200;
        name = "phone";
        System.out.println("dns vcjdscds");
    }

    public void show() {
        System.out.println(brand + price + name);
    }

    // static mathod

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + obj.price + name);
    }
}

public class Statis1 {
    public static void main(String a[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 3232;
        obj1.name = "dhbjscjh";

        // Mobile.name = "dwsfc";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Apple";
        // obj2.price = 3232;
        // obj2.name = "dhbjscjh";

        // obj1.name = "dsbkcbd";
        // obj1.show();
        // obj2.show();

        Mobile obj2 = new Mobile();
        obj2.show();

        Mobile.show1(obj1);

    }
}
