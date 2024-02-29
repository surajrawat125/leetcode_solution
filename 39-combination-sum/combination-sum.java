class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
        helper(arr,0,target,list,list1);
        return list;              //do this afterwards
    }
    public static void helper(int arr[],int index,int target, List<List<Integer>>list, List<Integer>list1){
        if(index==arr.length){
        if(target==0){
            list.add(new ArrayList(list1));
        }
        return ;
        }
        if(arr[index]<=target){
            list1.add(arr[index]);
            helper(arr,index,target-arr[index],list,list1);
            list1.remove(list1.size()-1);
        }
        helper(arr,index+1,target,list,list1);


    }
}