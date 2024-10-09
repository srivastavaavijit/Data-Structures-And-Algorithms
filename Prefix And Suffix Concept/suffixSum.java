package DSALevelUp.prefixAndSuffix;

import java.util.Arrays;

public class suffixSum {
    public static void main(String[] args) {

        int[] arr = {4, 1, 6, -2, 7};
        int n = arr.length;

        int[] sSum = new int[n];
        sSum[n-1] = arr[n-1];

        for(int i=n-2; i>=0; i--){
            sSum[i] = sSum[i+1] + arr[i];
        }

        System.out.println(Arrays.toString(sSum));
    }
}
