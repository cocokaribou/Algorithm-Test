/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
        fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var list1 = l1
        var list2 = l2

        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }

        val head: ListNode
        var temp: ListNode?

        if (list1.`val` < list2.`val`) {
            head = ListNode(list1.`val`)
            temp = head
            list1 = list1.next
        } else {
            head = ListNode(list2.`val`)
            temp = head
            list2 = list2.next
        }

        while (list1 != null && list2 != null) {
            if (list1.`val` < list2.`val`) {
                temp!!.next = ListNode(list1.`val`)
                list1 = list1.next
            } else {
                temp!!.next = ListNode(list2.`val`)
                list2 = list2.next
            }
            temp = temp.next
        }

        while(list1 != null){
            temp!!.next = ListNode(list1.`val`)
            list1 = list1.next
            temp = temp.next
        }
        while(list2 != null){
            temp!!.next = ListNode(list2.`val`)
            list2 = list2.next
            temp = temp.next
        }
        return head
    }

}