# Weighted Interval Scheduling

* List of n tasks to be completed
* Each task has start time s(i) and finish time f(i), i = 1,2, ...., n.
* Each task has a weight/ value associated to it: Vi (Can think of this as profit for completing task i).
* Goal: pick subset S - {1,2,...,n} of tasks with non overlapping time such that the summation Vi is as large as possible

### Brute Force Solution

Consider all subsets S of {1,2,3,...,n} and calculate largest sum for each

* check to see if those tasks overlap

#### Time Complexity

The number of subsets of an n element set is 2^n, so we have Omega(2^n) subsets to consider. After that calculating the sum of a subsets value is also O(n) time.

### Build Solution from Smaller Sub-Solutions

Say we order the intervals by finish time

F1 <= F2 <= F3 <= ... <= Fn let

**p(j)** = largest i < j such that intervals i and j are disjoint&#x20;

In lecture we saw a graph that identifies the next closest finish time that does not overlap the current finish time&#x20;

**Opt(j)** = optimal solution when considering only intervals 1, 2,3 .... j

* The solution that contains tasks that don't overlap with the maximum of sum of their values / weights
* When only considering intervals 1 .... j
* ordered by finish time

#### Key Observation

Either the nth interval is in the solution or it is not. If it is then:

Opt(n) = Vn + Opt(p(n))

**(Why?)**

if the nth interval is not in the solution, then

Opt(n) = Opt(n - 1)

**(Why?)**

Opt(n) = max{Vn + Opt(p(n)), Opt(n - 1)}

* The task either includes the nth task or not

### Bad Recursive Method

```
public static double opt (int j) {
    if (j == 0) {
        return 0;
    }
    else {
        return Math.max(v[j] + opt([p[j]]), opt(j - 1));
    }
}
```

has the same complexity as calculating the fibonacci numbers

### Alternative Solution: Recursive, with memoization

**Definition**

**Memoization** is the technique of storing previously computed values, usually with the intent of making future calculations

Have some global array m, which stores the optimal value for each prior j. Let m be initialized with, for example, all -1 values.

```
public static double optMemo(int j) {
    if (j == 0) {
        m[j] = 0;
        return 0;
    } else if (m[j] != -1) {
        return m[j];
    } else {
        m[j] = Math.max(v[j] + optMemo[p[j]), optMemo(j - 1));
        return m[j];
    }
}
```

* Each time the memoized recursion is called O(1) operations are performed.
* Each call fills in 1 element in the array m
* Thus, the time complexity is O(n )

## Solution without Recursion

the same idea can be implemented with an iterative method

```
public static double optIter(int n) {
    double[] m = new double[n + 1];
    m[0] = 0;
    for (int j = 1; j <=n; j++) {
        m[j] = Math.max(v[j] + m[p[j]], m[j - 1]);
    }
    return m[n];
}
```

Here it is even more straightforward to see that the running time is O(n)

(Note: this is assuming we already have p(j), and we already have the intervals in order of increasing finish time);

## The Intervals in the Solution

* We showed how to find the sum of the weights of the optimal set of intervals
* How do we find which intervals are in that optimal set?
* We can use the array m created in the solution:
  * Recall that the nth interval is in the optimal set if&#x20;
  * Vn + Opt(p(n)) > Opt(n - 1)
  * Thus we can backtrack through m to see which intervals are in the optimal set.
