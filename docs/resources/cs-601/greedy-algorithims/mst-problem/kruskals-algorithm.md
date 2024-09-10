# Kruskal's Algorithm

* Until we have n - 1 edges (a spanning tree)

### Implementation

* To make sure we don't create a cycle:
  * Use Disjoint Sets (Union / FInd)
  * Initially each vertex is in its own set
  * When an edge (u,v) is considered, if u and v are in different sets, that edge can be added and we take the union of those sets.
  * if u and v are in the same set. then we can't add that edge (b/c it would create a cycle
* to find the min edges available:
  * min heap

### Complexity

* Create Disjoint Sets
  * O(n)
  * 1 time
* Check if we can add an edge (two finds and maybe one union)
  * O(1)
  * O(m) times
* Create min heap
  * O(m)
  * 1 time
* Remove min
  * O(log(m))
  * O(m) times

In total O(mlog(m)) = O (m log(n) b/c n -1 <= m < n^2

### Why does this work?

#### Theorem

suppose a graph on n vertices has any two of the following three properties:

* Connected
* Acyclic
* Has n - 1 edges

Then that graph must be a tree. (Connected and Acyclic)

#### Lemma&#x20;

Suppose T and T' are both spanning trees of the same graph. Suppose further, that e is in T but not T'. Then we can find an e' in T' such that T' + e - e' is a tree
