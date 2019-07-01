# loop-over-TreeSet
How to loop over TreeSet in Java



How to loop over TreeSet in Java
Given a TreeSet in Java, the task is to loop over this TreeSet.

TreeSet provides an implementation of the SortedSet Interface and SortedSet extends Set Interface. It behaves like simple set with the exception that it stores elements in sorted format.

Following are the features of TreeSet.

TreeSet uses tree data structure for storage.
Objects are stored in sorted, ascending order. But we can iterate in descending order using method TreeSet.descendingIterator().
Access and retrieval times are very fast which make TreeSet an excellent choice for storage of large volume of data in sorted format.
TreeSet doesn’t use hashCode() and equals() methods to compare it’s elements. It uses compare() (or compareTo()) method to determine the equality of two elements.



