import java.util.*;
public class check_prime_number {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        prime_number(num);
    }
    public static void prime_number(int num){
        int count=0;
        for(int i=2;i<num-1;i++) {
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count>=1){
            System.out.println("not Prime Number");
        }
        else{
            System.out.println(" Prime ");
        }
    }
}

