package course;

class Calculator {
    public int add(int n1, int n2) {
        int r = n1 + n2;
        System.out.println("in add");
        return r;
    }
}

public class Method1 {
    public static void main(String[] args) {
        int n = 10;
        int m = 20;
        Calculator calc = new Calculator();
        int result = calc.add(n, m);
        System.out.println(result);
    }
}
