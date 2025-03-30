/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function (flowerbed, n) {
    for (let i = 0; i < flowerbed.length; i++) {
        if (n == 0) break;
        if (flowerbed[i] == 1) {
            i++;
            continue;
        }
        if (flowerbed[i] != 1 && flowerbed[i + 1] != 1) {
            --n;
            i++;
            continue;
        }
    }
    return n == 0
};
