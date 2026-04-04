package Arrays;
import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if((nums[j] + nums[i]) == target){
                    res[0] = j;
                    res[1] = i;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
