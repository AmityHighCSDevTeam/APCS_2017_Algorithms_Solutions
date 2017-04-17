import java.util.*;
import java.io.*;

public class Euler67 {
    static Number run() throws FileNotFoundException {
        Scanner in = new Scanner(new File("E67.txt"));
        int[] prevLine = { 0, 0, 0 };
        while (in.hasNext()) {
            String[] line = in.nextLine().split(" ");
            int[] intLine = new int[line.length + 2];
            intLine[0] = 0;
            for (int i = 1; i <= line.length; i++) {
                intLine[i] = Integer.parseInt(line[i - 1]) + Math.max(prevLine[i - 1], prevLine[i]);
            }
            intLine[intLine.length - 1] = 0;
            prevLine = new int[intLine.length];
            System.arraycopy(intLine, 0, prevLine, 0, intLine.length);
        }
        int max = 0;
        for (int i : prevLine) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
