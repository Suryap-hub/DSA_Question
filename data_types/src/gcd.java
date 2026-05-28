import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();// dividend
        int b=sc.nextInt();//divisor
        System.out.println(greatestdivisor(a,b));

    }
    public static int greatestdivisor(int a,int b) {
        while (a % b != 0) {
            int c = a % b;// remainder
            a=b;
            b=c;


        }
        return b;
    }
}
