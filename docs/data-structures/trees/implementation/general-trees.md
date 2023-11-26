# General Trees

In a general tree, nodes can have any number of children (we don't know a general structure)

* **Linked Nodes**
  * This is difficult to implement with linked nodes
* **List of Child Nodes**
* **Convert General Tree to a Binary Tree**
  * **Main Conversion**
    * Make the first child of a node its left node
    * math the ith child of a node the right child of the node (i-1)st child of the node
  * **Alternate Conversion**
    * Make the left child of a node its current left child
    * make the right child of a node its current left child's right sibling
  * **When using these conversions**&#x20;
    * The preorder traversal of the two trees will be the same
    * The postorder traversal of the general tree will be the same as the inorder traversal of the new binary treeaven
