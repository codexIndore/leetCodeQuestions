package tree

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * 111. Minimum Depth of Binary Tree
 * Easy
 *
 * 825
 *
 * 455
 *
 * Favorite
 *
 * Share
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
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
 * return its minimum depth = 2.
 */
class MinDepth {
  def minDepth(root: TreeNode): Int = {
    if(root == null){
      return 0
    }else{
      if(root.left == null && root.right == null){
        return 1
      }else{
        if(root.left != null && root.right != null){
          1 + scala.math.min(minDepth(root.left), minDepth(root.right))
        }else if(root.left == null){
          1 + minDepth(root.right)
        }else {
          1 + minDepth(root.left)
        }
      }
    }
  }
}
