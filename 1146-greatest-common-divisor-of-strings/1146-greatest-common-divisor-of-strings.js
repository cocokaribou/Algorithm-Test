/**
 * @param {string} str1
 * @param {string} str2
 * @return {string}
 */
var gcdOfStrings = function (str1, str2) {
    const splitted = str1.length > str2.length ? str1 : str2
    const splitter = str1.length > str2.length ? str2 : str1

    // if two inputs are completely different from each other
    if (!splitted.includes(splitter)) return ""
    
    // no remainder
    const checker = splitted.split(splitter)
    if (checker.join('') == '') return splitter
    
    const gcd = getGcd(str1.length, str2.length)
    const pattern = recognizePattern(splitter)
    if (splitted.split(pattern).join('') == '') {
        return pattern.repeat(gcd / pattern.length)
    }
    else return ""
}

function recognizePattern(str) {
    var pattern = ""
    for (let i = 0; i < str.length; i++) {
        if (i == 0) {
            pattern += str[0]
            continue
        }
        if (pattern.repeat(str.length / pattern.length) != str)
            pattern += str[i]
        else
            break
    }
    return pattern
}

function getGcd(a, b) {
    while (b !== 0) {
        const temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}