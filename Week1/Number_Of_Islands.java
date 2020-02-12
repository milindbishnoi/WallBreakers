class Solution {
    public static int[][] moves={{1,0},{0,1},{-1,0},{0,-1}};
    public static int count;
    public static void dfs(char[][] grid,int i,int j,int n,int m)
    {
        grid[i][j]='2';
        for(int f=0;f<4;f++)
        {
            int x=i+moves[f][0];
            int y=j+moves[f][1];
            if(x>=0&&x<n&&y>=0&&y<m&&grid[x][y]=='1')
                dfs(grid,x,y,n,m);
        }
    }
    public int numIslands(char[][] grid) 
    {
        count =0;
        int n=grid.length;
        if(n==0)
            return 0;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    dfs(grid,i,j,n,m);
                }
            }
        }
        return count;
    }
}