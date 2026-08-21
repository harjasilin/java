package course;

public class Loop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 4) {
            System.out.println(i);
            int j = i;
            while (j <= 3) {
                System.out.println("hello" + j);
                j++;
            }
            i++;
        }


        do{
            System.out.println("hello" );
            i++;
        }while(i<9);


        for(int a=1;a<10;a++){
            System.err.println(a);

        }
    }
}