import java.util.*;
public class Qpac6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            Wrapper[] wraps = Arrays.stream(in.nextLine().split("\\s+")).map(Wrapper::new).toArray(Wrapper[]::new);
            Arrays.sort(wraps);
            System.out.println(Arrays.toString(wraps));
        }

    }

    public static class Wrapper implements Comparable<Wrapper> {
        public String str;

        Wrapper(String str) {
            this.str = str;
        }

        public int compareTo(Wrapper o) {
            return str.length() - o.str.length();
        }

        @Override
        public String toString() {
            return str;
        }
    }
}
