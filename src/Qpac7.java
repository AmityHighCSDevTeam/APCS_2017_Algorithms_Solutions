import java.util.*;
public class Qpac7 {

    public static int recurse(Integer[] k, int loc, int end, int m) {
        if (loc + m >= end) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        boolean possible = false;
        for (int i : k) {
            if (loc + m < i) {
                continue;
            }
            if (i <= loc) {
                continue;
            }
            int j = recurse(k, i, end, m);
            if (j < min && j >= 0) {
                min = j;
            }
            if (j >= 0) {
                possible = true;
            }

        }
        if (possible) {
            return min + 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int k = 0; k < n; k++) {
            StringTokenizer st = new StringTokenizer(input.nextLine());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            Integer[] stations = new Integer[s];
            ArrayList<Integer> stationsSort = new ArrayList<Integer>();
            for (int i = 0; i < s; i++) {
                stationsSort.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(stationsSort);
            stations = stationsSort.toArray(new Integer[0]);
            int u = recurse(stations, 0, d, m);
            System.out.println(u == -1 ? "IMPOSSIBLE" : u);
        }
    }
}
