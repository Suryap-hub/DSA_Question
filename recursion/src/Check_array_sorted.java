import java.util.*;

public class Check_array_sorted {
    public static void main(String[] args){
        int[] arr = {1,3,2};
        System.out.println(sort(arr,0));
    }

    public static boolean sort(int[] arr,int idx){
        if(idx == arr.length - 1){
            return true;
        }

        boolean ans = sort(arr, idx + 1);

        if(arr[idx] <= arr[idx + 1]) {
            return ans;
        }

        return false;
    }
}