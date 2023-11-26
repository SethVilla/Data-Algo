# Binary Tree

### With Nodes

* Node with two references left and right
* leafs will have left and right null

**With Arrays**

* Heap form Array
* **Setup**
  * size of Array: max number of nodes + 1 (because 0 is empty we add a + 1)
  * leave position 0 empty&#x20;
  * put the root in position 1
* **General** **Rule**
  * Store the left child of the node in array\[i] at position array\[2i]
  * Store the right child of the node in array\[i] in position array\[2i + 1]
