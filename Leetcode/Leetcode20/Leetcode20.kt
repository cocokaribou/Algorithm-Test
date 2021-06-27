// Leetcode #20
// Valid Parentheses


// "[]" -> true
// "[]()" -> true
// "[(){}]" -> true
// "({)}" -> false

package com.example.algorithm_solutions.classes

class Leetcode20 {

    /**
     * isValid()
     * @param s Input String
     * @return Returns if the input has a valid parentheses format
     **/

    fun isValid(s: String): Boolean {

        if (s.length % 2 == 1) {
            return false
        }

        val charSeq = s as CharSequence
        var indexStart = 0
        var indexEnd = charSeq.length - 1
        var flag = false

        var checker: Char = ' '

        while (indexEnd - indexStart > 0 && indexStart < charSeq.length-1) {

            var charDiff: Int = when (charSeq[indexStart]) {
                '(' -> 1
                '{', '[' -> 2
                else -> return flag
            }
            if (!(charSeq[indexStart] == '('
                        || charSeq[indexStart] == '{'
                        || charSeq[indexStart] == '[')
            ) {
                if (charSeq[indexStart] - checker == charDiff) {
                    flag = true
                    indexStart++
                } else {
                    return false
                }
            }

            var charCurr = charSeq[indexStart]
            var charNext = charSeq[indexStart + 1]
            var charLast = charSeq[indexEnd]

            //바로 옆과 짝지어질때 ()[]
            if (charNext - charCurr == charDiff) {
                flag = true
                indexStart += 2
            }
            //같은 층끼리 짝지어질때 ([])
            else if (charLast - charCurr == charDiff) {
                flag = true
                indexStart++
                indexEnd--
            } else {
                flag = false
                checker = charCurr
                indexStart++
            }
        }
        return flag
    }
//왤케 못풀지~
}