/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var reverseKGroup = function(head, k) {
    if (!head || k === 1) return head;

    let curr = head;
    for (let i = 0; i < k; i++) {
        if (!curr) return head;
        curr = curr.next;
    }

    let prev = null;
    let node = head;
    for (let i = 0; i < k; i++) {
        const next = node.next;
        node.next = prev;
        prev = node;
        node = next;
    }

    head.next = reverseKGroup(node, k);

    return prev;
};