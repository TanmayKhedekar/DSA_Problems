package array;
public class longest_subarray {

    public static void subarray(int num[],int k)
    {
        int n=num.length;
        int count=0;

        for(int i=0;i<n;i++)
        {
          for(int j=1;j<n;j++)
          {
             if(num[i]+num[j]==k)
             {
                 count++;
             }
          }
        }System.out.println(count);
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,1,4,2,1,1,1};
        subarray(arr, 3);
        
    }
    
}
