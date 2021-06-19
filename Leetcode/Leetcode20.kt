// Leetcode #20
// Valid Parentheses


// "[]" -> true
// "[]()" -> true
// "[(){}]" -> true
// "({)}" -> false


class Leetcode20 {

	/**
	* isValid()
	* @param s Input String
	* @return Returns if the input has a valid parentheses format 
	**/

    fun isValid(s: String): Boolean {

        if(s.length % 2 == 1){
            return false
        }

        if(!s.startsWith("(") || !s.startsWith("{") || !s.startsWith("[")){
            return false
        }

        val charSeq = s as CharSequence
        var i = 0
        var flag = false

        while(i != charSeq.length){

            var charDiff:Int = when(charSeq[i]){
                '(' -> 1
                '{', '[' -> 2
                else -> 0
            }

            var comparator = charSeq[i]
            var next = charSeq[i+1]

            var indexDiff = charSeq.length-(i*2+1)
            var last = charSeq[i+indexDiff]

            if(next - comparator == charDiff){
                flag = true
                i += 2
            }
            else if(last - comparator == charDiff) {
                flag = true
                i++
            }
            else {
                flag = false
            }
        }
        return flag
    }

}
