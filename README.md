# Exercise on the type of interface comparable vs comparator


COMPARISON

This interface is responsible for allowing us to compare 2 elements in a collection. So
It might seem that it is equal to the Comparable interface (remember that this interface forced us to
implement the compareTo(Object o)) method we have seen earlier in the java.lang package.
Although it is true that it is similar, these two interfaces are not the same at all, otherwise what would be the point of
his existence?

While Comparable requires us to implement the compareTo(Object o) method, the interface
Comparator forces us to implement the compare(Object o1, Object o2) method.
