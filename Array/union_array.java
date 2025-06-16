/*package array;

public class union_array {

    public static void union(int arr1[],int arr2[])
    {
        int result[]=new int[arr1.length+arr2.length];
        int index=0;
        int n=arr1.length;
        int m=arr2.length;

        for(int i=0;i<n;i++)
        {
            result[index++]=arr1[i];
        }
        for(int i=0;i<m;i++)
        {
            boolean found=false;
            for(int j=0;j<n;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                result[index++]=arr2[i];
            }
        }
        for(int i=0;i<index;i++)
        {
          System.err.print(result[i]+" ");
        }
    }
    public static void main(String[] args) {
        int l[]={1,2,3,4,5,6};
        int k[]={4,5,6,7,8,9};
        union(l, k);
    }
}*/


/* Another method */
