public class print_indices {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int item = 2;
     occur(arr, item, arr.length-1);
    }

    public static void occur(int[] arr, int item, int idx) {
        if (idx <=0) {
            return ;
        }

            if (arr[idx] == item) {

                System.out.println(idx);
            }


        occur(arr, item, idx-1 );


    }
}


