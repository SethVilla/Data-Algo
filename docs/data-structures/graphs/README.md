# Graphs

## Terminology

### Graph

* **Graph:** a collection of vertices and edges
* **edge:** a connection between two vertices
* **adjacent:** two vertices are adjacent if they are connected by an edge
  * these are called neighbors
* **sparse:** few edges (O(n))
  * most graphs are sparse
* **dense:** many edges O(n^2)

### Path

* **path:** a sequence of edges that connect two vertices
* **simple path:** a path that repeats no vertex
* **length of a path:** the number of edges
* **cycle:** a path with the same starting and ending vertex
* **simple cycle:** a cycle that passes through vertices only once, except for the starting/ ending vertex.
* **acyclic:** a graph with no cycles
  * also known as a tree
* **cyclic:** it contains at least one cycle

### Edges

* **An edge** connects two vertices
* An edge can be directed or undirected
  * **Directed** edges have a direction from one vertex to another.
  * **Undirected** edges go in both directions
* A graph with directed edges is called a **digraph**
* Edges can have weights
  * A weight is a value assigned to the edge
  * In a weighted graph, you can compare paths by the sum of edge weights&#x20;

### Connected and Complete

* a connected graph has a path to and from every vertex.
* a complete graph has an edge connecting every pair of vertices.
  * for a directed graph, there are v \* (v - 1) edges in a complete graph
  * for an undericted graph, there are (v \* (v-1)) / 2edges in a complete graph

### Resources

{% file src="../../.gitbook/assets/Graphs.pdf" %}
