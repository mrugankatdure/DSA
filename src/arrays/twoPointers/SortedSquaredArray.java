package arrays.twoPointers;

import java.util.Arrays;

public class SortedSquaredArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4}; // 1,4,9,16

        //O(n * logn)
        bruteForce(arr);

        int[] squaredArr = optimised(arr);
        for(int element: squaredArr){
            System.out.print(" "+ element);
        }


    }

    private static int[] optimised(int[] arr) {
        //O(n)
        int left = 0;
        int right = arr.length - 1;
        int squaredIdx = arr.length - 1;
        int[] squaredArr = new int[arr.length];
        while (left <= right){

            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if(leftSquare > rightSquare){
                squaredArr[squaredIdx--] = leftSquare;
                left++;
            }else {
                squaredArr[squaredIdx--] = rightSquare;
                right--;
            }

        }
        return squaredArr;
    }

    private static void bruteForce(int[] arr) {
        int[] newArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i] * arr[i];
        }

        Arrays.sort(newArr);
        for(int element: newArr){
            System.out.print(" "+ element);
        }
    }
}
