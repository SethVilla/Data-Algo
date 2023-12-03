# Topological Ordering / Sort

* Topological ordering is useful for finding valid sequences of tasks or instruction to be performed.
* Example
  * vertices of a graph are tasks and edges represent precedence
  * a -> b means task A must be completed before task B
  * The topological ordering gives you a valid order for executing all tasks in a way that satisfies all precedence rules
* Only directed, acyclic graphs (DAGs) can have a topological ordering
  * Why?
* A graph can have more than one topological ordering.
* Similar to the traversals, the order of visited nodes is not part of the algorithim.
  * we'll use alphabetic ordering.
* All vertices are part of the topological ordering - even if they are disconnected from the other parts of a graph

### Implementations

1\) Neighbors

* Find the topological order by looking at adjacent vertices.
  * Remember: in a directed graph, a is adjacent to b->a
* Algorithm:
  * pick an unvisited vertex with no unvisted neighbors
    * this means an unvisted vertex whose neighbors have all been visted
    * this means no edges coming out of the vertex and into an unvisted neighbor
  * mark this vertex as visited
  * push the vertex onto the. VertexStack
  * after all vertices are visited, pop from the stack for the order (order is top to bottom)

2\)

* another way to find the topological order is to keep track of the indegree of each vertex.
  * the indegree is the number of edges coming into vertex
* algorithm
  * pick a vertex with indegree = 0
  * add that vertex to the order
  * remove that vertex and all the edges coming from that vertex from the graph
  * update the indegree values
  * repeat
