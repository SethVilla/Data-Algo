# Palindrome II

### Statement <a href="#statement" id="statement"></a>

Write a function that takes a string as input and checks whether it can be a valid palindrome by removing at most one character from it.

```
function isAlmostPalindrome(string) {
    let start = 0;
    let end = string.length - 1;
    let skip = 0;  // Allow one skip

    while (start <= end) {
        if (string[start] === string[end]) {
            // Characters match, move both pointers inward
            start++;
            end--;
        } else {
            // Characters don't match, check if we can skip a character
            if (skip < 1) {
                // Try skipping either the character at start or at end
                if (string[start + 1] === string[end]) {
                    skip++;
                    start++;  // Skip `start`
                } else if (string[start] === string[end - 1]) {
                    skip++;
                    end--;  // Skip `end`
                } else {
                    // Neither skipping helps, so it's not a valid palindrome
                    return false;
                }
            } else {
                // Already skipped once, can't skip again
                return false;
            }
        }
    }
    // If we get through the loop, it's a valid "almost palindrome"
    return true;
}

```

### Recursive

```
function isAlmostPalindrome(string) {
    let start = 0;
    let end = string.length - 1;

    // Helper function to check if a substring is a palindrome
    function isPalindromeRange(start, end) {
        while (start <= end) {
            if (string[start] !== string[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    while (start <= end) {
        if (string[start] === string[end]) {
            start++;
            end--;
        } else {
            // Try skipping one character either from the start or from the end
            return (
                isPalindromeRange(start + 1, end) || // Skip `start`
                isPalindromeRange(start, end - 1)    // Skip `end`
            );
        }
    }
    
    return true; // The string is already a palindrome
}

```
