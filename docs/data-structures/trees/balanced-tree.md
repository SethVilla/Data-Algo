# Balanced Tree

* B-Trees have far-ranging applications
* Balance factor: the balance factor of any node is height(left subtree) - height(right subtree)
* Height-balanced: a BST is considered height-balanced if the balance factor is 0,1, -1
  * height-balanced is also sometimes called AVL
* A B-Tree is a general concept
  * Lets's first look at the 2-3 Trees and 2-4 Trees
* B-Trees maintain their balance during the process of adding the tree.

### B-Trees: 2-3 Nodes

* A 2-3 tree is a search tree that uses 2-nodes and 3-nodes
* Interior nodes must each have two or three children
  * They are either 2-nodes or 3-nodes
* All leaves occur on the lowest levels
  * this is what makes them balanced!

### Adding to a 2-3 Tree

* Search for the **leaf** where the new element would go and add there, just like you would for a regular BST.
* Note that you never add a new leaf! you add to the existing leaf where the value belongs1
* If the leaf is a 2-node
  * add the element to that 2-node, thus converting it to a 3-node
* if the leaf is a 3-node
  * Pretend to add it in the proper place, which would create a 4-node.
  * But we aren't allowed to have 4-nodes in a 2-3 tree.
  * So we need to split this pretend/ illegal node.
* Splitting a Node
  * split the left and right values into individual 2-nodes.
  * Bump the middle value up to the parent node.
    * if the parent node was a 2-node, convert it to a 3-node and you're done.
    * if the parent was already a 3-node, then you have again created an illegal 4-node, so you need to repeat the split
* Ripe for splitting
  * this means that no matter what value is added next a split will occur because any value will create an illegal 4 node
* Common Errors
  * Remember to bump up the parent when splitting
  * Don't add elements to the interior nodes
    * when adding a new element, follow the path all the way down to a leaf.
    * Add at the leaf either by adding to a 2 node to create a 3-node or by adding to a 3-node to create an illegal 4-node (and then splitting)
  * Don't add elements as new 2-node leaves
    * 2-node leaves are only created through the splitting process

{% hint style="info" %}
The only time we add a single node is at a root
{% endhint %}

### B-Trees: 2-4 Trees

* A search that uses 2-nodes, 3-nodes, and 4 nodes
* Also called a 2-3-4 tree.
* interior nodes must each have two, three, of four children.
  * they are either 2-nodes, 3-nodes, or 4-nodes
* All leaves occur on the lowest levels
  * this is what makes them balanced

### Adding to a 2-4 Tree

* start the same way as a for a 2-3 tree: search for the leaf where the new element would go and add it there
* During this search, if you find a 4-node, you split right away.
* We allow these trees to have 4-nodes unless we find them when searching during an addition
  * at that time, we split them.
  * We then resume the search for where the new element belongs
* this is a preemptive split to create space for the new element

{% hint style="info" %}
We split as we encounter 4. nodes, bring middle value up
{% endhint %}

### General B-Trees

* A B-Tree of order m is a balanced search tree such that:
  * all leaves are at the lowest level
  * the root has no children or between 2 and m children
  * interior nodes have between ceiling(m/2) and m children
* For a 2-3 tree (m=3)
  * all leaves at lowest level
  * the root has 0, 2, or 3 children (it is a 2-node or 3-node)
  * all interior nodes have between 2-3 children (they are 2 nodes or 3 nodes)
* For a 2-4 tree (m=4)
  * all leaves are the lowest level
  * the root has 0,2,3 or 4 children (it is a 2-node, 3-node, or 4-node)
  * all interior nodes have between 2,3, and 4 children (they are 2-nodes, 3-nodes, or 4-nodes)
  * B-Trees are often used for external storage (e.g. file systems and databases)
