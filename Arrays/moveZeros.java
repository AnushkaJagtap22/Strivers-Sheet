package Arrays;

public class moveZeros {
    public void moveZeroes(int[] nums) {
        int n = nums.length ;
        int j = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros obj = new moveZeros();
        obj.moveZeroes(nums);
        System.out.print("Array after moving zeros: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }   
    }
}
