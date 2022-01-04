package problem0009;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x / 10 == 0) {
            return true;
        }

        int length = findLength(x);
        int[] array = new int[length];
        fillArray(array, x);

        int i = 0;
        int j = length - 1;

        do {
            if (array[i] != array[j]) {
                return false;
            }
            i++;
            j--;
        } while (i < j);

        return true;
}

    private int findLength(int x) {
        int length = 0;
        while (x != 0) {
            x = x / 10;
            length++;
        }
        return length;
    }

    private void fillArray(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            array[i] = x % 10;
            x = x / 10;
        }
    }
}
