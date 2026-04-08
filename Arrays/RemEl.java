package Arrays;

public class RemEl {
    public int removeElement(int[] nums, int val) {
        int[] newArr = new int[nums.length];
        int idx = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=val){
                newArr[idx] = nums[i];
                idx++;
            }
        }
        for(int i=0; i < newArr.length; i++){
            nums[i] = newArr[i];
        }
        return idx;
    }


    public static void main(String[] args){
        RemEl Ob = new RemEl();
        int[] arr = {3, 2, 3, 2};
        int V = 3;
        System.out.println(Ob.removeElement(arr, V));
    }
}
