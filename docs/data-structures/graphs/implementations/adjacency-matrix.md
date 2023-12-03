# Adjacency Matrix

* A matrix / table / 2-dimensional array
* For a graph with n vertices, the matrix is n rows \* n columns
* if there is an edge from the vertex i to vertex j, there is an element in row i, column j in the matrix
  * cell (i,j) has a value if there is an edge from i -> j
* for unweighted graphs, a boolean value can be used as the value
* for weighted graphs the weight should be used as the value
* for undirected graphs, the matrix will be symmetrical:
  * cell (i,j) and (j,i) have the same value.

### Benefits

* Determining whether there is an edge between two vertices is fast!
  * 0(1)
* Finding all neighbors of a vertex means you have to look across an entire row
  * O(n)
* A matrix is often not space-efficient, especially for sparse graphs
