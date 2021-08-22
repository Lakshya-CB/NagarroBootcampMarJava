package QPS_5;

public class LCA {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p||root==q||root==null){
            return root;
        }
            
        TreeNode left =lowestCommonAncestor(root.left, p,  q);
        TreeNode right =lowestCommonAncestor(root.right, p,  q);
        
        if(left!=null && right!=null ){
            return root;
        }
        if(left!=null){
            return left;
        }
        else{
            return right;
        }
        
    }
}
