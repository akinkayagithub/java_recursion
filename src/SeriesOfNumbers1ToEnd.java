public class SeriesOfNumbers1ToEnd {
    /**
     Create iterative and recursive methods that are used to print
     the numbers from 1 to given number as an argument

     TEST DATA:
     7

     EXPECTED RESULT:
     1
     2
     3
     4
     5
     6
     7
     */

    // 1. Iterative way
    public static void printNumbers1ToEnd(int end){
        for (int i = 1; i <= end; i++) {
            System.out.println(i);
        }
    }


    // 2. Recursive way
    public static void printNumbers1ToEndRecursively(int end){
        if(end == 0) return;
        printNumbers1ToEndRecursively(end - 1);
        System.out.println(end);
    }


    //Testing both methods
    public static void main(String[] args) {
        printNumbers1ToEnd(7);
        System.out.println("\n------------------\n");
        printNumbers1ToEndRecursively(7);
    }
}
