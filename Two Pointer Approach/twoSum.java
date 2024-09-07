package Arrays.TwoPointerApproach;

public class twoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15, 27};
        int size = arr.length - 1;
        int target = 27;

        // brute force approach: trying all possible combination.
//        boolean flag = false;
//        for(int i=0; i<size-1; i++){
//            for(int j=i+1; j<size; j++){
//                if(arr[i] + arr[j] == target){
//                    System.out.println("yes");
//                    flag = true;
//                    break;
//                }
//            }
//        }
//        if(!flag)
//            System.out.println("No");



        // applying binary search approach:
//        boolean ans = false;
//        for(int i=0; i<size-1; i++){
//            int search = target - arr[i];
//            ans = binarySearch(arr,i+1,size,search);
//            if(ans){
//                System.out.println("Yes");
//                break;
//            }
//        }
//        if(!ans)
//            System.out.println("No");
//    }
//    static boolean binarySearch(int[] arr, int start, int end, int target){
//        while(start < end){
//            int mid = start + (end - start)/2;
//            if(arr[mid] == target)
//                return true;
//            else if(arr[mid] > target)
//                end--;
//            else
//                start++;
//        }
//        return false;


        // two-pointer approach:
        int start = 0;
        int end = size;
        boolean flag = false;

        while(start < end){

            int sum = arr[start] + arr[end];

            if(sum == target){
                flag = true;
                System.out.println("Yes");
                break;
            }

            else if(sum > target)
                end--;

            else
                start++;
        }

        if(!flag)
            System.out.println("No");
    }
}
