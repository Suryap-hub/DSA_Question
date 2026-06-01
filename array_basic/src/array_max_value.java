public class array_max_value {
    public static void main(String[] args){
        int []arr={1,2,3,4,5,6,7};
        System.out.println(max_value(arr));

    }
    public static int max_value(int []arr){
        int m=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){


            if(arr[i]>m){
                m=arr[i];
            }


        }
        return m;
    }
}
