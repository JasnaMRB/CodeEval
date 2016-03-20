package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author jasnamrb
 * Challenge 208: https://www.codeeval.com/open_challenges/208/
 * Test cases:
 * 72 64 150 | 100 18 33 | 13 250 -6
 * 10 25 -30 44 | 5 16 70 8 | 13 1 31 12
 * 100 6 300 20 10 | 5 200 6 9 500 | 1 10 3 400 143
 * -->
 * 100 250 150
 * 13 25 70 44
 * 100 200 300 400 500
 */
public class FindTheHighestScore {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] ary;
        int columns;
        int count = 0;
        while ((line = buffer.readLine()) != null) {
            ary = line.split(" ");
            columns = Arrays.asList(ary).indexOf("|");
            Integer[] highAry = new Integer[columns];
            for (String num : ary) {
                if (!num.equals("|")) {
                    if (highAry[count] == null) highAry[count] = Integer.parseInt(num);
                    else
                    if (Integer.parseInt(num) > highAry[count]) highAry[count] = Integer.parseInt(num);
                    count++;
                }
                else count = 0;
            }
            Arrays.stream(highAry).forEach(nums -> System.out.print(nums + " "));
            System.out.println();
            count = 0;
        }
    }
}
