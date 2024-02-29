class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max_value = 0;
        int chunks=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max_value)
            {
                max_value=arr[i];
            }
            if(max_value==i)
            {
                chunks++;
            }
        }
        return chunks;   //accepted
        
    }
}