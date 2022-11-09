package arrays.slidingWindow;

public class MaxSumSizeK {

    /**
     * Given an array, find the max sum of numbers with range equal to k.
     *
     * @param args
     */

    public static void main(String[] args) {

        int[] arr = {100,200,300,400,50}; //op: 700 (300 + 400)
        int k = 2;

        //brute-force solution
        //bruteForce(arr, k);

        //optimised sliding window technique
        optimised(arr, k);
    }

    private static void optimised(int[] arr, int k) {

        /**
         * sliding window O(N)
         */

        int startWindow = 0;

        for(int i = 0; i < k; i++){
            startWindow += arr[i];
        }

        int nextWindow;
        int subtractIndex = 0;
        //int maxSum = 0;
        for(int j = k; j < arr.length; j++){

            nextWindow = (arr[j] + startWindow) - arr[subtractIndex];
            startWindow = Math.max(startWindow, nextWindow);
            subtractIndex++;
        }

        System.out.println(startWindow);
    }

    private static void bruteForce(int[] arr, int k) {
        int maxSize = 0;
        int maxSoFar;
        for(int i = 0; i <= arr.length - k; i++){
            maxSoFar = 0;
            for(int j = i; j < i+ k; j++){
                maxSoFar += arr[j];

            }
            maxSize = Math.max(maxSize,maxSoFar);
        }
        System.out.println(maxSize);
    }


}
