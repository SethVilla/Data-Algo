# HashSet

* Implements the Set Interface
  * A set is collection of unordered objects that does not allow duplicates.
* Form the client view, a HashSet is just a set.
  * It allows you to add and remove elements from a group.
  * It will not allow you to add a duplicate element.
  * We take the client view when using a HashSet in our code.
  * We specify the values (the objects we add to the set) and HashSet figures out the key (using the objects hashCode() method)
  * HashSet is a very efficient class to use when you do not need elements to be ordered and you don't have any duplicates.
  * Be extra certain to override the equals and hashCode method for whatever kind of objects you're putting into your HashSet!

### Behind the scenes

* Hashset is implemented with a hash table (hence the name "Hash" Set).
* To check if the set contains an element, HashSet looks up its hash code and sees if that bucket contains the element.
  * this supports very fast lookup: essentially O(1) instead of O(n), which you'd have with a list.
* The add method also uses the hash code to first check if the element is already in the table.
  * the element is only added if it's not already there.
* Again: be extra certain to override the equals and hashCode method of your class!
