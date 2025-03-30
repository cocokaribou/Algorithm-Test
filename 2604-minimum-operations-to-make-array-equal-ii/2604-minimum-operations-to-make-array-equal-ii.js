/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @param {number} k
 * @return {number}
 */
var minOperations = function(nums1, nums2, k) {
    let positiveSum = 0;
    let negativeSum = 0;
    let zeroCount = 0;

    for (let i = 0; i < nums1.length; i++) {
        const diff = nums1[i] - nums2[i];
        if (diff !== 0 && diff % k !== 0) {
            return -1;
        }
        if (diff === 0) {
            zeroCount += 1;
        } else {
            diff > 0 ? positiveSum += diff : negativeSum += diff;
        }
    }
    
    if (zeroCount == nums1.length) return 0;
    if (Math.abs(positiveSum) !== Math.abs(negativeSum)) return -1;

    return positiveSum / k;
};