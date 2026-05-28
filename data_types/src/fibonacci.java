import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(fib(a,b,num));
    }

    public static int fib(int a,int b,int num){
        int c=0;
        for(int i=1;i<=num;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return a;
    }


}
