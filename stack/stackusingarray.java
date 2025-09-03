package stack;

public class stackusingarray {

    class Stackarray{
        int top=-1;
        int arr[];
        int size=10;

        Stackarray(int size)
        {
            this.size=size;
            arr=new int[size];
        }

        void push(int x)
        {
            if(top>=size-1)
            {
                System.out.println("Stack overflow");
                return;
            }top++;
            arr[top]=x;
            
        
        }
        int pop()
        {
            if(top==-1)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            
            return arr[top--];
            
        }
        int top()
        {
            if(top==-1)
            {
                System.out.println("Stack empty");
                return -1;
            }
            return arr[top];
        }

        int size()
        {
            return top=top+1;
        }
        void Stack()
        {
            if(top==-1)
            {
                System.out.println("Array is empty");
                return;
            }
            for(int i=top;i>=0;i--)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        stackusingarray array=new stackusingarray();
        Stackarray st= array.new Stackarray(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.pop();
        st.Stack();
      

    }
}