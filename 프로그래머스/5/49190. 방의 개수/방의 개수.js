function solution(arrows) {
    const direction = [
        [0, 2],
        [2, 2], 
        [2, 0],
        [2, -2],
        [0, -2],
        [-2, -2],
        [-2, 0], 
        [-2, 2],
    ];

    const visitedNodes = new Set();
    const visitedEdges = new Set();

    let x = 0, y = 0;
    visitedNodes.add(`${x},${y}`);
    let roomCount = 0;
 
    for (let arrow of arrows) {
        const dx = direction[arrow][0];
        const dy = direction[arrow][1];

        for (let i = 0; i < 2; i++) {
            const nx = x + dx / 2;
            const ny = y + dy / 2;

            const currentNode = `${x},${y}`;
            const nextNode = `${nx},${ny}`;
            const edge = `${currentNode}->${nextNode}`;
            const reverseEdge = `${nextNode}->${currentNode}`;

            if (!visitedEdges.has(edge)) {
                visitedEdges.add(edge);
                visitedEdges.add(reverseEdge);
                if (visitedNodes.has(nextNode)) {
                    roomCount++;
                }
            }

            visitedNodes.add(nextNode);
            x = nx;
            y = ny;
        }
    }

    return roomCount;
}
