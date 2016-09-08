package libs;

import java.util.stream.IntStream;

public class UnionFind {

    private int[] par;
    private int[] rank;

    public UnionFind(int n) {
        par = IntStream.range(0, n).toArray();
        rank = new int[n];
    }

    public int find(int x) {
        return par[x] == x ? x : (par[x] = find(par[x]));
    }

    public void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) return;
        if (rank[x] < rank[y]) {
            par[x] = y;
        } else {
            par[y] = x;
            if (rank[x] == rank[y]) rank[x]++;
        }
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}
