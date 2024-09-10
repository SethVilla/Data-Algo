# Prim's Algorithm

* Start with single vertex
* add cheapest edge incident to that vertex, this is a sub-tree
* from the current sub-tree, add the cheapest edge to a vertex not in the current sub tree until you have a tree&#x20;

### Implementation

* Use Array/ Hash Map to keep track of which vertices not yet in subtree
* Use Min Heap to keep track of cheapest edges to add
  * items in min-heap are vertices, ordered by their distance from the sub-tree.
  * Initially we say the distance from any vertex to the sub-tree is infinity
  * In each step, we add a vertex U to sub-tree, by removing the vertex of the min distance from the heap.
    * when we add vertex u to our sub tree, we consider all edges from u to a vertex v not in our sub tree
    * if v's current distance to the tree is larger than weight of that edge, update that distance to the weight of that edge
    * Otherwise, don't update v's distance to the tree
    * continue until each vertex is pulled&#x20;

### Complexity

* Create Min Heap
  * O(n)
  * 1 time
* Remove Min
  * O(log(n))
  * n times
* Update distance in the min heap
  * O(log(n))
  * O(m) times
* Update Array/ Hash Map listing which nodes are in sub tree
  * O(1)
  * O(n) times

Total O(m log(n))

### Proofs

Tree Theorem

Suppose a graph on n vertices has any two of the following properties:

* Connected
* Acyclic
* Has n - 1 edges

### Proof

We first prove 1 & 2. Let G be a graph of n vertices

We prove by induction. Suppose G is connected and acyclic. If n = 1, the result is obvious.

Suppose n > 1 and we know that if G is a connected acyclic graph on n - 1 vertices then it has n - 2 edges. Find a path of maximum length in G, and let v and u be the endpoints of the path. (Recall: a path has no repeating nodes or edges)

Why couldn't the path be made longer? Either u has no additional edges (it is a leaf) or its only edges are to a node on a path.

It cannot have any edges to a node on the path, beacuse G is acyclic. Thus, it must be a leaf.

Deleting it and its incident edge, we still have a tree, now on n - 1 vertices. This tree has n - 2 edges so G must have had n - 1 edges. Thus, by induction, we have proven that 1 & 2 => 3

1 & 3 => 2 Suppose G is connected that has n - 1 edges. If it has a cycle, delete one edge from the cycle to get G'. Then G' is connected (any path from u to v in G using the deleted edge can go around the other side of the cycle to connect u to v)

If there is another cycle, repeat until you have a connected and acyclic graph. Thus, as we just showed, since it is connected and acyclic, it has n - 1 edges. Thus, we must not have actually deleted any edges so the original graph G must be acyclic



