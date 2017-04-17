
public class Euler18 {
    public int run(int[][] triangle) {
        return find(triangle, 0, 0);
    }

    private int find(int[][] triangle, int level, int pointer) {
        if (triangle.length == level + 1)
            return triangle[level][pointer];
        return triangle[level][pointer]
                + Math.max(find(triangle, level + 1, pointer), find(triangle, level + 1, pointer + 1));
    }
}
