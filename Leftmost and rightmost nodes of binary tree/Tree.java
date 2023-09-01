class Tree
{
    public static void printCorner(Node node)
    {
        
        // add your code here   
        Queue<Node> q= new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            int len= q.size();
            
            for(int i=0;i<len;i++){
                Node temp=q.poll();
                
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                if(i==0){
                    res.add(temp.data);
                }
                if(i==len-1 && i!=0 ){
                    res.add(temp.data);
                }
            }
        }
        for(int x:res){
            System.out.print(x + " ");
        }
    }
    
}