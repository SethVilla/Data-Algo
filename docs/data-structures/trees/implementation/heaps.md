# Heaps

### Setup

* size of array: maximum number of nodes + 1
* leave position 0 empty
* put the root in position 1

### General rule

* store the left child of the node in array\[i] at position array\[2i]
* store the right child of the node in array\[i] in position \[2i + 1]
* the parent of any node is at array\[i/2] (note that the integer division truncates the decimal value)
