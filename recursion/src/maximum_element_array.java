public class maximum_element_array {
    public static void main(String[] args){
        int[] arr={1,5,3};
        System.out.println(greater(arr,0));

    }
    public static int greater(int[] arr,int idx){
        if(arr[idx]==arr.length){
            return -1;
        }
        int m=greater(arr,idx+1);
        return Math.max(arr[idx],m);
    }
}
