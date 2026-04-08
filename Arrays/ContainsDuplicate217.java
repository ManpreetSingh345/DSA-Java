package Arrays;
import java.util.Arrays;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Boolean isDuplicate = false;
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                isDuplicate = true;
            }
        }
        return isDuplicate;
    }

    public static void main(String[] args){
        ContainsDuplicate217 A = new ContainsDuplicate217();
        int[] arr = {1, 2, 3, 1};
        System.out.println(A.containsDuplicate(arr));
    }
}
