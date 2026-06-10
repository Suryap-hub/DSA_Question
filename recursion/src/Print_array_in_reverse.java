public class Print_array_in_reverse {
    public static void main(String[] args){
        int[] arr={1,2,3};
        reverse(arr,arr.length-1);

    }
    public static void reverse(int[] arr,int idx){
        if(idx<0){
            return ;
        }
        System.out.print(arr[idx]+" ");
        reverse(arr,idx-1);
    }
}
