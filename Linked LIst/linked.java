package linkedlist;

import java.util.Scanner;

public class linked {

   class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;

    }
   }Node head=null;
   public void insertion(int data){
    Node newnode=new Node(data);
    if(head==null)
    {
        head=newnode;
        return;
    }Node current=head;
    while(current.next!=null)
    {
        current = current.next;
    }current.next=newnode;
   }
 
   public void display(){

    Node current=head;
    while(current!=null)
    {
        System.out.print(current.data+"->");
        current=current.next;
    }System.out.print("NULL");
   }public static void main(String[] args) {
     linked l=new linked();
     Scanner sc=new Scanner(System.in);
     int num= sc.nextInt();
     l.insertion(num);
     l.insertion(num);
     l.insertion(num);
     l.display();
   }
}