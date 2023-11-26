# Binary Tree

{% hint style="danger" %}
A binary tree is a special tree such that each node has at most two children
{% endhint %}

### Full Definitions

* **Full:** a binary tree such that every non leaf has exactly two children and every leaf is in the same level.

**Alternate Definition:**

* **Full:** a binary tree such that every non-leaf has exactly two children.
  * In other words, each node has either 0 or 2 children.
  * There is no requirements that leaves be on the same level

**The first definition is more stringent**

* if a tree is full by the 1st, its full by the 2nd
* if a tree is full by the 2nd, it might not be full by the 1st

### Complete Definitions

* Every non leaf has exactly two children except possible on the second lowest level
* on the lowest level, the leaf nodes are as far left as possible
* a complete tree might or might not be full
* A full tree by the 1st definition is always complete.
* A full tree by the 2nd definition might or might not be complete.

### Properties of Binary Trees&#x20;

* **There are at most 2\*\*n - 1 nodes at any level h**
  * Assume the root level is 1
* **There are at most 2\*\*n - 1 total nodes in a tree with height h.**
  * This assumes the 1-based height definition, where height is the number of levels (not the 0-based).
  * A full tree (using the first definition) will have this many nodes
* The shape of a BST affects the efficiency of searching the tree
  * Best case: O(log n)
  * Worst case: O(n)
* The best case occurs when a BST is balanced
* There are two strategies to ensure balance
  * Adjust a tree that is out of balance
    * AVL trees are used for this
  * Always keep a tree in balance
    * B-Trees are used for this&#x20;
