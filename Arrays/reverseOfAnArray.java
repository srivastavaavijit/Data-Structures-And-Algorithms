package Arrays.BasicProblems;

import java.util.Arrays;

public class reverseOfAnArray {
    public static void main(String[] args) {
        // brute force:

        int[] arr = {6,12,5,4,9,15,7};
//        int size = 7;
//
//        int[] temp = new int[size];
//
//        int temp_start = 0;
//        for(int i=size-1; i>=0; i--){
//            temp[temp_start] = arr[i];
//            temp_start++;
//        }
//
//        System.out.println(Arrays.toString(temp));

        // two-pointer approach:
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
