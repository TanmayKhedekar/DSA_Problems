package linkedlist.list;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class doublylinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        ListIterator<Integer> it=listx.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
        }
        while(it.hasPrevious())
        {
            System.out.println(it.previous()+" ");
        }

        //reverse the list

        Collections.reverse(listx);
        System.out.println(listx);

        int mid=listx.size()/2;
        System.out.println("Mid :"+listx.get(mid));
    }
    
}
