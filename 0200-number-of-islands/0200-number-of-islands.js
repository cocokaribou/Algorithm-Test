var numIslands = function(grid) {
    if (!grid || grid.length === 0) return 0;

    const directions = [
        [0, 1],  // 오른쪽
        [0, -1], // 왼쪽
        [1, 0],  // 아래
        [-1, 0]  // 위
    ];

    const m = grid.length;
    const n = grid[0].length;
    let number = 0;

    const bfs = (x, y) => {
        const queue = [[x, y]];
        grid[x][y] = "0";  // 방문 처리

        while (queue.length > 0) {
            const [curX, curY] = queue.shift();

            for (const [dx, dy] of directions) {
                const nx = curX + dx;
                const ny = curY + dy;

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] === "1") {
                    queue.push([nx, ny]);
                    grid[nx][ny] = "0"; // 방문 처리
                }
            }
        }
    };

    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            if (grid[i][j] === "1") {
                bfs(i, j);
                number++;
            }
        }
    }

    return number;
};