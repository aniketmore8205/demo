class LinearSearch{
    
    public static int linear_Search(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            //if key found then return index i
            if(arr[i]==key)
            {
                return i;
            }
        }
        
        //if target not fount then return -1
        return -1;
    }

    public void printResult(int result)
    {
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
    }

    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int key = 10;

        LinearSearch ob = new LinearSearch();
        int result =ob.linear_Search(arr, key);
        ob.printResult(result);
 
        
    }

}