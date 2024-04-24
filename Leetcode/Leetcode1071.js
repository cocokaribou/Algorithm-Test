/**
 * 
1071. Greatest Common Divisor of Strings

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * @param {string} str1 
 * @param {string} str2 
 * @returns {stringg}
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

console.log(gcdOfStrings("ABABABAB", "ABAB"))