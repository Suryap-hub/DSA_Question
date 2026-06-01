public class array_max_function {
    // it is with using max function
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println(max(arr));

    }
    public static int max(int []arr){
        int m=Integer.MIN_VALUE;// lowest integer value 2^-31
        for(int i=0;i<arr.length;i++){
            m=Math.max(arr[i],m);// this is the function
        }
        return m;
    }
}
