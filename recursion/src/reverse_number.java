public class reverse_number {
    public static void main(String[] args){
        int n=2345;

        System.out.println(reverse(n,0));

    }
    public static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }




        rev=rev*10+n%10;
        return reverse(n/10,rev);
    }
}
