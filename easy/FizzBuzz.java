package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int x, y, n;
        String[] ary;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            ary = line.split(" ");
            x = Integer.parseInt(ary[0]);
            y = Integer.parseInt(ary[1]);
            n = Integer.parseInt(ary[2]);
            for (int i = 1; i <= n; i++) {
                if (i % x == 0 && i % y == 0) System.out.print("FB");
                else if (i % x == 0) System.out.print("F");
                else if (i % y == 0) System.out.print("B");
                else System.out.print(i);
                if (i != n) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
