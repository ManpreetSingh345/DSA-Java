package Arrays;

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
        while(k < nums.length){
            nums[k] = 0;
            k++;
        }
    }

    public static void main(String[] args){
        MoveZeroes283 obj = new MoveZeroes283();
        int[] arr = {1, 2, 0, 3, 0, 5, 4};
        obj.moveZeroes(arr);
        for(int el : arr){
            System.out.print(el + " ");
        }
    }
}
