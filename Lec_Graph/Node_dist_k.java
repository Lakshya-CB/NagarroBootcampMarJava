package Lec_Graph;
import java.util.*;


// https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
public class Node_dist_k {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
	}
	HashMap<TreeNode,HashMap<TreeNode,Integer>> map;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        map = new HashMap<>();
        Graph_C(root);
        System.out.println(root);
        return null;
    }
    public void Graph_C(TreeNode root){
        if(root==null){
            return;
        }
        if(!map.containsKey(root)){
            map.put(root, new HashMap<>());
        }
        Graph_C(root.left);
        Graph_C(root.right);
        
        if(root.left!=null){
            map.get(root).put(root.left,0);
            map.get(root.left).put(root,0);
        }
        
        if(root.right!=null){
            map.get(root).put(root.right,0);
            map.get(root.right).put(root,0);
        }
    }
}
