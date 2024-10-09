import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args) {

        int[] arr = {4, 1, 6, -2, 7};
        int n = 5;

        int[] pSum = new int[n];
        pSum[0] = arr[0];

        for(int i=1; i<n; i++){
            pSum[i] = pSum[i-1] + arr[i];
        }

        System.out.println(Arrays.toString(pSum));
    }
}
