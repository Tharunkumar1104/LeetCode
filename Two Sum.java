class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer,Integer> temp= new HashMap<>();
     for (int i=0;i<nums.length;i++)
     {
        Integer temp1 = temp.get(nums[i]);
        if (temp1 != null)
        {
            return new int[]{i,temp1};
        }
    temp.put(target - nums[i],i);
    }return nums;

}
}
