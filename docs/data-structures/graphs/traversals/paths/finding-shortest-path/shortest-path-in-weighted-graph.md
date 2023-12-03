# Shortest Path in Weighted Graph

* the algorithm is similar but takes edge weights into account and uses a priority queue
* the shortest path is not not necessarily the one with the fewest edges.
* the shortest path is the one with the smallest sum of edge weights.
* the shortest path in a weight graph is often called the cheapest path.
* the algorithim also uses a modified breadth first search.

### Cheapest Path

* in breadth-first, each vertex is placed into a queue as it is visited.
* To modify to find the cheapest path, we need more information.
  * keep track of the predecessor vertex (where we came from)
  * keep track of the cost of the path to that vertex
* We'll create a new object to keep track of this information: VertexCPData
  * holds a vertex, cost of the path to that vertex, and a predecessor vertex
* We use a priority queue of VertexCPData objects.
  * this priority is the cost of the path.
  * Smallest cost has a highest priority.
  * When a new object is added, it is put in order based on cost.
  * if there are other objects with the same cost, it is put at the back of that section
* This algorithm is based on Dijkstra's algorithm.
* Dijkstra's algorithm finds the shortest paths from an origin to all other vertices, which creates a shortest path tree.
