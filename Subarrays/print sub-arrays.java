package DSALevelUp.Subarrays;

public class printSubarrays {
    public static void main(String[] args) {

        int[] arr = {5, 3, -1, 8};

        for(int s=0; s<arr.length; s++){
            for(int e = s; e<arr.length; e++){
                // [s,e] -> represents a subarray.

                for(int k=s; k<=e; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }
}
