public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "Madam";

        String normalized = word.replaceAll("\\s+","").toLowerCase();

        String reversed = new StringBuilder(normalized).reverse().toString();

        if(normalized.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}