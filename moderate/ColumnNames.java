package moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
    @author jasnamrb
    Challenge 197: https://www.codeeval.com/open_challenges/197/
    Test cases:
        52 -> AZ
        3702 -> ELJ
 */

public class ColumnNames {
        public static void main(String[] args) throws IOException {
            long initialCount = 1;
            Map<Long, String> initial = new HashMap<>();
            while (initialCount <= 26) {
                for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
                    initial.put(initialCount, alphabet + "");
                    initialCount++;
                }
            }
            Map<Long, String> full = new HashMap<>();
            full.putAll(initial);
            long count = 27;
            initialCount = 1;
            long nextCount = 1;
            long tensCount = 0;
            while (!full.containsValue("ZZZ")) {
                for (long i = 1; i <= 26; i++) {
                    if (full.containsValue("ZZ")) {
                        full.put(count, initial.get(nextCount) + initial.get(initialCount) + initial.get(i));
                    } else {
                        full.put(count, initial.get(initialCount) + initial.get(i));
                    }
                    count++;
                }
                initialCount++;
                if (full.containsValue("ZZ")) {
                    if (initialCount == 27) {
                        initialCount = 1;
                        tensCount++;
                    }
                    if (tensCount == 2) {
                        nextCount++;
                        tensCount = 1;
                    }
                }
            }
            File file = new File(args[0]);
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                System.out.println(full.get(Long.parseLong(line)));

            }
        }
    }

