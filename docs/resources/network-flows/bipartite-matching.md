# Bipartite Matching

A bipartite is a graph G = (V,E) where V = X U Y and all edges are of the form (x,y) where x exists in X, y exists in Y

What is the maximum size of a matching in a bipartite graph?

* Match medical students to residencies
* Match passengers to vehicles
* Many other! (Plus, again, this a great example problem with many extensions)

## Turning Bipartite Matching into a Network Flow

Suppose we have a bipartite graph with bipartition X u Y:

* Source s has an edge into every Vertex in X
* Edges Flow from X to Y
* Each Vertex in Y has an edge into sink t
* Every edge has capacity 1

### Claim: finding the integer valued max flows in the network we just created is equivalent to finding the maximum matchings in the bipartite graph G

Need to show:

* Any max flow in this network which has integer values of flow on each edge corresponds to a maximum matching in G
* If we have a maximum matching in G, this corresponds to a max flow in the network with integer-valued flows
