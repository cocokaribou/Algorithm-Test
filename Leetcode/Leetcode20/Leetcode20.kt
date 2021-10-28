// Leetcode #20
// Valid Parentheses


// "[]" -> true
// "[]()" -> true
// "[(){}]" -> true
// "({)}" -> false

package com.example.algorithm_solutions.classes

import java.util.*

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

        // stack that stores '(', '{', '['
        val stack = Stack<Char>()

        var i = 0
        while (i < s.length) {
            val current = s[i]
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current)
                i++
            } else {
                if (!stack.empty()) {
                    val prev = stack.peek()
                    val diff = current - prev
                    if (diff in 1..2) {
                        stack.pop()
                        i++
                    } else {
                        return false
                    }
                } else {
                    return false
                }
            }
        }
        return stack.empty()
    }

}