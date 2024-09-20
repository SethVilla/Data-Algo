# findSumOfThree

```
export function findSumOfThree(nums, target) {
    // Replace this placeholder return statement with your code
    nums.sort((a,b) => a - b);
    
    console.log(nums)
    
    for (let i = 0; i < nums.length - 2; i++) {
      let low = i + 1;
      let high = nums.length - 1;
      
      while (low < high) {
        let sum = nums[i] + nums[low] + nums[high];
        if (sum === target) {
          return true;
        } else if (sum < target) {
          low++;
        } else {
          high--;
        }
      }
    }
    
    return false
}
```

**Solution summary**

First, sort the array in ascending order. To find a triplet whose sum is equal to the target value, loop through the entire array. In each iteration:

1. Store the current array element and set up two pointers (`low` and `high`) to find the other two elements that complete the required triplet.
   * The `low` pointer is set to the current loop’s index + 1.
   * The `high` is set to the last index of the array.
2. Calculate the sum of array elements pointed to by the current loop’s index and the `low` and `high` pointers.
3. If the sum is equal to `target`, return TRUE.
4. If the sum is less than `target`, move the `low` pointer forward.
5. If the sum is greater than `target`, move the `high` pointer backward.

Repeat until the loop has processed the entire array. If, after processing the entire array, we don’t find any triplet that matches our requirement, we return FALSE.

**Time complexity**

In the solution above, sorting the array takes O(n log(n)) and the nested loop takes O(n2) to find the triplet. Here, n is the number of elements in the input array. Therefore, the total time complexity of this solution is O(n log(n)+n^2), which simplifies to O(n^2).

**Space complexity**

Because we use the built-in JavaScript function, `sort()`, which does the in-place sorting. Therefore, the space complexity of the provided solution is O(1).
