/**
 * 151. Reverse Words in a String
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 * 
 * 
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    const reversedWords = s.split(/[ ]{1,}/).filter(e => e).reverse().join(' ')
    return reversedWords
};


// some other solutions that iterate only once

// var reverseWords = function (s) {
//     let str = s.split(" ");
//     let output = "";
//     for (let i = str.length - 1; i >= 0; i--)
//         if (str[i]) output += (output ? " " : "") + str[i];
//     return output;
// };