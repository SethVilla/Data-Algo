# Depth First Traversal

* Start at a vertex and descend as deep as possible and then back up one level and follow another path as deep as possible
* Preorder, postorder, and inorder tree traversals are all examples of depth first traversals
* Remember: Origin Matters!
* Remember: Order of visitation is not part of the algorithm

### Implementation

* typically implemented with Queue / Stack
  * Has a "recursive" feel
* General approach:
  * visit a vertex
  * put all of the vertex's neighbors on the stack
  * repeat

### Use Cases

* Solving puzzles / mazes with only one (or more) solution
* Finding connectivity or connected components
* Cycle detection
* Find minimum spanning tree
* Path Finding
* Network flow algorithms
* Graph Matching algorithims
* Topological sorting
  * used for dependency resolution
  * used for job scheduling
