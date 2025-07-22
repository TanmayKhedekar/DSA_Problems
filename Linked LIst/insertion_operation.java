public class insertion_operation {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }Node head=null;

    public void insertbeginning(int data)
    {
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void insertend(int data){
        Node newnode=new Node(data);

        if(head==null)
        {
            head=newnode;
            return;
        }Node current=head;
        while (current.next!=null) {
            current=current.next;
            
        }current.next=newnode;
    }
    public void insertany(int data,int position)
    {
      Node newnnode=new Node(data);
      if(position==0){
        insertbeginning(data);
        return;
      }
      Node current=head;
      int count=0;
      while(current!=null && count<position-1)
      {
        current=current.next;
        count++;
      }
      if(current==null)
      {
        System.out.println("Range");
        return;
      }
      newnnode.next=current.next;
      current.next=newnnode;
    }
    public void display(){
        Node current=head;

        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("Null");
    }public static void main(String[] args) {
        insertion_operation list=new insertion_operation();
        list.insertbeginning(1);
        list.insertend(20);
        list.insertend(30);
        list.insertany(5, 2);
        list.display();
    }
    
}
