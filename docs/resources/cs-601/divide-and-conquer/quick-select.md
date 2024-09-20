# Quick Select

* You have an array with n numbers in it
* what is the kth largest&#x20;
* why do we care?
  * if k = n/2, this. is the smae as finding the median
  * In a query, you might want to find the k largest \[blood pressure reading] \[price] \[transaction] .....

We could simply sort the array, and select the correct index.

Time complexity: O(n log(n))

Better method: **Quick Select**

* very similar to quick sort, except we don't need to sort!
* Use a pivot, place everything less than the pivot to the left, everything larger than the pivot to the right in its correct position
* Depending on the index of the pivot, we continue either with only the right side or left side!
* We eventually place a future pivot into the position of the kth largest element, and we can stop (we have found the kth largest element).

**Worst case: O(n^2)**

**Average case: O(n)**

**Loose argument for why:** Lets imagine that each time we choose a pivot, we leave ourselves with an array thats 99% as large as our original array, then:

$$
T(n) = cn + T(.99n)
$$

$$
T(n) = cn + c0.99n + T((.99n)^2n)
...
$$

$$
= cn 1/1 - .99 = Cn
$$

