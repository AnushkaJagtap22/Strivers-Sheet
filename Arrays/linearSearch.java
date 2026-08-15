package Arrays;

public class linearSearch { 
    public static int linearSearch(int nums[] , int target)
    {
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == target)
            {
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        int target = 6;
        int result = linearSearch(nums, target);
        if(result == -1)
        {
            System.out.println("Element not found in the array.");
        }
        else
        {
            System.out.println("Element found at index: " + result);
        }
    }
}
