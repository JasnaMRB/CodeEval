package java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jasnamrb
 * Challenge 214: https://www.codeeval.com/open_challenges/214/
 * Test cases:
 * 02:26:31 14:44:45 09:53:27
 * 05:33:44 21:25:41
 * -->
 * 14:44:45 09:53:27 02:26:31
 * 21:25:41 05:33:44
 */

public class TimeToEat {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Jasna\\Desktop\\test.txt");
        //File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            List<String> sorted = new ArrayList<>();
            Collections.addAll(sorted, line.split(" "));
            Collections.sort(sorted);
            Collections.reverse(sorted);
            for (String time : sorted) System.out.print(time + " ");
            System.out.println();
        }
    }
}
