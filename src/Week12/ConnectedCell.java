package Week12;

import java.util.List;

public class ConnectedCell {
    private static boolean[][] visited;
    private static Integer[][] matrixx;
    private static int rows, cols;
    private static int max = 0;
    private static int count;

    public static int connectedCell(List<List<Integer>> matrix) {
        matrixx = new Integer[matrix.size()][];
        visited = new boolean[matrix.size()][];
        rows = matrix.size();
        for (int i = 0; i < matrix.size(); i++) {
            List<Integer> temp = matrix.get(i);
            visited[i] = new boolean[temp.size()];
            matrixx[i] = new Integer[temp.size()];
            cols = temp.size();
            for (int j = 0; j < temp.size(); j++)
                matrixx[i][j] = temp.get(j);
        }
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (matrixx[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    DFS(i, j);
                }
        return max;
    }

    private static void DFS(int x, int y) {
        if (matrixx[x][y] == 1 && !visited[x][y]) {
            count++;
            if (count > max) max = count;
            visited[x][y] = true;

            for (int i = x - 1; i <= x + 1; i++) {
                if (i < 0 || i >= rows) continue;
                for (int j = y - 1; j <= y + 1; j++) {
                    if (j < 0 || j >= cols) continue;
                    if (i == x && j == y) continue;
                    if (matrixx[i][j] == 1 && !visited[i][j]) DFS(i, j);
                }
            }
        }
    }
}