# Breadth-First Traversal

* Typically Implemented with a queue
* General approach:
  * visit a vertex
  * put all of the vertex's neighbors in the back of the queue
  * repeat

### Use Cases

* Find shortest path or cheapest path
* GPS navigation system
* Find neighbors in a peer to peer network
* web crawlers
  * start from a source page and follow all links from that page
* Social Networks
* Garbage collection algorithims

### Pseudo code

```
enqueue the origin onto the vertexQueue
while the vertexQueue is not empty
    dequeue a vertex from the vertexQueue
    enqueue the vertex into the traversalOrder queue
    enqueue its non-visited neighbors onto the vertexQueue
    mark each of those neighbors as visited
```
