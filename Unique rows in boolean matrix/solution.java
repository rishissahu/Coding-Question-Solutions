class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
        HashSet<Integer> h = new HashSet<Integer>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int numb=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                numb=(numb*10)+a[i][j];
            }
            if(!h.contains(numb)){
                ArrayList<Integer> al = new ArrayList<Integer>();
                for(int j=0;j<c;j++){
                al.add(a[i][j]);
              }
              ans.add(al);
            }
            h.add(numb);
            numb=0;
        }
        return ans;
    }
}