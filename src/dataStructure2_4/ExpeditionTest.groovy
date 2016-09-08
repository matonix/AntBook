package dataStructure2_4

class ExpeditionTest extends GroovyTestCase {
    void testSolve() {
        int N = 4
        int L = 25
        int P = 10
        int[] A = [10, 14, 20, 21]
        int[] B = [10, 5, 2, 4]
        int ans = 2
        assertEquals(ans, Expedition.solve(N, L, P, A, B));
    }
}
