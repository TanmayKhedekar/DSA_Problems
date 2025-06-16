/*package array;

public class Largest_element_in_Array {

    static void element(int arr[]) {
       
       int largest=arr[0];
       int n=arr.length;
       for(int i=0;i<n;i++)
       {
          if(arr[i]>largest)
          {
            largest=arr[i];
          }
       }System.out.println("The largest element is "+ largest);
        
    }

    public static void main(String[] args) {
        int m[]={1,6,7,5,2};
        element(m);
        
    }
}*/

package array;

public class Largest_element_in_Array {

    static void tan(int arr[]){
        int largest =arr[0];
        int n=arr.length;
        int sec=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest)
            {
              largest=arr[i];
            }
            
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>sec && arr[i]!=largest)
            {
                sec=arr[i];
            }
        }
        System.out.println(sec);
        

    }

    public static void main(String[] args) {
        int n[]={1,2,7,5,3,1};
        tan(n);
        
    }
}