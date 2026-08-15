package Arrays;

import java.util.ArrayList;

public class Union {
    public static ArrayList<Integer> union(int a[] , int b[])
    {
        ArrayList<Integer> union = new ArrayList<>() ;
        int i = 0 , j = 0 ;
        while(i < a.length && j < b.length)
        {
            if(a[i] < b[j])
            {
                union.add(a[i]) ;
                i++ ;
            }
            else if(a[i] > b[j])
            {
                union.add(b[j]) ;
                j++ ;
            }
            else
            {
                union.add(a[i]) ;
                i++ ;
                j++ ;
            }
        }
        return union ;
    }
        public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 6};
        int b[] = {2, 3, 5, 7}; 
        ArrayList<Integer> result = union(a, b);
        System.out.println(result);
        }
}
