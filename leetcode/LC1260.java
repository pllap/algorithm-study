import java.util.ArrayList;
import java.util.List;

public class LC1260 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int numRow = grid.length;
        int numCol = grid[0].length;
        int numElement = numRow * numCol;
        k %= numElement;

        List<List<Integer>> result = new ArrayList<>();
        for (int r = 0; r < numRow; ++r) {
            List<Integer> line = new ArrayList<>();
            result.add(line);
            for (int c = 0; c < numCol; ++c) {
                // think it as a one-dimensional array, calc its index after shifting k
                int index = (numElement + (r * numCol) + c - k) % numElement;
                line.add(grid[index / numCol][index % numCol]);
            }
        }

        return result;
    }

    // shift k times (bad efficiency)
    public List<List<Integer>> shiftGrid1(int[][] grid, int k) {
        int numRow = grid.length;

        List<List<Integer>> listGrid = asList(grid);
        for (int i = 0; i < k; ++i) {
            shiftOnce(listGrid, numRow);
        }
        return listGrid;
    }

    public List<List<Integer>> asList(int[][] arr) {
        List<List<Integer>> list = new ArrayList<>();
        for (int[] row : arr) {
            List<Integer> listRow = new ArrayList<>();
            for (int n : row) {
                listRow.add(n);
            }
            list.add(listRow);
        }
        return list;
    }

    public void shiftOnce(List<List<Integer>> grid, int numRow) {
        // add last element of current row to first element of next row
        for (int i = 0; i < numRow; ++i) {
            List<Integer> curRow = grid.get(i);
            List<Integer> nextRow = grid.get((i + 1) % numRow);
            int lastElementInCurRow = curRow.remove(curRow.size() - 1);
            nextRow.add(0, lastElementInCurRow);
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC1260().shiftGrid(new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}}, 4));
    }
}
