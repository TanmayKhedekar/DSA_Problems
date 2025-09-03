package sorting;

public class bubblesort {
    public static void sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }for(int k : arr)
        {
            System.out.print(k+",");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,6,4,5};
        sort(arr);
        
    }
    
}
