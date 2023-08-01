class Solution {

    public void dfs(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> list,int src,boolean[] vis){
        
        for(int v:adj.get(src)){
            if(!vis[v]){
                vis[v]=true;
                list.add(v);
                dfs(adj,list,v,vis);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] vis=new boolean[V];
        vis[0]=true;
        list.add(0);
        dfs(adj,list,0,vis);
        return list;
    }
}