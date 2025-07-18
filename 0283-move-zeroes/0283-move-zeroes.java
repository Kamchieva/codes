class Solution {
    public void moveZeroes(int[] nums) {   
if(nums == null || nums.length == 0){
    return;
}

int InsertPosition = 0;
for(int x : nums){
    if(x != 0) {
nums[InsertPosition] = x;
InsertPosition++;
    }
}

for(;InsertPosition < nums.length; InsertPosition++){
    nums[InsertPosition] = 0;
}
    }
}