public class Sum_of_alternate_digits {
    public static void main(String[] args){
        int[] n={1,2,3,4,5};

        System.out.println(sum_alternate(n,0));
    }
public static int sum_alternate(int[] n,int idx){
        if(idx>=n.length){
            return 0;
        }
        n[idx]=n[idx]+n[idx+2];

        return sum_alternate(n,idx+1);

}

}
