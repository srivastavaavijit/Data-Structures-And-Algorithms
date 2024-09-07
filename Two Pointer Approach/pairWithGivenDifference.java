package Arrays.TwoPointerApproach;

public class pairWithGivenDifference {
    public static void main(String[] args) {

        //two-pointer approach:
        int[] arr = {2, 3, 5, 10, 50, 80};
        int target = 5;

        int start = 0;
        int end = 1;

        boolean flag = false;
        while(end < arr.length){

            if(arr[end]- arr[start] == target){
                flag=true;
                System.out.println("Yes");
                break;
            }

            else if(arr[end]- arr[start] < target)
                end++;

            else
                start++;
        }

        if(!flag)
            System.out.println("No");
    }
}
