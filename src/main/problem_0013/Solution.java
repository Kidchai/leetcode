package problem_0013;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution {

    private static final Map<Character, Integer> keys = new HashMap<>();
    private static final List<Integer> specialCases = Arrays.asList(1, 10, 100);

    static {
        keys.put('I', 1);
        keys.put('V', 5);
        keys.put('X', 10);
        keys.put('L', 50);
        keys.put('C', 100);
        keys.put('D', 500);
        keys.put('M', 1000);
    }

    public static void main(String[] args) {
        String number1 = "III";
        String number2 = "LVIII";
        String number3 = "MCMXCIV";

        System.out.println(romanToInt(number1));
        System.out.println(romanToInt(number2));
        System.out.println(romanToInt(number3));
    }

    public static int romanToInt(String s) {
        int[] numbers = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            numbers[i] = keys.get(s.charAt(i));
        }

        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (i == numbers.length - 1) {
                result += current;
                break;
            }
            int next = numbers[i + 1];

            if (specialCases.contains(current) && (next == current * 5 || next == current * 10)) {
                result += next - current;
                i++;
            } else {
                result += current;
            }
        }
        return result;
    }
}
