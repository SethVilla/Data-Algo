---
description: Place for everything and everything in its place
---

# Binary Search Tree

### Insertion into BST

* There is one unique BST for any given sequence of input data
  * Meaning any particular insertion order of data
  * Unique means one-of-a-kind. There is only one possible correct BST.
* Note: there is not one unique BST for any set of data- only any sequence of data
* To insert into a BST, you perform a search and then insert the node where you expect to find it

### Removing Node

* **Removing a leaf**
  * Set the parents child node to null
  * confirm you have a valid BST
* **Removing a Node with One Child**
  * Set the parents child node to be the be the deleted node's child.
  * Confirm you still have a valid BST
* **Removing a Node with two Children**
  * Option A: set the parent's new child to be the inorder successor
    * a successor is the node that comes after
    * set the parents new child to be the left most node in the deleted node's right subtree
    * confirm you still have a valid BST
  * Option B: Set the parent's new child to be the inorder predecessor
    * set the parent's new child to be the right-most node in the deleted node's left subtree

{% hint style="warning" %}
These methods are proven to work with a
{% endhint %}
