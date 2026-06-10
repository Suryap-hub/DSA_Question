public class occurence_once {
    public static void main(String[] args){
        int[] arr={1,2,3,2};
        int item=2;
        System.out.println(occur(arr,item,0));
    }
    public static int occur(int[] arr,int item,int idx){
        if(idx==arr.length) {
            return -1;
        }

        if(arr[idx]==item){
           return idx;
        }

        return occur(arr,item,idx+1);


    }
}


