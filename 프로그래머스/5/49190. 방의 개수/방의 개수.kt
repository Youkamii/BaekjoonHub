class Solution {
    fun solution(arrows: IntArray): Int {
    val dx = intArrayOf(0, 1, 1, 1, 0, -1, -1, -1)
    val dy = intArrayOf(1, 1, 0, -1, -1, -1, 0, 1)
    var x = 0
    var y = 0
    val visitedNodes = mutableSetOf<Pair<Int, Int>>()
    val visitedEdges = mutableSetOf<Pair<Pair<Int, Int>, Pair<Int, Int>>>()
    visitedNodes.add(Pair(x, y))
    var answer = 0
    for (arrow in arrows) {
        repeat(2) {
            val nx = x + dx[arrow]
            val ny = y + dy[arrow]
            val currentNode = Pair(x, y)
            val nextNode = Pair(nx, ny)
            val edge = Pair(currentNode, nextNode)
            val reverseEdge = Pair(nextNode, currentNode)
            if (!visitedEdges.contains(edge)) {
                if (visitedNodes.contains(nextNode)) {
                    answer++
                }
                visitedEdges.add(edge)
                visitedEdges.add(reverseEdge)
            }
            visitedNodes.add(nextNode)
            x = nx
            y = ny
        }
    }
    return answer
}

}