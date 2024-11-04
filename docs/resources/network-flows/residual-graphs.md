# Residual Graphs

## Definition

Suppose f is a flow on the network G = (V, E). Then the residual graph Gf is the graph Gf = (V, Ef) with new capacities such that:

* if e exists in E with f(e) < Ce, then e exists in Ef with new capacity Ce - f(e)
* if e = (i,j) exists in E f(e) > 0, then (j,i) exists Ef with capacity f(e)
