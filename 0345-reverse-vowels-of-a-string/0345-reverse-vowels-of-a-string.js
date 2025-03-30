/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function (s) {
    const setOfVowels = new Set(['A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'])
    const isVowel = (c) => setOfVowels.has(c)

    const vowelStack = []
    var newList = s.split('').map(e => {
        if (isVowel(e)) {
            vowelStack.push(e)
            return '*'
        } else {
            return e
        }
    })

    do {
        newList = newList.map(e => (e === '*') ? vowelStack.pop() : e)
    } while (vowelStack.length != 0)

    return newList.join('')
};