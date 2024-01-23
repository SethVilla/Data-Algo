# Hash Tables

* A hashtable stores key-value pairs.
* The value is the element or object that you really care about (the data)
* The Key allows you to find the value quickly in the data set.
* The main reason to use a hashtable is to find a value without having to search the entire collection

### Examples

* Dictionary
  * key: word
  * value: definition, entymology... etc.
* Phone Book
  * key: person's name
  * value: person number and info
* Social Network
  * key: username
  * value: person's info
* Voter Database
  * key: phone number
  * value: voter information

### Hash Function

Purpose is to convert a key to an index in the table.

### Benefits

* Searching is in constant time O(1)

### Definition of Hash

* **Hashtable:** is the ADT that stores key-value pairs.
  * dictionary, map, table.

### Sparsity

* a hashtable is sparse if the space to hold date is greater than the data in the table
  * Usually: less than √n (Hash table of 1000 size but only  need 10 data points)
  * A sparse table is not ideal

### Hashing Techniques

* Generate Hash:
  * multiply data by prime \* (repeat for ever data point)
* Compression:
  * location = hash(key) % table size (number can only range from 0 - (n-1))
* Determined hashCode location % n (size ) will allows to remain in bounds of our possible locations, allows us too loop back around

### Resources

{% file src="../../.gitbook/assets/Hashing_HashTables (1).pdf" %}
