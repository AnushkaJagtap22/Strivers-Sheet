package Sorting;

public class InsertionSort {
    public static void insertionSort(int arr[])
    {
        int n = arr.length;
        for(int i = 1 ; i <= n-1 ; i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,8,6,2};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
