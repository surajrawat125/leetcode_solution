class Solution {
    public int maxChunksToSorted(int[] arr) {
        int i,max=0,count=0;
        Map<Integer,Integer>map1=new HashMap<>();
        Map<Integer,Integer>map2=new HashMap<>();
        int nums[]=new int[arr.length];
        for(i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++)
        {
            map1.put(nums[i],map1.getOrDefault(nums[i],0)+1);   //may be a little bit hard
            map2.put(arr[i],map2.getOrDefault(arr[i],0)+1);
            if(map1.equals(map2))
            {
                count++;
                map1.clear();
                map2.clear();
            }
        }

        return count;
    }
}