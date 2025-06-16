package array;

public class remove_element {

    public static void main(String[] args) {
        int i=0;
        int arr[]={1,1,1,2,3,4,4,5};
        int n=arr.length;

        if(n==0 || n==1)
        {
          System.err.println("Unique Elements "+arr[0]);
        }
        for(int j=1;j<n;j++)
        {
            if(arr[i]!=arr[j])
            {
              i++;
              arr[i]=arr[j];
            
            }
        }for(int k=0;k<=i;k++)
        {
            System.out.print(arr[k]);
        }


    }
}