/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var invertTree = function(root) {
    if (root === null) return null;

    // 왼쪽/오른쪽 자식 재귀 호출로 뒤집기
    const left = invertTree(root.left);
    const right = invertTree(root.right);

    // 현재 노드의 좌우 교환
    root.left = right;
    root.right = left;

    return root;
};