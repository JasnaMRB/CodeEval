package java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jasnamrb
 * Challenge 167: https://www.codeeval.com/open_challenges/167/
 * Test cases:
 * Tom exhibited.
 * Amy Lawrence was proud and glad, and she tried to make Tom see it in her face - but he wouldn't look.
 * Tom was tugging at a button-hole and looking sheepish.
 * Two thousand verses is a great many - very, very great many.
 * Tom's mouth watered for the apple, but he stuck to his work.
 * -->
 * Tom exhibited.
 * Amy Lawrence was proud and glad, and... <Read More>
 *     Tom was tugging at a button-hole and looking sheepish.
 *     Two thousand verses is a great many -... <Read More>
 *         Tom's mouth watered for the apple, but... <Read More>
 */
public class ReadMore {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            if (line.length() <= 55) System.out.println(line);
            else {
                line = line.substring(0, 40);
                if (line.contains(" ")) line = line.substring(0, line.lastIndexOf(" "));
                System.out.println(line.trim() + "... <Read More>");
            }
        }
    }
}
