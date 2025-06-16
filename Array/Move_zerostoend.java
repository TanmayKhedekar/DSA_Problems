package array;

public class Move_zerostoend {

    public static void main(String[] args) {
        int arr[]={1,0,3,0,4};
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++ )
        {
            if(arr[i]!=0)
            {
                arr[temp++]=arr[i];
            }
        }
        while(temp<n)
        {
            arr[temp++]=0;
        }
        for(int x:arr)
        {
            System.out.print(x+" ");
        }    
    }
}