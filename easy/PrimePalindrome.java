package easy;

/**
 * @author jasnamrb
 * Challenge 3: https://www.codeeval.com/open_challenges/3/
 */

public class PrimePalindrome {
    public static void main (String[] args) {
        for (double num = 1000; num > 1; num--) {
            if (isPalindrome((int) num) && isPrime(num)) {
                System.out.println((int) num);
                break;
            }
        }
    }

    private static boolean isPalindrome(int num) {
        String numString = Integer.toString(num);
        int end = numString.length() -1;
        for (int start = 0; start < numString.length(); start++) {
            if (numString.charAt(start) != numString.charAt(end)) {
                return false;
            }
            end--;
        }
        return true;
    }

    private static boolean isPrime(double num) {
        if (num == (double) 1)
            return true;
        double sqrRoot = Math.sqrt(num);
        for (double otherNum = 2.0; otherNum < sqrRoot; otherNum++) {
            if (num % otherNum == 0)
                return false;
        }
        return true;

    }
}

