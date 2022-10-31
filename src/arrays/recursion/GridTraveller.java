package arrays.recursion;

public class GridTraveller {

    public static void main(String[] args) {

        int[][] grid = new int[2][2];

        int total = totalWays(3, 3);
        System.out.println(total);

    }

    private static int totalWays(int row, int column) {

        //base case here
        if(row == 0 || row == 1) return 1;
        if(column == 0 || column == 1) return 1;

        return totalWays(row - 1, column) + totalWays(row, column - 1);
    }
}
