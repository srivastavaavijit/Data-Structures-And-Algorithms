package Arrays.BasicProblems;

public class secondGreatestElement {
    public static void main(String[] args) {
        // approach: traversing the array.
        int[] arr = {19, 12, 6, 9, 25, 12, 8};
        int size = arr.length - 1;

        // finding maximum element:
        int max = -1;
        for(int i=0; i<size; i++){
            if(arr[i] > max)
                max = arr[i];
        }

        // finding second maximum element:
        int second_max = -1;
        for(int i=0; i<size; i++){
            if(arr[i] == max)
                continue;
            else{
                if(arr[i] > second_max)
                    second_max = arr[i];
            }
        }

        System.out.println("Second largest element is:" + " " + second_max);
    }

}
