package arrays.recursion;

public class DecimalToBinary {

    public static void main(String[] args) {

        int num = 50;

        int binaryNum = convertToBinary(num);
        System.out.println(binaryNum);

    }

    private static int convertToBinary(int num) {

        //base case here
        if(num <= 0) return 0;

        return num % 2  + 10 * convertToBinary(num/2);


    }
}
