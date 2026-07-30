class MoveZeroes {
    public void moveZeroes(int[] nums) {
       int n = nums.length;
       int fast = 0;
       int slow = 0;
       int temp; 
       while(fast < n){
        if(nums[fast] != 0){
           
            temp = nums[slow];
            nums[slow] = nums[fast];
            nums[fast] = temp;
            slow++;
            
        }
        fast++;
       } 
    }
}
