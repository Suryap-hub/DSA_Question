public class Last_occurrence_in_array {
    public static void main(String[] args){
        int[] arr={1,2,3,2};
        int item=2;
        System.out.println(occur(arr,item,arr.length-1));

    }
    public static int occur(int[] arr,int item,int idx){
        if(arr[0]==arr.length){
            return -1;
        }
        if(arr[idx]==item){
            return idx;
        }
        return occur(arr,item,idx+1);
    }
}
