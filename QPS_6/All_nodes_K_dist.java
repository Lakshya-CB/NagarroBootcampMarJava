package QPS_6;
import java.util.*;
public class All_nodes_K_dist {
	HashMap<TreeNode,HashMap<TreeNode,Integer>> map;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        map = new HashMap<>();
        Graph_C(root);
        // System.out.println(root);
        List<Integer> ans = new ArrayList<>();
        HashSet<TreeNode> Visited = new HashSet<TreeNode>();
        rec(target,k,Visited,ans);
        return ans;
    }
    public void rec(TreeNode curr, int k,HashSet<TreeNode>Visited, List<Integer> ans ){
        if(Visited.contains(curr)){
            return;
        }
        if(k==0){
            ans.add(curr.val);
            return;
        }
        Visited.add(curr);
        for(TreeNode nbr : map.get(curr).keySet()){
            rec(nbr,k-1,Visited,ans);
        }
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
