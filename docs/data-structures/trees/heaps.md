# Heaps

A tree is a heap if:

* It is complete
* the nodes are organized as either a maxheap or minheap
* In a heap there is no guaranteed relationship between sibling nodes in a heap
  * We only know that both sibling nodes are smaller / greater than their parent
  * You don't know if a left child or right child is smaller/larger

### MaxHeap

* each parent node is greater than or equal to all child nodes (in both sub trees)
* the greatest node is always at the root
* any subtree in a maxheap is also a maxheap
* there is no relationship between subtrees

### MinHeap

* each parent node is less than or equal to all child nodes (in both subtrees)

### Adding to a Heap

#### Two Approaches

* upheaping
* reheaping

### Upheaping (adding single element)

Put the value in the correct leaf position (to keep the tree complete) then repeatedly swap (trade places with) the parent value until the new values are in the correct location based on the max property

* 1\) put the value in the correct leaf position
* 2\) check if the value is less than its parent
  * if yes - you're done
  * if no, swap the new value with the parent. Return to step 2
* we have a valid heap after every single addition
* this is necessary if adding a single element, but when building a complete from a set of elements, it does more work than is necessary

### Reheaping (Building Heap from Scratch)

Repeatedly transform smaller semiheaps (or subheaps) into heaps

* a leaf is a valid heap
  * any single-node tree would be a valid heap
* if we can take advantage of this, we can focus only on the interior nodes and root to check for what needs to be swapped
* with this approach we'll only need to invoke the reheap method n/2 times, meaning creating a heap with reheap is O(n)
* Start backwards from the lowest interior node
  * this is the right-most node in the level above the trees
  * this is at location n/2: n = 6 / 2 index = 3

### Removing from a Heap

* We typically use heaps for problems where we need the largest (or the smallest) value. So when we retrieve a value, its at the root.
* To remove the root
  * Swap the max (root) with the right-most leaf
    * this maintains the complete structure
  * Swap the new max (the new root) down to the correct location
    * reHeap it!
    * Find the max of it and its children and swap
    * Repeat as needed

### Using Heaps

* Heaps are often used to implement a priority queue
  * heaps keep elements in an order such that you can always access the elememt with the highest priority
  * inserting and removing elements are O(log n)
* You can use a heap to sort values - heapsort
  * Creating a heap and removing values one at a time (using the delete-the-root-algorithim) gives yout the items in descending order
  * O (n log n)
  * Graph Algorithims
  * Problems such as finding the kth smallest or largest elememt in an array
