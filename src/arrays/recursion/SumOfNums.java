package arrays.recursion;

public class SumOfNums {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5}; // find sum recursively

        int sum = findSum(arr, 0);
        System.out.println(sum);

    }

    private static int findSum(int[] arr, int i) {

        //base case
        if(i == -1) return 0;
        if(i == arr.length) return 0;

        return arr[i] + findSum(arr, i + 1);
    }
}
