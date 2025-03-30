class Solution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 == 1) {
            return false
        }

        // (, {, [ 담을 스택
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
                        when (diff) {
                            1 -> {
                                stack.pop()
                                i++
                            }
                            2 -> {
                                if ((prev == '{' && current == '}')
                                    || (prev == '[' && current == ']')
                                ) {
                                    stack.pop()
                                    i++
                                }
                            }
                        }
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