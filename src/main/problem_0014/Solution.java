package problem_0014;

public class Solution {
    public static void main(String[] args) {
        String[] strings1 = {"flower", "flow", "flight"};
        String[] strings2 = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strings1));
        System.out.println(longestCommonPrefix(strings2));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        int minWord = 200;
        for (String word : strs)
            minWord = Math.min(minWord, word.length());

        for (int i = 0; i < minWord; i++) {
            char common = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != common)
                    return result.toString();
            }
            result.append(common);
        }
        return result.toString();
    }
}
