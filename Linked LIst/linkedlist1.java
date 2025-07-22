public class linkedlist1 {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }Node head=null;
    public void Insert(int data){
        Node newnode= new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }current.next=newnode;
    }
    public void display()
    {
        Node current=head;
        while(current!=null)
        {
          System.out.print(current.data+"->");
          current=current.next;
        }System.out.print("Null");
    }
    public static void main(String[] args)
    {
        linkedlist1 l=new linkedlist1();
        l.Insert(1);
        l.Insert(2);
        l.Insert(3);
        l.display();
    }
    
}
