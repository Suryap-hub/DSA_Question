import java.util.Scanner;

public class reverse_number {

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int rem=n%10;
            int rev=0;
            while(n>0){
                rev=rev*10+rem;
                n=n/10;
                rem=n%10;
            }
            System.out.println(rev);
        }
    }


