public class Product_of_digits {
    public static void main(String[] args){
        int n=234;
        System.out.println(product(n));

    }
    public static int product(int n){
        if(n==0){
            return 1;

        }
        return n%10*product(n/10);
    }
}
