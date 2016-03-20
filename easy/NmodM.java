package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jasnamrb
 *         Challenge 62: https://www.codeeval.com/open_challenges/62/
 */
public class NmodM {
    public static int get(int n, int m) {
        int start = n;
        while (start > 0) {
            if (start < 0) {
                start = start + m;
                return start;
            } else start = start - m;
        }
        if (start < 0) start = start + m;
        return start;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] ary;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            ary = line.split(",");
            System.out.println(get(Integer.parseInt(ary[0]), Integer.parseInt(ary[1])));
        }
    }
}
