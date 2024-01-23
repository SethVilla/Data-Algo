# Collisions

* When two keys hash to the same index, we get a collision.
* Collisions can be addressed using:
  * Open addressing
  * Separate chaining
* Clustering
  * Typically collisions lead to clustering (entries bunched together)
  * Clustering can occur due to do the nature of a hash function not do to collisions
  * Having some sparsity when using Open Addressing is beneficial since it should in theory result in less time required to search/ find
