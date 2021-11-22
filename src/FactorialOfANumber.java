public class FactorialOfANumber {
    /**
    Create a recursive method that finds the
    factorial of the number given as an argument

    TEST DATA:
    5

    EXPECTED RESULT:
    120
     */

    // 1. Iterative way
    public static int factorialOfNumber(int number){
        if(number == 0) return 1;
        else if(number < 0) return -1;
        int temp = 1;
        for (int i = 2; i <= number; i++) {
            temp *= i;
        }
        return temp;
    }

    // 2. Recursive way
    public static int factorialOfNumberRecursively(int number){
        if(number == 0) return 1;
        else if(number < 0) return -1;
        return number * factorialOfNumberRecursively(number - 1);
    }

    //Testing both methods
    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
        System.out.println("\n------------------\n");
        System.out.println(factorialOfNumberRecursively(5));
    }
}
