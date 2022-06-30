package javacollectionssets;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

    public static void main(String args[]){

        //HashSet&amp;amp;lt;String&amp;amp;gt;
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        HashSet al = new HashSet(); // creating hashSet
        al.add("Rachit");                 // adding elements
        al.add("Amit");
        al.add("jack");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
