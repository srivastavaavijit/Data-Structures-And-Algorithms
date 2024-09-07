package Arrays.TwoPointerApproach;

import java.util.Arrays;

public class segregateZeroesAndOnes {
    public static void main(String[] args) {

        // brute force approach:
        int[] arr = {0, 1, 1, 0, 1, 0, 1,1,1,1};
        int size = arr.length - 1;
//
//        int count_0 = 0;
//        int count_1 = 0;
//
//        for(int i=0; i<size; i++){
//            if(arr[i] == 0)
//                count_0++;
//            else
//                count_1++;
//        }
//
//        for(int i=0; i<count_0; i++)
//            arr[i] = 0;
//
//        for(int j=count_0; j<size; j++)
//            arr[j] = 1;
//
//        System.out.println(Arrays.toString(arr));


        // two pointer approach:
//        int start = 0;
//        int end = size - 1;
//
//        while(start < end){
//            if(arr[start] == 0)
//                start++;
//            else{
//                if(arr[end] == 0){
//                    swap(arr, start, end);
//                    start++;
//                    end--;
//                }
//                else
//                    end--;
//            }
//        }

        // second way to code:
        int start = 0;
        int end = size - 1;;

        while(start < end){
            if(arr[start] == 0)
                start++;
            else{
                if(arr[start] == 1){
                    if(arr[end] == 1)
                        end--;
                    else{
                        swap(arr, start, end);
                        start++;
                        end--;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
