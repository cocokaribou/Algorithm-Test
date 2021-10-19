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
        val stack = ArrayDeque<Char>()

        var i = 0
        while (i < s.length-1) {
            var charI = s[i]
            val charJ = s[i + 1]

            if (stack.isNotEmpty() && charI == stack.last()) {
                charI = stack.removeLast()
            }

            when (charJ - charI) {
                // 바로 옆에 애와 짝지어질때
                1 -> {
                    if (charJ == ')') {
                        i += 2
                    }
                }
                2 -> {
                    if ((charI == '{' && charJ == '}')
                        || (charI == '[' && charJ == ']')
                    ) {
                        i += 2
                    }
                }
                // 아닐 때, 스택 확인 후 전진
                else -> {
                    if (stack.isEmpty()) {
                        if (!(charI == '(' && charI == '{' && charI == '[')) {
                            return false
                        } else {
                            stack.add(charI)
                            i++
                        }
                    }
                }
            }
        }
        return stack.isEmpty()
    }

//왤케 못풀지~
}