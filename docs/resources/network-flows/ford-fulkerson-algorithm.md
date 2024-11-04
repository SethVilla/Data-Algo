# Ford Fulkerson Algorithm

* Start with a flow f on the network
* If there exists an s - t path in Gf, this is called an augmented path. Add it to get new flow f'
* Keep repeating steps 1 and 2 until there is no s - t path
* By our prior theorem, there exists a s - t cut (A,B) such that v(f) = c(A,B)
* By a prior theorem, no flow can be larger than any cut. Thus, this is the max flow.

## Augmenting Paths

* Suppose we have a flow f on a network. (Can start initially with a 0 flow everywhere).
* Suppose there exists an s - t path P in Gf. If needed, remove any loops so that the path P is simple (no repeated vertices).
* Find the bottleneck:
  * bottleneck(P,f) = min\[e in p] { Ce }
* Create a larger flow f' as follows:
  * if e is not an edge in P, f'(e) = f(e)
  * if e is an edge in P and e is a "forward edge" (e exists in E), set f'(e) = f(e) + bottleneck(P,f)
  * if e = (j, i) is an edge in P and e is a "backward edge" (e != E), then (i,j) exists in E. Set f'((i,j)) = f((i,j)) - bottleneck(P,f)
