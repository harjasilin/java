package course;

public class Condition {
    public static void main(String[] args){
        int a=10;
        int n=90;
        if(a<n){
            System.out.println("hello");
        }
        int result =0;
        result =a%2==0?10:20;
        System.out.println(result);


        switch(a){
            case 10:System.out.println("hello");
            break;
            default:System.out.println("hiii");
        }
    }
}
