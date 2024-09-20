# Is Valid Palindrome

```
function isPalindrome(s) {
    
    // Replace this placeholder return statement with your code
    for (let low = 0, high = s.length - 1; low < s.length / 2; low++, high--) {
      if (s[low] != s[high]) {
        return false;
      }
    }
    return true;
}

```

```
function isPalindrome(s) {
    let left = 0,
        right = s.length - 1;

    while (left < right) {
		if (s[left] != s[right]) { 
			return false;
		}
		left++; 
		right--; 
    }
    return true;
}
```

**Solution summary**

* Initialize two pointers and move them from opposite ends.
* The first pointer starts at the beginning of the string and moves toward the middle, while the second pointer starts at the end and moves toward the middle.
* Compare the elements at each position to detect a nonmatching pair.
* If both pointers reach the middle of the string without encountering a nonmatching pair, the string is a palindrome.

**Time complexity**

The time complexity is O(n), where n is the number of characters in the string. However, our algorithm will only run (n/2) times, since two pointers are traversing toward each other.

**Space complexity**

The space complexity is O(1), since we use constant space to store two indexes.
