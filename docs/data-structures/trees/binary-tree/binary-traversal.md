---
layout:
  title:
    visible: true
  description:
    visible: true
  tableOfContents:
    visible: true
  outline:
    visible: true
  pagination:
    visible: true
---

# Binary Traversal

* Traversing a tree can be implemented with recursion or stacks
* Three Options when traversing a binary tree
  * Left Subtree - Root - Right Subtree
  * Right Subtree - Root - Left Subtree
  * Root - Subtrees

### PreOrder Traversal

* Processing before looking at subtrees is a preorder traversal
* Each node is processed before its children
* You would use preorder whenever the action requires data from higher in the tree
* Example: if you're printing out a directory structure, you need to know the higher level folders before you can print out the current folder/ file

{% hint style="info" %}
Think printing a file system or directory and including the directory
{% endhint %}

### Post Order Traversal

* Processing after looking at both subtrees is postorder traversal.
* Each node is processed after its children.
* You would use postorder whenever the action requires data from the lower tree.

{% hint style="info" %}
Think deleting nodes we don't want to delete the parent before its children
{% endhint %}

### In order traversal

* Processing after looking at the left subtree but before looking at the right is an _inorder_ traversal.
* For a special kind of binary tree, a binary search tree, the _inorder_ traversal gives you a sorted list of the nodes

### Visitation Sequence

* if you were to invoke all three processing steps, each node would be proccessed three times
* This is called the visitation sequence
