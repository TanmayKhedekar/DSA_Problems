package collections;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(); 
        System.out.println(list.getClass().getName());

        List<String> list1=  Arrays.asList("Monday","Tuesday");
        String[] array={"A","B","C"};
        List<String> list2=Arrays.asList(array);
         System.out.println(list2.getClass().getName());
         
         

    }
    
}
