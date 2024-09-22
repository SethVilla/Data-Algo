# Interval Scheduling

* list of n tasks to be completed
* Each task has a start time s(i) and finish time f(i). i = 1,2,3,4,5...n
* Goal: pick k tasks with nonoverlapping times such that k (number of completed tasks) is as large as possible.

### How not to solve:

\#1

* Pick the task that starts the earliest
* Remove all tasks that conflict with this task
* Repeat until no additional tasks can be added

\#2

* Pick the task with the fewest conflicts
* Remove all tasks that conflict with this task
* Repeat until not additional tasks can be added

### How to solve

* Pick the task with earliest finishing time
* Remove all tasks that conflict with this task
* Repeat until no additional tasks can be added

### Implementation

1. Sort the n requests by finishing time
2. Select the first element in sorted array
3. Step through the array (still sorted by finishing time) until you find the first element whose starting time is at or later than the most recently selected finishing time select that element
4. Repeat step 3 until your reach the end of the array

### Time Complexity

* Step 1 is O(n log(n))
* Step 2 is O(1)
* Step 3 and 4 is O(n) time total

in total: (n log(n) + O(1) + O(n) = O(n log(n))

### Practice

* [Leetcode](https://leetcode.com/problems/non-overlapping-intervals/)

```javascript
/**
 * @param {number[][]} intervals
 * @return {number}
 */
var eraseOverlapIntervals = function(intervals) {
    
    const sortedIntervals = intervals.sort((a,b) => a[1] - b[1])

    let selected = sortedIntervals[0][1]
    let count = 0;

    for (let i = 1; i < sortedIntervals.length; i++) {
        console.log([selected, sortedIntervals[i][0]])
        if (selected > sortedIntervals[i][0]) {
            count++        
        } else {
            selected = sortedIntervals[i][1]
        }
    }
    return count;
    
};
```



{% file src="../../../.gitbook/assets/1CourseIntro_GreedyAlgorithms.pdf" %}
