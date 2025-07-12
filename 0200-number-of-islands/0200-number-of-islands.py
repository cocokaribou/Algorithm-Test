from collections import deque
from typing import List

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid or not grid[0]:
            return 0

        rows, cols = len(grid), len(grid[0])
        islands = 0

        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]

        def bfs(x: int, y: int):
            queue = deque()
            queue.append((x, y))
            grid[x][y] = '0'  # 방문 처리

            while queue:
                cx, cy = queue.popleft()
                for dx, dy in directions:
                    nx, ny = cx + dx, cy + dy
                    if 0 <= nx < rows and 0 <= ny < cols and grid[nx][ny] == '1':
                        queue.append((nx, ny))
                        grid[nx][ny] = '0'

        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == '1':
                    bfs(i, j)
                    islands += 1

        return islands