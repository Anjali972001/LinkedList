public class BubbleSorting {
   void bubbleSort(int arr[]) {
       int n = arr.length;
       for (int i = 0; i < n - 1; i++)
       {
           for(int j=0;j<n-i-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
       }
    }
    void printSorting(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        BubbleSorting oo=new BubbleSorting();
        int arr[]={64,34,25,12,22,11,90,1};
        oo.bubbleSort(arr);
        System.out.println("Sorted Array");
        oo.printSorting(arr);


    }
}
