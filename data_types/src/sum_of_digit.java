import java.util.Scanner;
public class sum_of_digit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=n%10;
        int sum=0;
        while(n>0){
            sum=sum+rem;
            n=n/10;
            rem=n%10;
        }
        System.out.println(sum);
    }
}
