/**
 * @param {string} colors
 * @return {boolean}
 */
var winnerOfGame = function(colors) {
    let aliceMoves = 0;
    let bobMoves = 0;

    for (let i = 1; i < colors.length -1; i++) {
        if (colors[i-1] === colors[i] && colors[i] === colors[i+1]) {
            colors[i] === 'A' ? aliceMoves++ : bobMoves++;
        }
    }
    return aliceMoves > bobMoves;
};