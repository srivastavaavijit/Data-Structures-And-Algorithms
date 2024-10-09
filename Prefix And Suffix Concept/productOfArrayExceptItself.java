package DSALevelUp.prefixAndSuffix;

import java.util.Arrays;

public class productOfArrayExceptItself {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        // calculate prefix product:
        int[] pProd = new int[arr.length];
        pProd[0] = arr[0];
        for(int i=1; i<arr.length-1; i++)
            pProd[i] = pProd[i-1] * arr[i];

        // calculate suffix product:
        int[] sProd = new int[arr.length];
        sProd[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=-0; i--)
            sProd[i] = sProd[i+1] * arr[i];

        // product of element except itself:
        int[] ans = new int[arr.length];

        // product of first element:
        ans[0] = sProd[1];

        // product of last element:
        ans[ans.length-1] = pProd[pProd.length-2];

        for(int i=1; i<arr.length-1; i++){
            ans[i] = pProd[i-1] * sProd[i+1];
        }
        System.out.println(Arrays.toString(ans));
    }
}
