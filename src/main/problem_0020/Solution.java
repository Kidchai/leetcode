package problem_0020;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    static Map<Character, Character> brackets;

    static {
        brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
    }

    public static void main(String[] args) {
        String line1 = "()";
        String line2 = "()[]{}";
        String line3 = "(]";

        System.out.printf("%s: %b", line1, isValid(line1));
        System.out.printf("%s: %b", line2, isValid(line2));
        System.out.printf("%s: %b", line3, isValid(line3));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (brackets.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();

                if (topElement != brackets.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
