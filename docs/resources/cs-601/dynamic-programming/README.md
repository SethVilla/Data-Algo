# Dynamic Programming

## Need

* Solution to full problem can be deduced (easily) from solutions to sub-problems
* Number of sub-problems is small (polynomial in n, the original problem size).
* There is a natural ordering of sub problems, from smallest to largest.
* It may not be obvious how to split a problem into subproblems
  * so maybe we should start by constructing the recurrence relation to get the final solution.
  * But finding the recurrence may be hard if we dont know the sub-problems we should be using.

## How can we find a dynamic programming solution?

* Describe the structure of an optimal solution
* Use this structure to recursively define the value of an optimal solution
* Construct solution, in a bottom-up fashion, typically storing as they are found

If needed, the parts consisting of a solution can optentially be re-constructed from the stored data
