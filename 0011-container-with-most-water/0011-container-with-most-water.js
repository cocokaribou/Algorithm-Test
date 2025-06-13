/**
 * @param {number[]} height
 * @return {number}
 */

var maxArea = function(height) {
    let start = 0;
    let end = height.length - 1;

    let maxArea = -1;
    while (start != end) {
        const h = Math.min(height[start], height[end])
        const w = end - start;
        const area = w * h
        if (area > maxArea) {
            maxArea = area;
        }
        if (height[start] < height[end]) {
            start++
        } else {
            end--
        }
    }
    return maxArea
};