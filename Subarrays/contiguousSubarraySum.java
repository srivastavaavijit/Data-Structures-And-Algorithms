package DSALevelUp.Subarrays;

//https://leetcode.com/problems/continuous-subarray-sum/?envType=problem-list-v2&envId=prefix-sum

public class contiguousSubarraySum {
    public static void main(String[] args) {

        int[] nums = {23, 2, 6, 4, 7};
        int k = 13;

        System.out.println(checkSubarraySum(nums, k));
    }
    public static boolean checkSubarraySum(int[] nums, int k){

        // calculate prefix-sum:
        int[] psum = new int[nums.length];
        psum[0] = nums[0];
        for(int i=1; i< nums.length; i++)
            psum[i] = psum[i-1] + nums[i];


        // calculate contiguous sub-array sum:
        for(int s=0; s<nums.length; s++){
            for(int e=s; e< nums.length; e++){
//                [s,e] -> represents a subarray
                int sum = 0;
                if((e-s+1) >= 2){
                    if(s == 0){
                        sum = psum[e];
                        if(sum%k == 0)
                            return true;
                    }
                    else{
                        sum = psum[e] - psum[s-1];
                        if(sum%k == 0)
                            return true;
                    }
                }
            }
        }
        return false;
    }
}
