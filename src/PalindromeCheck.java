public class PalindromeCheck {
    /**
     Create iterative and recursive methods that are used to check if
     a given String is palindrome or not
     NOTE: Palindrome is known as a word that reads the same backward as forward
     Ex: kayak, civic, madam

     TEST DATA:
     civic

     EXPECTED RESULT:
     true
     */

    // 1. Iterative way
    public static boolean isPalindrome(String str){
        if(str.length() <= 1) return true;
        for (int i = 0; i <= str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }
        return true;
    }


    // 2. Recursive way
    public static boolean isPalindromeRecursively(String str){
        if(str.length() <= 1) return true;
        return str.charAt(0) == str.charAt(str.length() - 1) && isPalindromeRecursively(str.substring(1, str.length() - 1));
    }


    //Testing both methods
    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));
        System.out.println("\n------------------\n");
        System.out.println(isPalindromeRecursively("civic"));
    }
}
