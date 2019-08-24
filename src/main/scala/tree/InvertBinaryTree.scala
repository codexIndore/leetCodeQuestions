package tree

/**
 * https://leetcode.com/problems/invert-binary-tree/submissions/
 * 226. Invert Binary Tree
 * Easy
 *
 * 1935
 *
 * 32
 *
 * Favorite
 *
 * Share
 * Invert a binary tree.
 *
 * Example:
 *
 * Input:
 *
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * Output:
 *
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 */
class InvertBinaryTree {
  def invertTree(root: TreeNode): TreeNode = {
    if(root != null){
      var node = root.left
      root.left = root.right
      root.right = node
      invertTree(root.left)
      invertTree(root.right)
    }
    return  root
  }
}
