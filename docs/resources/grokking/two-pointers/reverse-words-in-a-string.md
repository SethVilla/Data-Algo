# Reverse Words in a String

1. **Reversing the entire sentence:**
   1. We first reverse the complete string. This step places the words in their correct positions relative to each other, although each word is backward.
2. **Reversing each word:**
   1. Iterate through the reversed sentence:
      1. Use two pointers, `start` and `end`, both initially set to 0. The first pointer, `start`, marks the beginning of a word, and the second pointer, `end`, finds the end of a word.
      2. When the end of a word is found (either a space or the end of the string), we reverse the characters in that word in place.
      3. After reversing, we update `start` to point to the beginning of the next word.
      4. Now, we'll repeat this process for the next word. At the end of all iterations, we get the reversed words in the string.
      5. We repeat this process for all words in the string.

```
// strRev reverses a substring within a string from startRev to endRev
function strRev(str, startRev, endRev) {
    // Convert the string to an array to manipulate characters
    let arr = str.split('');
    while (startRev < endRev) {
        let temp = arr[startRev];
        arr[startRev] = arr[endRev];
        arr[endRev] = temp;
        startRev++;
        endRev--;
    }
    // Convert the array back to a string
    return arr.join('');
}

function reverseWords(sentence) {
    // Remove extra spaces and strip leading/trailing spaces
    sentence = sentence.replace(/\s+/g, " ").trim();

    let strLen = sentence.length - 1;
    // Reverse the whole sentence first
    sentence = strRev(sentence, 0, strLen);

    // Iterate through the sentence to find and reverse each word
    for (let start = 0, end = 0; end <= strLen; ++end) {
        if (end === strLen || sentence[end] === ' ') {
            // Include end character for the last word
            let endIdx = (end === strLen) ? end : end - 1;
            // Reverse the current word
            sentence = strRev(sentence, start, endIdx);
            // Move the "start" pointer to the start of the next word
            start = end + 1;
        }
    }

    return sentence;
}


// Driver code
let stringsToReverse = [
    "Hello World",
    "a   string   with   multiple   spaces",
    "Case Sensitive Test 1234",
    "a 1 b 2 c 3 d 4 e 5",
    "     trailing spaces",
    "case test interesting an is this"
];

stringsToReverse.forEach((str, index) => {
    console.log(`${index + 1}.\tOriginal string: '${str}'`);
    console.log(`\tReversed string: '${reverseWords(str)}'`);
    console.log('-'.repeat(100));
});

```

#### Time complexity <a href="#time-complexity" id="time-complexity"></a>

It takes O(n)time to remove the leading and trailing whitespace and replace multiple spaces with a single space in the sentence, where nn is the length of the sentence. Additionally, the array is traversed twice in O(n+n)=O(n) time. Therefore, the overall time complexity of this solution is O(n).

#### Space complexity <a href="#space-complexity" id="space-complexity"></a>

The space complexity of this solution is O(n), since, at the start of the algorithm, we copy it into a list of characters to overcome the issue of strings being immutable in JavaScript.
