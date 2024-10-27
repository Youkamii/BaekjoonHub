def solution(arrows):
    dx = [0, 1, 1, 1, 0, -1, -1, -1]
    dy = [1, 1, 0, -1, -1, -1, 0, 1]
    x, y = 0, 0
    visited_nodes = set()
    visited_edges = set()
    visited_nodes.add((x, y))
    answer = 0
    for arrow in arrows:
        for _ in range(2):
            nx, ny = x + dx[arrow], y + dy[arrow]
            edge = (x, y, nx, ny)
            reverse_edge = (nx, ny, x, y)
            if edge not in visited_edges:
                if (nx, ny) in visited_nodes:
                    answer += 1
                visited_edges.add(edge)
                visited_edges.add(reverse_edge)
            else:
                if (nx, ny) not in visited_nodes:
                    visited_nodes.add((nx, ny))
            visited_nodes.add((nx, ny))
            x, y = nx, ny
    return answer
