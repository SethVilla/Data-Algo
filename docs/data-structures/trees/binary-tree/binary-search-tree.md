# Binary Search Tree

* Binary Tree
  * a tree that has at most two children node
* Binary Search Tree: an ordered binary tree, such that:
  * all data in the left subtree of a node is less than the node
  * all data in the right subtree of a node is greater
  * this rule applies to all nodes not just the root node
  * this rule describes all data in the subtree not just the children
* Most of the time no duplicates are not allowed
* An inorder traversal gives us data in ascending order

### Benefits

* Searches are fast
* we never need to backtrack up a tree to find a value - we always know what branch to follow
* Symmetrical complete tree O (log n)
* A balanced tree allows for more efficient searches (insertions and deletions)
* Keep a tree always balanced or you can build a tree and then balance it&#x20;
* A complete tree worst case is O (log n)

{% hint style="warning" %}
Worst case O(n)
{% endhint %}
