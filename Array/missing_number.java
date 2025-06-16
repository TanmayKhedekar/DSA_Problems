package array;

public class missing_number {
    public static int num(int arr1[])
    {
        int n=arr1.length;
        

        for(int i=0;i<=n;i++)
        {
            boolean flag=false;
            for(int j=0;j<n;j++)
            {
                if(arr1[j]==i)
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
               return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={0,1,2,4,5,6};
        int lb= num(arr);
        System.out.println(lb+" ");
         
        
    }
}
