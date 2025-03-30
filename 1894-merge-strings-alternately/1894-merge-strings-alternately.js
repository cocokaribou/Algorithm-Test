/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    var new_word = ""
    const max_length = word1.length > word2.length ? word1.length : word2.length

    for (let i = 0; i< max_length; i++) {
        const char1 = word1[i] == undefined ? "" : word1[i]
        const char2 = word2[i] == undefined ? "" : word2[i]
        new_word += `${char1}${char2}`
    }
    return new_word
};