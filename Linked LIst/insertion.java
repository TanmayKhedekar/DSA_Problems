public class insertion {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }}Node head=null;

        public void insert(int data){
            Node newnode= new Node(data);

            if(head==null)
            {
                head=newnode;
                return;
            }
            Node current=head;
            while (current.next!=null) {

                current=current.next;

                
            }current.next=newnode;
        }
        public void display(){
            Node current=head;
            while (current!=null) {
                System.out.print(current.data+"-->");
                current=current.next;
                
            }System.out.print("null");
        }
        public static void main(String[] args) {
            insertion list = new insertion();
            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);
            list.display();
        }
    }
    
