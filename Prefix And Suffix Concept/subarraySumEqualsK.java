package DSALevelUp.prefixAndSuffix;

public class subarraySumEqualsK {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1};
        int k = 2;

        // calculate prefix sum:
        int[] pSum = new int[arr.length];
        pSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            pSum[i] = pSum[i-1] + arr[i];
        }

        // calculate subarray sum:
        int count = 0;
        for(int s=0; s<arr.length; s++){
            for(int e=s; e<arr.length; e++){
//                [s,e] -> represents a subarray;
                if(s > 0){
                    if(pSum[e]-pSum[s-1] == k)
                        count++;
                }
                else{
                    if(pSum[e] == k)
                        count++;
                }
            }
        }

        System.out.println(count);

    }
}
