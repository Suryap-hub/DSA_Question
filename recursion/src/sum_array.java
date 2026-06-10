public class sum_array {
    public static void main(String[] args){
        int[] arr={1,2,3};
        System.out.println(sum(arr,0));
    }
    public static int sum(int[] arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        int ans=sum(arr,idx+1);
        return ans+arr[idx];


    }
}
