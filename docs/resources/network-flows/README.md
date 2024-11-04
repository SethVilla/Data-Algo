# Network Flows

* We have a connected network G = (V, E). In this case, it is directed graph.
* There is a single source s which has only outgoing edges.
* There is a single sink t which has only incoming edges.
* Each edge (I,J) exists in E has a capacity Cij exists in N (Cij is a non-negative integer). We also use Ce to indicate the capacity if e = (i,j).
* A flow in this network us an assignment f: E -> N such that:
  * 0 <= f(e) <= Ce for each edge e
  * For each vertex v which is not the source s and is not the sink t:\
    \
    sum of e into v for F(e) =  sum of e out of v f(e)
