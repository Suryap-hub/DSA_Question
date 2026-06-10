public class sum_of_number {
    public static void main(String[] args){
        int n=123;
        System.out.println(number(n));
    }
    public static int number(int n){
        if(n==1){
            return 1;
        }

        return n%10+number(n/10);
    }
}
