package arrays.dynamicProgramming;

public class CoinChangeInfinite {


    public static void main(String[] args) {

        int[] change = {1,2,3};
        int target = 4;

        //using plain recursion
        System.out.println(noOfWays(change, 0, target));
        //using bottom-up iteration
        bottomUpApproach(change, target);

    }

    private static void bottomUpApproach(int[] change, int target) {

        int[] dp = new int[target + 1];
        int n = change.length;
        dp[0] = 1;

        for(int i = 0; i < n; i++){

            for(int j = change[i]; j <= target; j++){

                dp[j] = dp[j] + dp[j-change[i]];
            }
        }
        System.out.println(dp[target]);
    }

    private static int noOfWays(int[] change, int currentCoin, int target) {

        //base cases here
        if(target == 0) return 1;
        if(target < 0) return 0;
        if(currentCoin >= change.length ) return 0;


       int include = noOfWays(change, currentCoin + 1,  target);
       int exclude = noOfWays(change, currentCoin, target - change[currentCoin]);

       return include + exclude;
    }
}
