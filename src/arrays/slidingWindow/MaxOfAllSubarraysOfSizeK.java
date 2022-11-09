package arrays.slidingWindow;

import java.util.ArrayList;

public class MaxOfAllSubarraysOfSizeK {

    /**
     * Given an array, find the max of all falling within a range equal to K.
     *
     * @param args
     */

    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        doubleLoop(arr, k);

        /**
         * another approach O(arr * k)
         */

        int maxSoFar;
        ArrayList<Integer> maxNums = new ArrayList<>();
        int ptr1 = 0, ptr2 = 0, numPos;
        while(ptr1 < arr.length - 2){
            numPos = ptr1;
            maxSoFar = 0;
            while (ptr2 < k){
                maxSoFar = Math.max(maxSoFar, arr[numPos]);
                ptr2++;
                numPos++;
            }
            maxNums.add(maxSoFar);
            ptr1++;
            ptr2 = 0;
        }



        System.out.println(maxNums);

    }

    private static void doubleLoop(int[] arr, int k) {

        /**
         * time complexity : O(arr * k)
         */

        int maxSoFar;
        ArrayList<Integer> maxValueList = new ArrayList<>();
        for(int i = 0; i <= arr.length - k; i++){
            maxSoFar = 0;
            for(int j = i; j < i+ k; j++){
                maxSoFar = Math.max(maxSoFar, arr[j]);
            }
            maxValueList.add(maxSoFar);
            //maxSize = Math.max(maxSize,maxSoFar);
        }
        System.out.println(maxValueList);
    }
}
