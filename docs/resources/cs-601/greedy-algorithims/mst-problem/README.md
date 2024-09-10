# MST Problem

### Problem

* Suppose we have several locations that we need to connect with something
  * ethernet cable
  * electricity&#x20;
* There is a cost in connecting each location to each other
* we want to find the minimum cost (total sum of all used edges)
* two greedy algorithms to find the min spanning tree:
  * Kruskal's Algorithm: add cheapest edges that don't create a cycle
  * Prim's Algorithim: add cheapest edges from current sub-tree to new node

