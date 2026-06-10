public class Count_even_numbers {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(even_count(arr,0,0));
    }
    public static int even_count(int[] arr,int idx,int count ){
        if(idx==arr.length){
            return count;
        }
        if(arr[idx]%2==0){
            count++;
        }
        return even_count(arr,idx+1,count);

    }
}
