package array;

public class Linear_Search {
    public static int tan(int arr[],int m)
    {
       
        int n=arr.length;
      
        for(int i=0;i<n;i++)
        {
            if(arr[i]==m)
            {
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,6,5,3,4};
        int result=tan(a, 3);
        if(result ==-1){
            System.out.println("Array not found");
        }
        else{
            System.out.println(result);
        }

        
    }
    
}
