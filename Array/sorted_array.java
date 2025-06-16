package array;

public class sorted_array {

    public static boolean tab(int arr[])
    {
        
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<arr[i+1])
            {
                 return true;
            }
            
        }return false;
    }
    public static void main(String[] args) {
        
        int n[]={1,2,3,5,9,10};
        boolean race=tab(n);

        if(race == true)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }
    
}
