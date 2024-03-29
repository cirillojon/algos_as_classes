public class max_sub_arr {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(max_sub(nums));
    }
    private static int max_sub(int[] nums){
        int curr_max = nums[0]; int end_max = nums[0];
        for(int i = 1; i < nums.length; i++){
            end_max = Math.max(nums[i], nums[i] + end_max);
            curr_max = Math.max(curr_max, end_max);
        } return curr_max;
    }
}
