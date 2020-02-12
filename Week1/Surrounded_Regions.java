class Solution {
    public static int[][] moves={{1,0},{0,1},{-1,0},{0,-1}};
    public void dfs(char[][] board,int i,int j,int n,int m)
    {
         board[i][j]='1';
        for(int f=0;f<4;f++)
        {
            int x=i+moves[f][0];
            int y=j+moves[f][1];
            if(x>=0&&x<n&&y>=0&&y<m&&board[x][y]=='O')
            {  
               
                dfs(board,x,y,n,m);
            }
        }
    }
    public void solve(char[][] board) 
    {
        int n=board.length;
        if(n==0)
            return ;
        int m=board[0].length;
        for(int i=0;i<n;i++)
        {
            if(board[i][0]=='O')
            {
                dfs(board,i,0,n,m);
            }
             if(board[i][m-1]=='O')
            {
                dfs(board,i,m-1,n,m);
            }
        }
        for(int i=0;i<m;i++)
        {
            if(board[0][i]=='O')
            {
                dfs(board,0,i,n,m);
            }
             if(board[n-1][i]=='O')
            {
                 
                dfs(board,n-1,i,n,m);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='1')
                    board[i][j]='O';
            }
        }
    }
}