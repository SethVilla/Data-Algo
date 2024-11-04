# Subsem Sums/ Total Scheduling

* List of n tasks to be completed
* Each task has time/weight associated to it: Wi (an integer)
* There's a total amount of time/ weight that the resource (such as a printer) can be used: W (also an integer)
* Goal: pick subset S {1,2,...,n} of tasks of highest weight, such that the resource is used as much as possible. That, is: \
  \
  the sum of all I in S Wi\
  \
  is maximized, subject to:\
  \
  the sun of all i in S Wi <= Large W



### Again: Consider whether solution has nth task or not

* if nth item is in the optimal solution, then the remaining items create an optimal solution when considering item j = 1, 2, 3, 4, 5, ...., n -1, and total weight

W - Wn

* if nth item is not in the optimal solution, the optimal solution is the same as when considering items j = 1,2,3,4,5 ....., n -1 and total weight W.
* Notation:\
  Opt(i,w)\
  \
  is the optimal solution when considering items j = 1,2,......, i and total weight w

{% file src="../../../.gitbook/assets/11SubsetSums_Knapsack.pdf" %}
