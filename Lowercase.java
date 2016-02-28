import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jasnamrb
 * Challenge 20: https://www.codeeval.com/open_challenges/20/
 * Test cases:
 * HELLO CODEEVAL
 * This is some text
 * -->
 * hello codeeval
 * this is some text
 */

public class Lowercase {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] ary;
        StringBuilder build = new StringBuilder();
        while ((line = buffer.readLine()) != null) {
            ary = line.split(" ");
            for (String word : ary) {
                build.append(word.toLowerCase() + " ");
            }
            build.append(System.lineSeparator());
        }
        System.out.print(build.toString());
    }
}
