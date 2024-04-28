/**
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
// var canPlaceFlowers = function (flowerbed, n) {
//     if (!n) return true
//     var flowersToPlant = n

//     const flowers = flowerbed.join('')

//     const headOrTailRegex = new RegExp(/(^0{2})|(0{2}$)/g)
//     const availableHeadOrTail = flowers.match(headOrTailRegex) | []
//     if (availableHeadOrTail.length >= flowersToPlant) return true

//     flowersToPlant -= availableHeadOrTail.length | 0

//     const plotsNeeded = (flowersToPlant * 2) + 1
//     const regex = new RegExp(`(0{${plotsNeeded},})|(0{3,})`, 'g')
//     const availablePlots = flowers.match(regex) | []

//     return availablePlots.length >= flowersToPlant
// };


var canPlaceFlowers = function (flowerbed, n) {
    const stack = Array(n)

    for (let i = 0; i < flowerbed.length; i++) {
        if (stack.length == 0) break;
        if (flowerbed[i] == 1) {
            i++;
            continue;
        }
        if (flowerbed[i] != 1 && flowerbed[i + 1] != 1) {
            stack.pop()
            i++;
            continue;
        }
    }
    return stack.length == 0
};

console.log(canPlaceFlowers([1,0,0,0,0,0,1], 2));