class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,0,0));
        int ti[]={0,-1,1,0};
        int tj[]={1,0,0,-1};
        while(!q.isEmpty()){
            Pair temp=q.poll();
            int dis=temp.first,i=temp.second,j=temp.third;
            if(i==X && j==Y) return dis;
            for(int k=0;k<4;k++){
                int newi=i+ti[k],newj=j+tj[k]; 
                if(newi>=0 && newj>=0 && newi<N && newj<M && A[newi][newj]==1){ 
                    A[newi][newj]=0; 
                    q.add(new Pair(dis+1,newi,newj));
                }
            }
        }
        return -1;
    }
};