package DSALevelUp.prefixAndSuffix;

public class EquilibriumIndex {
    public static void main(String[] args) {

        int[] arr = {-1,-1,0,1,1,-1};

        int[] pSum = new int[arr.length];
        int[] sSum = new int[arr.length];

        // calculating prefix sum:
        pSum[0] = arr[0];
        for(int i=1; i<arr.length; i++)
            pSum[i] = pSum[i-1] + arr[i];

        // calculating suffix sum:
        sSum[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--)
            sSum[i] = sSum[i+1] + arr[i];

        int ans = 0;
        for(int i=1; i< arr.length-1; i++) {
            int left_sum = pSum[i - 1];
            int right_sum = sSum[i + 1];

            if (left_sum == right_sum)
                ans++;
        }

        // check for first element:
        if(0 == sSum[1])
            ans++;

        // check for last element:
        if(pSum[arr.length-2] == 0)
            ans++;

        System.out.println(ans);
    }
}
