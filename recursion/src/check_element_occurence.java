public class check_element_occurence {
    public static void main(String[] args){
        int[] arr={1,2,3,2};
        int item=2;
        System.out.println(occur(arr,item,0,0));
    }
    public static int occur(int[] arr,int item,int idx, int count){
        if(idx==arr.length) {
            return count;
        }

        if(arr[idx]==item){
            count++;
        }

        return occur(arr,item,idx+1,count);


    }
}
