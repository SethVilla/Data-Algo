# Bellman-Ford Algorithm

* We have a directed (or undirected) Graph G = (V, E)
* Each Edge (I,J) if there exists in E has an associated weight: Cij. (If the graph is undericted, we can simply assume that if (i,j) exists in E, then (J,I) exists in E and Cij = Cji)
* Goal find the minimum-cost path form vertex s to vertex t

### Requirements

* if we knew that all edge weights were non negative, we could use:
  * Djisktra Algorithim
* Here we do allow negative edge weights, but we do not allow: a negative cycle ( a directed cycle whose sum of the weights on the cycle is negative)
* Why?
  * because (assuming the graph is strongly connected), then there is no minimum cost path from S to T.

### Theorem

Suppose directed graph G = (V, E) has a cost Cij for each (i,j) exists in E, and has no negative cycles. Suppose | V | = n. Then for any s,t that exists in V which has a directed path, there is a minimum cost path with no more than n - 1 edges in it.

#### Proof

Suppose that a s = V0, ....Vm = t is a minimum cost directed path from s to t. Suppose, by a way of contradiction, that there is a vertex in that path which appears twice: vi = vj for i != j. Then since this cycle vi, vi +1, .... Vj cannot have negative sums of the weight, we can delete it without increasing the cost.

Thus, we cam assume (without loss of generality) that there is no repeated vertex. Thus, there are at the most n vertices in the path, which corresponds to at most n -1 edges.

### Goal: Find the minimum cost path from s to t

Define;

Opt(i, v) = min cost path from v to t using <= i edges

Want: Opt(n - 1, s)

