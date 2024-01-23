# hashcode()

* Inherited from Object
* purpose is define a hash function for a given function
* The inherited version of the hashcode returns a code based on the memory address of the object
* When we write our own classes we usually override toString() and equals(...), We should also override hashcode().
  * we must follow the contract defined by equals and hashcode()

### Contract

* **Consistent:** x.hascode() should return the same value upon multiple invocation within the same program. (unless information used to determine the hash is modified)
* Consistent with equals: if x.equals(y) then x.hashCode() == y.hashCode()

### Good Hash Functions

* minimize collisions and clustering
* distribute uniformly across the table
* Create a table that isn't too sparse
* Are fast to compute
