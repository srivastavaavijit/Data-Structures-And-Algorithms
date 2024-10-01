package DSAFoundation.Arrays.Problems;

import java.util.Arrays;

public class rotateArrayByKpositions {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int k = 4;

        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);

        reverse(arr, 0 , k-1);

        reverse(arr, k, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int s, int e){

        int sp = s;
        int ep = e;

        while(sp < ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;

            sp++;
            ep--;
        }

    }

}
