package DSALevelUp.Subarrays;

public class sumOfSubarrays {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};;

        // calculate prefix sum:
        int pSum[] = new int[arr.length];
        pSum[0] = arr[0];
        for(int i=1; i< arr.length; i++)
            pSum[i] = pSum[i-1] + arr[i];

        for(int s=0; s<arr.length; s++){
            for(int e=s; e<arr.length; e++){
                // [s,e] -> represents a subarray.

                if(s == 0)
                    System.out.print(pSum[e] + " ");
                else
                    System.out.print(pSum[e] - pSum[s-1] + " ");
            }
            System.out.println();
        }

    }
}
