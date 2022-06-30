package javacollectionssets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String args[]){

        //TreeSet&amp;amp;lt;String&amp;amp;gt; al=new TreeSet &amp;amp;lt;String&amp;amp;gt;();  // creating treeSet
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("John");                            // adding elements
        set.add("Sam");
        set.add("Rick");
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
