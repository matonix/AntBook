package dataStructure2_4;

import libs.UnionFind;

import java.util.List;
import java.util.stream.IntStream;

public class FoodChain {
    public static int solve(int N, int K, List<List<Integer>> info) {
        UnionFind u = new UnionFind(3 * N);
        int ans = 0;
        for (List<Integer> triple : info) {
            int type = triple.get(0);
            int x = triple.get(1) - 1;
            int y = triple.get(2) - 1;
            // invalid number
            if (x < 0 || N <= x || y < 0 || N <= y) {
                ans++;
                continue;
            }
            if (type == 1) {
                // x <=> y
                if (u.same(x, y + N) || u.same(x, y + N * 2)) {
                    ans++;
                } else {
                    u.unite(x, y);
                    u.unite(x + N, y + N);
                    u.unite(x + N * 2, y + N * 2);
                }
            } else {
                // x eats y
                if (u.same(x, y) || u.same(x, y + N * 2)) {
                    ans++;
                } else {
                    u.unite(x, y + N);
                    u.unite(x + N, y + N * 2);
                    u.unite(x + N * 2, y);
                }
            }
        }
        return ans;
    }
}