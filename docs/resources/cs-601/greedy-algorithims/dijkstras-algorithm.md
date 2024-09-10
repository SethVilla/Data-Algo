# Dijkstra's Algorithm

* Single-Source Shortest Path
* Show users the single shortest route from their location to wherever they want to go
* Goal: Find the Shortest Path they want to find
* A graph algorithm
  * Graph must be connected (otherwise distance would be infinite)
  * Shortest Path corresponds to the smallest sum of edge weights
  * All edge weights must be non negative
  * Edges can be directed or undirected

### Greedy Algorithim Notation

* d(v) for the shortest path distance from s to v.
* w(u,v) as the weight of the edge from u to v.
  * start with source s the distance from s to itself d(s) = 0

### Proof Algorithm works

Suppose vertices are added to S in the order of v1, v2, ... vn. We prove by induction that d(vi) is the length of the shortest path from s.

#### Base case

Note that the first path added is from s to v1 must be the shortest path, since it corresponds to the minimum weight edge from s to any node. (the minimum weight edge from s)

#### Inductive Step

Suppose that 1 <= k < n and that d(v1), d(v2), ... d(vk) are the lengths of the shortest paths from s to v1, v2, ....vk respectively and set S={v1, v2,....vk}

Recall that we now calculate the min edge by:

delta = min d(s') + w(s', vi)

and that vk + 1 achieves this minimum value, and its corresponding neighbor is s'.

If there is another path from s to vk + 1, which is shorter, trace that path backwards until it reaches S.



Suppose it reaches s to vj, with the vertex adjacent to vj being v", then d(s, vj) + w(vj, v") must be less than d(s, s') + w(s', sk + 1) since the whole path was shorter. But this is a contradiction to the choice of delta. Hence, there can be no shorter path, and d(vk + 1) = d(s, s') + w(s', vk + 1) is indeed the shortest path from s to vk + 1.

A smaller delta cannot exist because it's impossible by our choosen method of delta

Hence, by induction, we know this greedy algorithm works.

### Implementation

* use a min-heap to keep track of current min distance for each node
  * d(s, s') + w(s',v)
* Each item in the heap is a vertex, along with its current distance from the source
* When we extract the min, that current distance is now a finalized distance
* As we extract we then use that node to update other nodes current distances

#### Complexity

* Build Heap:
  * O(n)
  * 1 time
* Remove Min:
  * O(log(n))
  * n times
* Update Value:
  * O(log(n))
  * O(m) times
  * m = number of edges vs n = number of vertices
* O(n) + O(n log(n)) + O(m log(n))
* Overall this is O((n + m) log(n)) = O(m log(n))

### Reproducing the Shortest Path

* We know how to find the length of the shortest path from a single source s
* what if we want to produce that path?
  * we just need one more data structure: a predecessor Array/ Hash Table
  * when we update the distance in the heap, we correspondingly update the node predecessor
    * example inn the next slides (using arrays to show values, just for ease of visualization)

