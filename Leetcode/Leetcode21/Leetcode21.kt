// Leetcode #21
// Merge Two Sorted Lists


// case1
// input : l1 = [1,2,4], l2 = [1,3,4]
// output : [1,1,2,3,4,4]

// case2
// input : l1 = [], l2 = [0]
// output : [0]
package com.example.algorithm_solutions.classes

class Leetcode21 {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode {
        // TODO not implemented yet
        return ListNode()
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode() {
    var mVal: Int? = null
    var nextNode: ListNode? = null

    constructor(input: Int) : this() {
        mVal = input
    }

    constructor(input: Int, next: ListNode) : this() {
        mVal = input
        nextNode = next
    }
}