package arrays.recursion;

public class PowerOfTwo {

    public static void main(String[] args) {

        int base = 2, exponent = 2;

        //calculate power of 2 using recursion
        int result = powerOfTwo(base, exponent);
        System.out.println(result);

    }

    private static int powerOfTwo(int base, int exponent) {

        //base case here
        if(exponent == 0) return 1;

        return base * powerOfTwo(base, exponent - 1 );

    }
}
