public class Check_prime {
    public static void main(String[] args){
        int n=4;
        System.out.println(checker(n,n-1));
    }
    public static boolean checker(int n,int i){
        if(n==0){
            return true;
        }
        if(n%i==0){
            return false;
        }
        checker(n,i-1);
        return true;
    }
}
