/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function (candies, extraCandies) {
    if (candies.length > 100) return
    if (candies.filter(e => e > 100).length != 0) return
    if (extraCandies > 50) return

    const maxAmountOfCookie = Math.max(...candies)
    return candies.map(e => e + extraCandies >= maxAmountOfCookie);
};