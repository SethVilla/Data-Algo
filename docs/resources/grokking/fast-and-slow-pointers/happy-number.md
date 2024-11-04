# Happy Number

### Statement <a href="#statement" id="statement"></a>

Write an algorithm to determine if a number nn is a happy number.

We use the following process to check if a given number is a happy number:

* Starting with the given number nn, replace the number with the sum of the squares of its digits.
* Repeat the process until:
  * The number equals 11, which will depict that the given number n is a happy number.
  * The number enters a cycle, which will depict that the given number n is not a happy number.

Return TRUE if n is a happy number, and FALSE if not.

### Solution <a href="#solution" id="solution"></a>

So far, you have probably brainstormed some approaches and have an idea of how to solve this problem. Let’s explore some of these approaches and figure out which one to follow based on considerations such as time complexity and any implementation constraints.

#### Naive approach <a href="#naive-approach" id="naive-approach"></a>

The brute force approach is to repeatedly calculate the squared sum of digits of the input number and store the computed sum in a hash set. For every calculation, we check if the sum is already present in the set. If yes, we've detected a cycle and should return FALSE. Otherwise, we add it to our hash set and continue further. If our sum converges to 11, we've found a happy number.

While this approach works well for small numbers, we might have to perform several computations for larger numbers to get the required result. So, it might get infeasible for such cases. The time complexity of this approach is O(log⁡n). The space complexity is O(logn) since we're using additional space to store our calculated sums.

#### Optimal approach using Fast and Slow Pointers pattern <a href="#optimal-approach-using-fast-and-slow-pointers-pattern" id="optimal-approach-using-fast-and-slow-pointers-pattern"></a>

To determine whether a number is a happy number, it is iteratively replaced by the sum of the squares of its digits, forming a sequence of numbers. This sequence either converges to 11 (if the number is happy) or forms a cycle (if the number is not happy). We use the fast and slow pointers technique to detect such cycles efficiently. This technique involves advancing two pointers through the sequence at different speeds: one moving one step at a time and the other two at a time.

The pointer moving slower is initialized to the given number, and the faster one starts at the sum of the squared digits of the given number. Then, in each subsequent iteration, the slow pointer updates to the sum of squared digits of itself, while the fast pointer advances two steps ahead: first by updating to the sum of squared digits of itself and then to the sum of squared digits of this recently calculated sum. If the number is happy, the fast pointer will eventually reach 11. However, if the number is not happy, indicating the presence of a cycle in the sequence, both pointers will eventually meet. This is because, in the noncyclic part of the sequence, the distance between the pointers increases by one number in each iteration. Once both pointers enter the cyclic part, the faster pointer starts closing the gap on the slower pointer, decreasing the distance by one number in each iteration until they meet. This way, we can efficiently determine whether a number is a happy number or not.

<pre><code><strong>import sumOfSquaredDigits from "./sum_of_squared_digits.js";
</strong>
const sumOfSquares = (num) => {
    let sum = 0;
    while (num > 0) {
        let digit = num % 10;
        sum += digit * digit;
        num = Math.floor(num / 10);
    }
    return sum;
};

export function isHappyNumber(n){
    
    let slow = n;
    let fast = sumOfSquares(n);
    
    while (fast !== 1 &#x26;&#x26; slow !== fast) {
        slow = sumOfSquares(slow);
        fast = sumOfSquares(sumOfSquares(fast));
    }
    
    return fast === 1;
}
</code></pre>

**Solution summary**

We maintain track of two values using a slow pointer and a fast pointer. The slow runner advances one number at each step, while the fast runner advances two numbers. We detect if there is any cycle by comparing the two values and checking if the fast runner has indeed reached the number one. We return True or False depending on if those conditions are met.

**Time complexity**

The time complexity for this algorithm is O(log⁡n), where nn is the input number.

The worst case time complexity of this algorithm is given by the case of a non-happy number, since it gets stuck in a cycle, whereas a happy number quickly converges to 11. Let’s first calculate the time complexity of the **Sum Digits** function. Since we are calculating the sum of all digits in a number, the time complexity of this function is O(log⁡n), because the number of digits in the number nn is log⁡10nlog10​n.

Before delving into the detailed complexity analysis, let's first consider the largest possible next number for each given number of digits:

###

| **Digits** | **Largest number** | **Sum of squared digits** |
| ---------- | ------------------ | ------------------------- |
| 1          | 9                  | 81                        |
| 2          | 99                 | 162                       |
| 3          | 999                | 243                       |
| 4          | 9999               | 324                       |
| 12         | 999999999999       | 972                       |
| 13         | 9999999999999      | 1053                      |
| 14         | 99999999999999     | 1134                      |

To estimate the count of numbers in a cycle, let’s consider the following two cases:

1. **Numbers with three digits:** The largest three-digit number is 999999. The sum of the squares of its digits is 243243. Therefore, for three-digit numbers, no number in the cycle can go beyond 243243. Therefore, the time complexity in this case is given as O(243×3)_,_ where 243 is the maximum count of numbers in a cycle and 33 is the number of digits in a three-digit number. This is why the time complexity in the case of numbers with three digits comes out to be O(1).
2. **Numbers with more than three digits:** Any number with more than three digits will lose at least one digit at every step until it becomes a three-digit number. For example, the first four-digit number that we can get in the cycle is 10531053, which is the sum of the square of the digits in 99999999999999999999999999. Therefore, the time complexity of any number with more than three digits can be expressed as O(log⁡n+log⁡log⁡n+log⁡log⁡log⁡n+…)O(logn+loglogn+logloglogn+…). Since O(log⁡n) is the dominating term, we can write the time complexity as O(log⁡n).

Therefore, the total time complexity comes out to be O(1+log⁡n), which is O(log⁡n).

**Space complexity**

The space complexity for this algorithm is O(1)O(1).
