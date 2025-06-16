public class rearrange {

    public static void OneTwo(int nums[]) {
        int n=nums.length;
        int result[]=nums[0];
        int index=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               if(nums[i]<=nums[i+1])
               {
                  result[index++]=nums[i];
                  
               }
            }System.out.print(result[i]+",");
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,0,2,1,0};
        OneTwo(arr);
    }

}