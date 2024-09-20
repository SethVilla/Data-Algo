# Sort Colors

#### Optimized approach using two pointers[#](https://www.educative.io/courses/grokking-coding-interview-patterns-javascript/solution-sort-colors#Optimized-approach-using-two-pointers) <a href="#optimized-approach-using-two-pointers" id="optimized-approach-using-two-pointers"></a>

The essence of the algorithm lies in efficiently partitioning the array into three sections corresponding to the colors red, white, and blue. We keep track of the boundaries of the red and blue sections while iterating through the array. Reds are kept on the left side of the array, while blues remain on the right side, with whites in between. When encountering a red (00), it’s placed at the end of the red section, and when finding a blue (22), it’s moved to the beginning of the blue section. Elements of value 11 (white) remain in place. This process continues until all the colors are separated, ensuring proper grouping of colors.

To implement it, we use two pointers (`start` and `end`) to traverse the array from either end. They keep track of the red and blue elements, respectively. In addition, we maintain another pointer (`current`) to keep track of the white elements. These pointers are used to traverse the array in one pass. They are initialized as follows:

* `start`: This pointer will initially point to the 0th0th index of the array.
* `current`: This pointer will initially point to the 0th0th index of the array.
* `end`: This pointer will initially point to the last index of the array.

Here’s how the algorithm works:

* **Condition 1:** If `colors[current]` is `0`, the `current` pointer points to red. Swap the elements of `colors[current]` and `colors[start]`. Next, move both the `start` and `current` pointers one position forward.
* **Condition 2:** Otherwise, if `colors[current]` is `1`, the `current` pointer points to white. Increment the `current` pointer by `1` to analyze the next element.
*   **Condition 3:** Otherwise, `colors[current]` will be `2`, i.e., the `current` pointer points to blue. Swap the elements of `colors[current]` and `colors[end]`. Next, move the `end` pointer one position backward.

    > **Note:** When we decrement the `end` pointer, the `current` pointer remains unchanged since it has to analyze the swapped element to determine if further swapping is required with the `start` pointer.
* The three steps above are repeated until the `end` pointer becomes less than the `current` pointer, i.e., no elements are left to swap.

Let’s look at the following illustration to get a better understanding of the solution:

```
function sortColors(colors){

    // Write your code here
    let start = 0;
    let current = 0;
    let end = colors.length - 1;
    
    while (current <= end) {
      if (colors[current] === 0) {
        let temp = colors[start];
        colors[start] = colors[current];
        colors[current] = temp;
        current++
        start++
      } else if (colors[current] === 1) {
        current++
        continue
      } else {
        let temp = colors[end];
        colors[end] = colors[current];
        colors[current] = temp;
        end--
      }
    }
    return colors;
}

export { sortColors }
```

```
function sortColors(colors) {

    let start = 0;
    let current = 0;
    let end = colors.length - 1;

    while (current <= end) {
        
        if (colors[current] === 0) {
            
            [colors[start], colors[current]] = [colors[current], colors[start]];

            current++;
            start++;
        }

        else if (colors[current] === 1) {
            current++;
        }

        else {

            [colors[current], colors[end]] = [colors[end], colors[current]];
            
            end--;
        }
    }

    return colors;
}
```

**Solution summary**

To summarize, solving this problem involves the following steps:

* Traverse the array and swap elements, as required, to organize them correctly.
* If the encountered color is red, swap its value with that of the `start` pointer. If the color is blue, swap its value with that of the `end` pointer.
* White elements are skipped, and pointers are adjusted accordingly.
* The array is sorted when the `end` pointer moves to the left of the `current` pointer.

**Time complexity**

The time complexity of this solution is O(n) since we’re only traversing the array once.

**Space complexity**

The space complexity of this solution is O(1) since no extra space is used.
