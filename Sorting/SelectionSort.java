package Sorting;
public class SelectionSort {
    public static void selectionSort(int arr[])
    {
        int n = arr.length;
        for(int i = 0 ; i <= n-1 ; i++)
        {
            int min = i;
            for(int j = i+1 ; j <= n-1 ; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j ;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,3,8,6,2};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
