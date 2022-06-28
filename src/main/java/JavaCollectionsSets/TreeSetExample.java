package JavaCollectionsSets;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String args[]){
        TreeSet amp;
        TreeSet&amp;amp;lt;String&amp;amp;gt; al=new TreeSet &amp;amp;lt;String&amp;amp;gt;();  // creating treeSet
        al.add("John");                            // adding elements
        al.add("Sam");
        al.add("Rick");
        Iterator&amp;amp;lt;String&amp;amp;gt; itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
