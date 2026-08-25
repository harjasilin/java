package course;

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class Encap {
    public static void main(String a[]) {
        Human obj1 = new Human();
        obj1.setAge(10);
        obj1.setName("khewjrdbsfckj");

        System.out.println(obj1.getName() + obj1.getAge());

    }
}
