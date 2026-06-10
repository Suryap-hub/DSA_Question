public class plaindrome {
    public static void main(String[] args){
        int n=121;
     int rev=plain(n,0);
        System.out.println(drome(n,rev));

    }
    public static int  plain(int n,int rev){
        if(n==0){
            return rev ;
        }
        rev=rev*10+n%10;

          return plain(n/10,rev);


    }
    public static boolean drome(int n,int rev){
        if(n!=rev){
            return false;
        }
        return true;
    }
}
