import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";

        LinkedList<Character> list = new LinkedList<>();

        for(char c : word.toCharArray())
            list.add(c);

        boolean palindrome = true;

        while(list.size() > 1){
            if(list.removeFirst() != list.removeLast()){
                palindrome = false;
                break;
            }
        }

        if(palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}