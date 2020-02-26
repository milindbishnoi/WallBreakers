class Solution {
    public int peakIndexInMountainArray(int[] A) 
    {
        if(A.length<3)
            return -1;
        
        int s=0;
        int e=A.length-1;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(A[m-1]<A[m]&&A[m]>A[m+1])
            {
                return m;
            }
            if(A[m-1]>A[m])
            {
                e=m-1;
            }
            if(A[m+1]>A[m])
            {
                s=m+1;
            }
        }
        return -1;
        
    }
}