# Graph Cut

## Definition #1

An s - t cut in a network G = (V, E) is a partition of the vertices into sets A and B.

* A union B = V
* A intersection B = 0 (an empty set)

such that s exists in A and T exists in B

## Definition #2

The capacity of an s - t cut (A, B) is the sum of the capacities of the edges A into B.

## Theorem

Suppose that f is an s - t flow and (A,B) is any s - t cut in a network G = (V, E). then

* v(f) <= c(A,B)

### Proof

Suppose that f is an s - t flow and (A,B) is any s - t cut in a network G = (V, E). Let Fin(V) denote the total flow into node v with flow f and l Fout(V) denote the total out of node v with flow f. Then we know that for v exists in A
