package easy;
/**
 * @author jasnamrb
 * Challenge 25: https://www.codeeval.com/open_challenges/25/
 */
public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }
}
