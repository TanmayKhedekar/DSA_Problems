package Patterns;

public class pattern9 {

    static void one(int N)
    {
        for(int i=0;i<N;i++)
        {
          for(int j=0;j<N-i-1;j++)
          {
               System.out.print(" ");
          }
          for(int j=0;j<2*i+1;j++)
          {
            System.out.print("*");
          }
          for(int j=0;j<N-i-1;j++)
          {
               System.out.print(" ");
          }System.out.println();

        }
    }

    static void two(int N)
    {
        for(int i=0;i<N;i++)
        {
          for(int j=0;j<i;j++)
          {
               System.out.print(" ");
          }

          for(int j=0;j<2*N-2*i-1;j++)
          {
            System.out.print("*");
          }
          for(int j=0;j<i;j++)
          {
               System.out.print(" ");
          }System.out.println();

        }
    }
    public static void main(String[] args) {
        int N=4;
        one(N);
        two(N);
        
    }

    
}
