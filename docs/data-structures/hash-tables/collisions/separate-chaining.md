---
description: Open Buckets
---

# Separate Chaining

* Allow multiple entries in a single location
  * Also called open buckets
* A bucket is a location in a hash table that can store more than one value
* To use this method, we link values together that all belong at the same hash index using linked nodes
* To use this method, we link values together that all belong at the same hash index using linked nodes
* Seperate chaining is a more efficeint way to handle collisions, but it requires more memory space than open addressing. But most of the time, we care more about time efficiency than space efficiency, so in general, separate chaining is used more.

### Adding to a Hash Table

* When we add a value and there is already something in the bucket, we add the new value to the linked chain of values
* if the elements are unsorted and might contain duplicates, additions, should be made with insert head. This is the most efficient way to add to a chain of linked nodes.
* if the elements are unsorted but unique, additions should be made with insert tail. You need to traverse the chain to make sure there isn't a duplicate in the list. Once you traverse the list, you can add the new element at the end of the chain
* If the elements are sorted, additions should be made with insert in order.

