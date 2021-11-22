public class SumOfSeriesOfNumbers1ToEnd {
    /**
    Create iterative and recursive methods that are used to find the sum of
    the numbers from 1 to 5

    EXPECTED RESULT:
    15
     */

    // 1. Iterative way
    public static int sumOfSeriesOfNumbers1ToEnd(int end){
        int sum = 0;
        for (int i = 1; i <= end; i++) {
            sum += i;
        }
        return sum;
    }


    // 2. Recursive way
    public static int sumOfSeriesOfNumbers1ToEndRecursively(int end){
        if(end != 0) return end + sumOfSeriesOfNumbers1ToEndRecursively(end - 1);
        return 0;
    }


    //Testing both methods
    public static void main(String[] args) {
        System.out.println(sumOfSeriesOfNumbers1ToEnd(5));
        System.out.println("\n------------------\n");
        System.out.println(sumOfSeriesOfNumbers1ToEndRecursively(5));
    }
}
