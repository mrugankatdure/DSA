package arrays.dynamicProgramming;

public class CoinChangeInfinite {


    public static void main(String[] args) {

        int[] change = {1,2,3};
        int target = 4;

        System.out.println(noOfWays(change, change.length - 1, target));
    }

    private static int noOfWays(int[] change, int currentCoin, int target) {

        //base cases here
        if(target == 0) return 1;
        if(target <= 0) return 0;
        if(currentCoin <= 0) return 0;


       int include = noOfWays(change, currentCoin - 1,  target - change[currentCoin]);
       int exclude = noOfWays(change, currentCoin, target - change[currentCoin - 1]);

       return include + exclude;
    }
}
