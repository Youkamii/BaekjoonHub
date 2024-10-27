struct Point: Hashable {
    let x: Int
    let y: Int
}

struct Edge: Hashable {
    let from: Point
    let to: Point
}

func solution(_ arrows: [Int]) -> Int {
    let dx = [0, 1, 1, 1, 0, -1, -1, -1]
    let dy = [1, 1, 0, -1, -1, -1, 0, 1]
    var x = 0
    var y = 0
    var answer = 0
    var visitedNodes = Set<Point>()
    var visitedEdges = Set<Edge>()
    let start = Point(x: x, y: y)
    visitedNodes.insert(start)
    for arrow in arrows {
        for _ in 0..<2 {
            let nx = x + dx[arrow]
            let ny = y + dy[arrow]
            let currentNode = Point(x: x, y: y)
            let nextNode = Point(x: nx, y: ny)
            let edge = Edge(from: currentNode, to: nextNode)
            let reverseEdge = Edge(from: nextNode, to: currentNode)
            if !visitedEdges.contains(edge) {
                if visitedNodes.contains(nextNode) {
                    answer += 1
                }
                visitedEdges.insert(edge)
                visitedEdges.insert(reverseEdge)
            }
            visitedNodes.insert(nextNode)
            x = nx
            y = ny
        }
    }
    return answer
}
