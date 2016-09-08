package dataStructure2_4

class FoodChainTest extends GroovyTestCase {
    void testSolve() {
        int N = 100
        int K = 7
        List<List<Integer>> info = [
                [1, 101, 1],
                [2, 1, 2],
                [2, 2, 3],
                [2, 3, 3],
                [1, 1, 3],
                [2, 3, 1],
                [1, 5, 5],
        ]
        int ans = 3
        assertEquals(ans, FoodChain.solve(N, K, info))
    }
}
