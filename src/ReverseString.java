public class ReverseString {
    /**
     Create iterative and recursive methods that are used to reverse
     a given String as an argument

     TEST DATA:
     Hello

     EXPECTED RESULT:
     olleH
     */

    // 1. Iterative way
    public static String reverse(String str){
        if(str.length() <= 1) return str;
        StringBuilder temp = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            temp.append(str.charAt(i));
        }
        return temp.toString();
    }


    // 2. Recursive way
    public static String reverseRecursively(String str){
        if(str.length() <= 1) return str;
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }


    //Testing both methods
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        System.out.println("\n------------------\n");
        System.out.println(reverseRecursively("Hello"));
    }
}
