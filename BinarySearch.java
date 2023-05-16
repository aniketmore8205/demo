//this is for git demo
import java.io.*;

class BinarySearch{
    
    public static int binarySearch(int arr[],int key,int left,int right)
    {

        while(left<=right)
        {
             int mid = (right + left) / 2;
 
            // Check if x is present at mid
            if (arr[mid] == key)
                return mid;
    
            // If x greater, ignore left half 
            if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int key = 10;
 
        // Function call
        int result = binarySearch(arr, key,0,arr.length);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
    }

}