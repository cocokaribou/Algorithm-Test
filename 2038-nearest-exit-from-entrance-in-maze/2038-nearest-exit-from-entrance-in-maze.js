/**
 * @param {character[][]} maze
 * @param {number[]} entrance
 * @return {number}
 */
var nearestExit = function(maze, entrance) {
    const rows = maze.length;
    const cols = maze[0].length;
    const [startRow, startCol] = entrance;

    const directions = [[-1,0], [1,0], [0,-1], [0,1]];

    const queue = [[startRow, startCol, 0]];

    console.log(queue);

    maze[startRow][startCol] = '+';

    while (queue.length) {
        const [row, col, steps] = queue.shift();

        for (const [dr, dc] of directions) {
            const newRow = row + dr;
            const newCol = col + dc;

            if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols) continue;

            if (maze[newRow][newCol] !== '.') continue;

            if (
                newRow === 0 || newRow === rows - 1 ||
                newCol === 0 || newCol === cols - 1
            ) {
                return steps + 1;
            }

            maze[newRow][newCol] = '+';
            queue.push([newRow, newCol, steps + 1]);
        }
    }

    // No exit reachable
    return -1;
};