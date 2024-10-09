package DSALevelUp.prefixAndSuffix;

public class trappingRainWater {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;

        // calculate prefix max:
        int[] pMax = new int[n];
        pMax[0] = arr[0];
        for(int i=1; i<n; i++)
            pMax[i] = Math.max(pMax[i-1], arr[i]);

        // calculate suffix max:
        int[] sMax = new int[n];
        sMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--)
            sMax[i] = Math.max(sMax[i+1], arr[i]);

        // calculate amount of water that can be stored:
        int amount = 0;
        for(int i=1; i<n-1; i++){

            int lb = pMax[i-1];
            int rb = sMax[i+1];

            int contribution = Math.min(lb, rb) - arr[i];

            if(contribution > 0)
                amount += contribution;
        }
        System.out.println(amount);
    }
}
