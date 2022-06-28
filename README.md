
# Excercise on the type of interface of the  Java collections for example list, sets ,Queue and Map 
# Excercise on the type of interface Maxby and Minby
# Exercise on the type of interface comparable vs comparator


- COMPARISON

This interface is responsible for allowing us to compare 2 elements in a collection. So
It might seem that it is equal to the Comparable interface (remember that this interface forced us to
implement the compareTo(Object o)) method we have seen earlier in the java.lang package.
Although it is true that it is similar, these two interfaces are not the same at all, otherwise what would be the point of
his existence?

While Comparable requires us to implement the compareTo(Object o) method, the interface
Comparator forces us to implement the compare(Object o1, Object o2) method.

- Collector maxBy

Collectors maxBy(Comparator<? super T> comparator) is used to find an element according to the comparator passed as the parameter.
It returns a Collector that produces the maximal element according to a given Comparator, described as an Optional<T>.

- Collector minBy

Collectors minBy(Comparator<? super T> comparator) is used to find an element according to the comparator passed as the parameter.
It returns a Collector that produces the minimal element according to a given Comparator, described as an Optional<T>.

What is a Java Collection Framework?

A Java collection framework provides an architecture to store and manipulate a group of objects.
A Java collection framework includes the following:

Interfaces
Classes
Algorithm

- Java collections: List 

A List is an ordered Collection of elements which may contain duplicates. 
It is an interface that extends the Collection interface. Lists are further classified into the following:

ArrayList
LinkedList
Vectors

Syntax:

ArrayList object = new ArrayList ();

- Linked List: 

Linked List is a sequence of links which contains items. Each link contains a connection to another link. 

Syntax: Linkedlist object = new Linkedlist();

Java Linked List class uses two types of Linked list to store the elements:

Singly Linked List
Doubly Linked List 

- Vectors : 

Vectors are similar to arrays, where the elements of the vector object can be accessed via an index into the vector. Vector implements a dynamic array. Also, the vector is not limited to a specific size, it can shrink or grow automatically whenever required. It is similar to ArrayList, but with two differences :

Vector is synchronized.
Vector contains many legacy methods that are not part of the collections framework.

Syntax:

Vector object = new Vector(size,increment);

- Java collections: Queue

Queue in Java follows a FIFO approach i.e. it orders the elements in First In First Out manner. In a queue, the first element is removed first and last element is removed in the end. Each basic method exists in two forms: one throws an exception if the operation fails, the other returns a special value.

<img width="554" alt="image" src="https://user-images.githubusercontent.com/68970032/176211911-e7b0a333-de61-44b7-b47b-623374fc45f2.png">

- Java Collections: Sets

A Set refers to a collection that cannot contain duplicate elements. It is mainly used to model the mathematical set abstraction. Set has its implementation in various classes such as HashSet, TreeSetand LinkedHashSet.

- HashSet: Java HashSet class creates a collection that use a hash table for storage. Hashset only contain unique elements and it inherits the AbstractSet class and implements Set interface. Also, it uses a mechanism hashing to store the elements. 

- Linked Hashset :
 
Java LinkedHashSet class is a Hash table and Linked list implementation of the set interface. It contains only unique elements like HashSet. Linked HashSet also provides all optional set operations and maintains insertion order.

- TreeSet : 

TreeSet class implements the Set interface that uses a tree for storage. The objects of this class are stored in the ascending order. Also, it inherits AbstractSet class and implements NavigableSet interface. It contains only unique elements like HashSet. In TreeSet class, access and retrieval time are faster.

- SortedSet :

is an ordered version of Set that keeps items in ascending order.Provides additional operations to take advantage of
the order

- Map : 

projects keys to values. A map cannot contain duplicate keys; each key can project at most one value

- SortedMap:
 
sorted version of Map, keeps the projections in ascending order of braces

Links of information:
https://www.edureka.co/blog/java-collections/

https://personales.unican.es/corcuerp/java/Slides/Collections.pdf

