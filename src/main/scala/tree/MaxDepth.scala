package tree

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/
 * 104. Maximum Depth of Binary Tree
 * Easy
 *
 * 1502
 *
 * 59
 *
 * Favorite
 *
 * Share
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its depth = 3.
 */
class MaxDepth {
  def maxDepth(root: TreeNode): Int = {
    var length:Int = 0
    if(root != null){
      length += 1
      length = length + (scala.math.max(maxDepth(root.left), maxDepth(root.right)))
    }
    return length
  }

}
