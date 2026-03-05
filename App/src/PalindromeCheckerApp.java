import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "racecar";

        Deque<Character> deque = new LinkedList<>();

        for(char c : word.toCharArray())
            deque.add(c);

        boolean palindrome = true;

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
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