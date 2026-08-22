package course;

public class ArrayMethod {
    public static void main(String[] a) {
        int nums[] = { 3, 7, 2, 4 };
        nums[1] = 9;
        System.out.println(nums[0]);
        System.out.println(nums[1]);

        int num2[] = new int[3];
        num2[0] = 10;
        num2[1] = 20;
        num2[2] = 30;
        for (int i = 0; i < 3; i++) {
            System.out.println(num2[i]);
        }

        int num[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 10);

            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();

        }

    }
}
