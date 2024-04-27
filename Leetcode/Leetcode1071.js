/**
 * 
1071. Greatest Common Divisor of Strings

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * @param {string} str1 
 * @param {string} str2 
 * @returns {string}
 */

var gcdOfStrings = function (str1, str2) {
    const splitted = str1.length > str2.length ? str1 : str2
    const splitter = str1.length > str2.length ? str2 : str1

    // if two inputs are completely different from each other
    if (!splitted.includes(splitter)) return ""
    
    // no remainder
    const checker = splitted.split(splitter)
    if (checker.join('') == '') return splitter
    
    var pattern = ""
    for (let i = 0; i < splitted.length; i++) {
        if (i == 0) {
            pattern += splitted[0]
            continue
        }
        const matchStr1 = pattern.repeat(splitted.length / pattern.length)
        const matchStr2 = pattern.repeat(splitter.length / pattern.length)
        console.log(`1번 ${matchStr1}`)
        console.log(`2번 ${matchStr2}`)
        if (matchStr1 == splitted && matchStr2 == splitter)
            break
        else
            pattern += splitted[i]
    }
    return pattern
}
// console.log("AB".repeat(36))
// console.log("")
// console.log("AB".repeat(64))
gcdOfStrings("ABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABAB", 
"ABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABABAB")