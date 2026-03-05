interface PalindromeStrategy{
    boolean check(String str);
}

class ReverseStrategy implements PalindromeStrategy{

    public boolean check(String str){
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}

public class PalindromeCheckerApp{

    public static void main(String[] args){

        PalindromeStrategy strategy = new ReverseStrategy();

        String word = "madam";

        if(strategy.check(word))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}