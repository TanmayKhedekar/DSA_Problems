package Patterns;

public class patterns10 {
    static void one(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<n-i;j++)
            {
              System.out.print(" ");
            }System.out.println();
        }
    }

    static void two(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        one(n);
        two(n);
    }
    
}
