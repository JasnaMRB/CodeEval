package easy;

/**
 * @author: jasnamrb
 * Challenge 4: https://www.codeeval.com/open_challenges/4
 */

public class SumOfPrimes {
    public static void main (String[] args) {
        int sum = 0;
        int count = 0;
        int num = 2;
       while (count < 1000) {
            if (isPrime((double) num)) {
                sum += num;
                count++;
            }
            num++;

        }
        System.out.println(sum);
    }

    private static boolean isPrime(double num) {
        if (num == 2)
            return true;
        double sqrRoot = Math.sqrt(num);
        for (double otherNum = 2.0; otherNum <= sqrRoot; otherNum++) {
            if (num % otherNum == 0)
                return false;
        }
        return true;
    }
}
