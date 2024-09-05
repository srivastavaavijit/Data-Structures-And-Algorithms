package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class arraysImplementation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // array syntax:
        // datatype[] variable_name = new datatype[size];

//        int[] arr = new int[7];
//
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//
//        int[] nums = new int[4];
//        nums[0] = 10;
//        System.out.println(Arrays.toString(nums));
//
//        String[] arr = new String[3];
//        arr[0] = "Kunal";
//        System.out.println(Arrays.toString(arr));
//
//        for(int i=0; i<nums.length; i++){
//            nums[i] = sc.nextInt();
//        }
//
//        System.out.println(Arrays.toString(nums));
//
//        // for each loop:
//        for(int num: nums){ // num represents element of array.
//            System.out.println(num + " ");
//        }

        // array of objects:
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = sc.next();
//        }
//
//        System.out.println(Arrays.toString(str));

        // passing in function:

        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
