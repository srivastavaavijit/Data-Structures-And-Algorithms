package DSALevelUp.Subarrays;

public class sumOfAllSubarraysSum {
    public static void main(String[] args) {

        int[] arr = {5, 3, -1, 8};
        int total_sum = 0;

//          Approach - 1:

//        int pSum[] = new int[arr.length];
//        pSum[0] = arr[0];
//        for(int i=1; i< arr.length; i++)
//            pSum[i] = pSum[i-1] + arr[i];
//
//        for(int s=0; s<arr.length; s++){
//            for(int e=s; e<arr.length; e++){
//                // [s,e] -> represents a subarray.
//
//                if(s == 0)
//                    total_sum += pSum[e];
//                else
//                    total_sum += (pSum[e] - pSum[s-1]);
//            }
//        }
//
//        System.out.println(total_sum);


        // Approach - 2: Contribution Technique-

        for(int i=0; i<arr.length; i++){

            int valid_starting_points = i+1;
            int valid_ending_points = arr.length - i;

            int number_of_occurence = valid_starting_points * valid_ending_points;
            int contribution = number_of_occurence * arr[i];

            total_sum += contribution;
        }
        System.out.println(total_sum);
    }
}
