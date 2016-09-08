package dataStructure2_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Expedition {
    public static int solve(int N, int L, int P, int[] A, int[] B) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        int pos = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int d = A[i] - pos;
            pos += d;
            P -= d;
            if (P < 0) {
                if (q.isEmpty()) return -1;
                P += q.poll();
                ans++;
            }
            q.add(B[i]);
        }
        return pos + P >= L ? ans : -1;
    }
}
