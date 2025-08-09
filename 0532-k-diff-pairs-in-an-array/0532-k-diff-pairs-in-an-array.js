/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findPairs = function(nums, k) {
    if (k < 0) return 0;

    const freq = new Map();
    for (const num of nums) {
        freq.set(num, (freq.get(num) || 0) + 1);
    }

    console.log(freq)
    let count = 0;
    if (k === 0) {
        for (const [num, c] of freq.entries()) {
            if (c > 1) count++;
        }
    } else {
        for (const num of freq.keys()) {
            if (freq.has(num + k)) count++;
        }
    }
    return count;
};