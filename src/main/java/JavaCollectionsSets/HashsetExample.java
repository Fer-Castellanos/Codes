package JavaCollectionsSets;

import java.util.HashSet;

public class HashsetExample {

    public static void main(String args[]){

        HashSet&amp;amp;lt;String&amp;amp;gt;
        HashSet al = new HashSet(); // creating hashSet
        al.add("Rachit");                 // adding elements
        al.add("Amit");
        al.add("jack");
        Iterator&amp;amp;lt;String&amp;amp;gt; itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
