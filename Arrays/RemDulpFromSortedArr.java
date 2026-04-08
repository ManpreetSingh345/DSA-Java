package Arrays;

public class RemDulpFromSortedArr {
    public int removeDuplicates(int[] nums){
        int[] newArr = new int[nums.length];
        int idx = 1;
        newArr[0] = nums[0];
        for(int i=1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                newArr[idx] = nums[i];
                idx++;
            }
        }

        for(int i=0; i<idx; i++){
            nums[i] = newArr[i];
        }

        return idx;
    }

    public static void main(String[] args){
        RemDulpFromSortedArr A = new RemDulpFromSortedArr();
        int[] arr ={0,1,1,2,2,2,3,3};
        System.out.println(A.removeDuplicates(arr));
    }
}
