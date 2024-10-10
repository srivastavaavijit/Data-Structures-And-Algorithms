package DSALevelUp.Subarrays;

public class kadanesAlgorithm {
    public static void main(String[] args) {

        // Kadane's Algorithm is used to find maximum sub-array sum.

        int[] arr = {3, 4, 2, -14, 16, -20, 5};

        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {

            sum = sum + arr[i];

            if(sum < 0)
                sum = 0;

            max_sum = Math.max(max_sum, sum);
        }

        System.out.println(max_sum);

    }
}
