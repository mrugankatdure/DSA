package arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        //O(n^2)
       // bruteForce(arr);
        extraSpace(arr);

    }

    private static void extraSpace(int[] target) {

        int n = target.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        prefix[0] = 1;
        suffix[n-1] = 1;
        for(int i = 1; i < n; i++ ){
            prefix[i] = target[i-1] * prefix[i-1];
        }

        for(int i = n-2 ; i >=0 ; i--){
            suffix[i] = target[i+1] * suffix[i+1];
        }

        for(int i = 0; i < prefix.length; i++){
            result[i] = prefix[i] * suffix[i];
        }

        System.out.println("Result =>" + result);

    }


    private static void bruteForce(int[] arr) {
        int[] productArr = new int[arr.length];
        int product;
        for(int i = 0; i < arr.length; i++){
            product = 1;
            for(int j = 0; j < arr.length; j++){

                if(i == j){
                    continue;
                }
                product = arr[j] * product;
            }
            productArr[i] = product;

        }
    }

}
