class Solution {
    public static boolean rowcheck(char[][] sudoku)
    {
      
        for(int i=0;i<9;i++)
        {
            int c[]=new int[256];
            for(int j=0;j<9;j++)
            {
                if(c[sudoku[i][j]]==1&&sudoku[i][j]!='.')
                return false;
                c[sudoku[i][j]]=1;
            }
        }
        return true;
        
    }
    public static boolean colcheck(char[][] sudoku)
    {
       
        for(int i=0;i<9;i++)
        {
            int c[]=new int[256];
            for(int j=0;j<9;j++)
            {
                if(c[sudoku[j][i]]==1&&sudoku[j][i]!='.')
                return false;
                c[sudoku[j][i]]=1;
            }
        }
        return true;
    }
    public static boolean box(char[][] sudoku,int i1,int i2,int j1,int j2)
    {
        int c[]=new int[256];
        for(int i=i1;i<=i2;i++)
        {
            for(int j=j1;j<=j2;j++)
            {
                if(c[sudoku[i][j]]==1&&sudoku[i][j]!='.')
                return false;
                c[sudoku[i][j]]=1;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] sudoku) 
    {
     
       boolean r=rowcheck(sudoku);
    //    System.out.println(r);
        boolean c=colcheck(sudoku);
       // System.out.println(c);
        boolean x1=box(sudoku,0,2,0,2);
        boolean x2=box(sudoku,0,2,3,5);
        boolean x3=box(sudoku,0,2,6,8);
        boolean x4=box(sudoku,3,5,0,2);
        boolean x5=box(sudoku,3,5,3,5);
        boolean x6=box(sudoku,3,5,6,8);
        boolean x7=box(sudoku,6,8,0,2);
        boolean x8=box(sudoku,6,8,3,5);
        boolean x9=box(sudoku,6,8,6,8);
        if( r&&c&&x1&&x2&&x3&&x4&&x5&&x6&&x7&&x8&&x9)
        return true;
        return false;
    }
}