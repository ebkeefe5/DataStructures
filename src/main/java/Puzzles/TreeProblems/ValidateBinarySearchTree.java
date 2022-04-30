
// class Solution {
   
//     //let's do another solution
//     //traverse the tree inOrder, each element should be greater than the previous element
    
//     private Integer prev;
    
//     public boolean isValidBST(TreeNode root) {
        
//         prev = null;
//         return inOrder(root);
//     }
    
//     public boolean inOrder(TreeNode node)
//     {
//         if (node == null)
//             return true;
        
//         if (!inOrder(node.left))
//             return false;
        
//         if (prev!= null && node.val <= prev)
//             return false;
//          prev = node.val;
        
//         return inOrder(node.right);
//     }
    
   

// }
//     public boolean isValidBST(TreeNode root) {
//        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
//     }
// }

// private boolean isValidBST(TreeNode curr, int low, int high)
//     {
//         if (curr == null)
//             return true;
         
//         return (low < curr.val 
//             && curr.val < high 
//             && isValidBST(curr.right, curr.val, high) 
//             && isValidBST(curr.left, low, curr.val));      
//     }    
    
//     public boolean isValidBST(TreeNode root) {
//        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
//     }