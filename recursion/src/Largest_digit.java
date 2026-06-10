public class Largest_digit {
    public static void main(String[] args){
        int n=492;
        System.out.println(largest(n));
    }
    public static int largest(int n){
        if(n==0){
            return 1;
        }

        return Math.max(n%10,largest(n/10));
    }
}
