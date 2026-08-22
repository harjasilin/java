package course;

class Calculator2 {

    int num = 10;

    public void playMusic() {
        System.out.println("out");
    }

    public String getMyPen(int cost) {
        if (cost > 10) {
            return "pen";
        }
        return "nothing";
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        System.out.println(num);
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class Method2 {
    public static void main(String[] args) {
        Calculator2 obj = new Calculator2();
        obj.playMusic();
        String str = obj.getMyPen(9);
        System.out.println(str);

        int r1 = obj.add(10, 20, 90);
        System.out.println(r1);
        int r2 = obj.add(10, 20);
        System.out.println(r2);
    }
}
