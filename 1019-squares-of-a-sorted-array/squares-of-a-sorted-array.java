class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[]=new int[nums.length];
for(int i=0;i<nums.length;i++)  //aray2
{
    nums[i]= nums[i]* nums[i];
}
int head=0;
int tail=nums.length-1;
for(int pos =nums.length-1;pos>=0;pos--)
{
    if(nums[head]>nums[tail])
    {
    result[pos]=nums[head];
    head++;
}
else
{
    result[pos]=nums[tail];
    tail--;
}
}
return result;
}
}
