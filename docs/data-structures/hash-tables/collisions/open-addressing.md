---
description: Closed Buckets
---

# Open Addressing

* When a collision occurs, use another location.
  * also called closed buckets because each location can only store one value.
* How do you choose the other location?
  * linear probing
  * Other ways&#x20;

## Linear Probing

* When we have a collision, probing is the process used to find another open location in the hashtable where we can store our value. Linear Probing is one approach.

### Storing in a HashTable (Linear Probing)

* if location k is occupied, we look to see if k + 1 is occupied. If it is we look in k + 2, and so on.
* We store the entry in the first available location.
* If this probe sequence reaches the end of the table, we circle back to the beginning of the table and keep looking.
* If we get back to where we started without finding an open space, that means the table is full and we need to create a new larger table an re-hash our keys

### Retrieving from HashTable (Linear Probing)

* We search in the location for our key
* If the key is there, we are done.
* If a different key is there, we have to keep looking, so we look in the next spot.
* We keep going until we eiher:
* find the key
* hit an empty spot (key is not there)
* loop back around to where we started (key is not there and the table is full)

### Empty States required for (Linear Probing)

* occupied
* available: used when an item was once there but has been removed.
* empty (null): used when an item has never been stored.

