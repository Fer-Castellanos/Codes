package javacollectionssets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {

    public static void main(String args[]){
       // LinkedHashSet&amp;amp;lt;String&amp;amp;gt;
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Ravi");
        LinkedHashSet al = new LinkedHashSet(); // creating linkedhashset
        al.add("Mariana");                            // adding elements 
        al.add("Rick");
        al.add("Sam");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

