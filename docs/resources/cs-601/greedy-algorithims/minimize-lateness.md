# Minimize Lateness

### Problem Setup

* There is a single resource (say a printer) that must be used to complete n tasks, each with a different time lengths t1, t2,t3....., tn
* This resource is available to all tasks at a single start time, but may be used for only one task at a time
* The resource must be used continously on a task untl that task is completed
* Each task has a deadline d1, d2, ...., dn
* How do we schedule to minimize the maximum lateness

### Incorrect Solutions

* Choose the shortest jobs first
* Choose jobs with the shortest slack time, order by difference in deadline and how long the job takes

### Correct Solution

* Pick the job with the earliest deadline

### Proof

Re-number the indices of each interval so that they ordered by deadline

first suppose that we have another different ordering that breaks the ties differently. That is, the ordering is still increasing by the deadline, but elements with the same deadline may be swapped. \\

Note that among all elements with the same deadline, the last one is the latest. Re-ordering those elements doesnt change the lateness. Thus re-ordering elements with the same deadline among themselves produces an ordering with the maximum lateness

suppose that we have an optimal solution

i1,i2,i3......, In

Suppose that the ordering in our optimal solution is not a greedy ordering

We shall use the idea of an inversion. An inversion occurs when j < k (so that Ij occurs before Ik in the ordering) but yet Dij > Dik if this optimal solution is not a greedy ordering, we must have some positive number of inversions

we must also have an adjacent inversion: a case where Djk > Dik + 1. Suppose we swap those intervals

after swapping, item ik + 1 now ends earlier, so its lateness cannot increase. Item Ik now ends at item Ik  + 1 old finishing time lets call time t. Thus, ik's new lateness is:

t - Dik

but since Dik > Dik + 1 we have

t - Dik < t - Dik + 1

Thus after swapping, item Ik's new lateness time is no more than item Ik+1's old lateness time. Thus the maximum lateness cannot have gone up!

Hence, we can swap any adjacent inversions in an optimal solution without increasing maximum lateness, decreasing the toal number of inversions / by 1. Thus, any optimal solution can be eventually exhanged (by swapping adjacent inversions) into a greedy solution without increasing maximum lateness

{% file src="../../../.gitbook/assets/2MoreScheduling.pdf" %}
