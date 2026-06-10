public class sum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int ans=0;

        ans=n+sum(n-1);
        return ans;
    }

}
