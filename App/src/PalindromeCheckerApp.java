public class PalindromeCheckerApp {

    static boolean check(String str){
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    public static void main(String[] args) {

        String word = "racecar";

        long start = System.nanoTime();

        boolean result = check(word);

        long end = System.nanoTime();

        System.out.println("Palindrome: " + result);
        System.out.println("Execution Time: " + (end - start));

    }
}