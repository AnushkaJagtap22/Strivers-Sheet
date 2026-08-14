package Arrays;

public class largestElement {
    public static int largest(int arr[])
    {
        int n = arr.length;
        int max = arr[0];
        for(int i = 1; i < n ; i++)
        {
            if(arr[i]> max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,8,6,2};
        System.out.println("Largest element: " + largest(arr));
    }
}
