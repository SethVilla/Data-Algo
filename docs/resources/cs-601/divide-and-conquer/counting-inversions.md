# Counting Inversions

### Definition

consider a permutation of the numbers 1, 2, 3, .... n&#x20;

{% hint style="info" %}
**Permutation** is a way, especially one of several possible variations, in which a set or number of things can be ordered or arranged.
{% endhint %}

$$
a_1, a_2,.....a_n
$$

an inversion is when i < j but ai > aj

### Example

$$
4, 2, 1, 3, 5
$$

consider the permutation and its number of inversions

$$
3, 2, 5, 1,  4
$$

$$
3>2, 3 > 1, 2 > 1, 5> 1, 5>4
$$

## Why care about inversions:

* Suppose you want to **implement collaborative**: a way of making user recommendations based on seeing which users prefer which kinds of music, movie, etc.
  * How do you determine how similar/ different user preferences are?
  * One method: have them rank a list of music/ movies, count the number of inversions between two users to see how different they are
* Measure similarity between gene sequences
  * Number of inversions to transform one sequence to another gives info on evolutionary relationships&#x20;
* The number of inversions in a list can tell us about the complexity of sorting
  * the number of inversions is the number of swaps needed to sort the array using bubble sort
* Comparing a ranked choice of Ballots
  * cluster ballots based on the number of inversions between voters

### Visualizing Permutations

* draw the permutation above, numbers in increasing order below
* Connect numbers with the same value
* Number of inversions is the number of lines crossing (intersections)

### Inversion Counting

* suppose we split an array in half, and knew how many inversions there were between pairs of elements within each side
* Need: count inversions between pairs with one in left one in right
* for an item on the right: need to know how many items on the left it is smaller than
* This can be implemented as a subroutine of merge-sort!
  * when an item from the right sub-array is placed, add the number of remaining items in the left subarray to the current inversion count
  * Those were all of the inversions involving that element in the right sub array
