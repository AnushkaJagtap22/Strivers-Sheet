package Arrays;

public class secondlargest {
    public static int secondLargest(int arr[])
    {
       int n = arr.length;
       int largest = Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;
       for(int i = 0 ; i < n ; i++)
       {
           if(arr[i] > largest)
           {
               secondLargest = largest;
               largest = arr[i];
           }
           else if(arr[i] > secondLargest && arr[i] != largest)
           {
               secondLargest = arr[i];
           }    
       }
         return secondLargest;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,8,6,2};
        System.out.println("Second largest element: " + secondLargest(arr));
    }
}
