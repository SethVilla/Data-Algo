# Valid Word Abbreviation

### Statement <a href="#statement" id="statement"></a>

Given a string `word` and an abbreviation `abbr`, return TRUE if the abbreviation matches the given string. Otherwise, return FALSE.

A certain word `"calendar"` can be abbreviated as follows:

* `"cal3ar"` (`"cal end ar"` skipping three characters `"end"` from the word `"calendar"` still matches the provided abbreviation)
* `"c6r"` (`"c alenda r"` skipping six characters `"alenda"` from the word `"calendar"` still matches the provided abbreviation)

The following are _not_ valid abbreviations:

* `"c06r"` (has leading zeroes)
* `"cale0ndar"` (replaces an empty string)
* `"c24r"` (`"c al enda r"` the replaced substrings are adjacent)

**Constraints:**

* 1≤1≤ `word.length` ≤20≤20
* `word` consists of only lowercase English letters.
* 1≤1≤ `abbr.length` ≤10≤10
* `abbr` consists of lowercase English letters and digits.
* All the integers in `abbr` will fit in a 3232–bit integer.

### Solution <a href="#solution" id="solution"></a>

The idea behind this problem is to match each character in the abbreviation, `abbr`, exactly to the corresponding character in the word. We incrementally iterate over both strings, ensuring they match at each step. To achieve this, we can use the two-pointer technique. We initialize one pointer to the start of the word and the other to the start of the abbreviation.

The two-pointer technique is efficient for solving this problem because it effectively helps in character matching, handling leading zero cases, and skipping the exact number of characters in `word` as found in `abbr`.

By maintaining these checks and iterating over both strings, we ensure that the abbreviation correctly represents the word.

Having said this, here’s the algorithm that we’ll use to solve the given problem:

1. We create two pointers: `wordIndex` and `abbrIndex`, both initialized to 0.
2. Next, we iterate through the abbreviations string while `abbrIndex` is less than the length of `abbr`:
   1. If a digit is encountered at `abbr[abbrIndex]`:
      1. We then check if that digit is a leading zero. If it is, we return FALSE.
      2. Next, we calculate the number from `abbr` and skip that many characters in `word`.
   2. In case the value at index `abbr[abbrIndex]` is a letter:
      1. We then check for characters that match with `word[wordIndex]`. If the characters don’t match in both strings, we return FALSE.
      2. Next, we increment both `wordIndex` and `abbrIndex` by 11.
3. Finally, we ensure whether both pointers, `wordIndex` and `abbrIndex`, have reached the end of their strings. If they have, we return TRUE. Otherwise, we return FALSE.

### First Attempt Incorrect

```
function validWordAbbreviation(word, abbr) {
  
  let i = 0;
  let j = 0;

  while (i < word.length) {
    
    console.log(abbr[j], abbr[j + 1])
    console.log(word[i], abbr[j])
    if (!Number.isNaN(Number(abbr[j])) && !Number.isNaN(Number(abbr[j + 1]))) {
        let num = Number(abbr[j].toString() + abbr[j + 1].toString())
        if (abbr[j] === "0" || (num > word.length - i)) {
          return false;
        }
      i += Number(num)
      j += 2
    } else if (!Number.isNaN(Number(abbr[j])) && Number(abbr[j]) < word.length - i) {
      i += Number(abbr[j])
      j ++
    } else if (abbr[j] != word[i]) {
      console.log(abbr[j], word[i])
      return false;
    } else if (abbr[j] === word[i]) {
      i++
      j++
    }
  }

    return true;
}

export {
    validWordAbbreviation
}
```

### AI Solution

```
function validWordAbbreviation(word, abbr) {
  let i = 0; // pointer for word
  let j = 0; // pointer for abbreviation

  while (i < word.length && j < abbr.length) {
    if (Number.isNaN(Number(abbr[j]))) {
      // Handle character match
      if (abbr[j] !== word[i]) {
        return false; // Mismatch
      }
      i++;
      j++;
    } else {
      // Handle number abbreviation
      if (abbr[j] === "0") {
        return false; // Leading zero in abbreviation
      }

      // Extract the full number (could be multi-digit)
      let num = 0;
      while (j < abbr.length && !Number.isNaN(Number(abbr[j]))) {
        num = num * 10 + Number(abbr[j]);
        j++;
      }

      // Move pointer in the word by the number of characters
      i += num;

      if (i > word.length) {
        return false; // Exceeded word length
      }
    }
  }

  // Both word and abbreviation should be fully consumed
  return i === word.length && j === abbr.length;
}
```

### Grokking

```
function validWordAbbreviation(word, abbr) {
    let wordIndex = 0, abbrIndex = 0;

    while (abbrIndex < abbr.length) {
        if (!isNaN(abbr[abbrIndex])) {
            if (abbr[abbrIndex] === '0') {
                return false;
            }
            let num = 0;

            while (abbrIndex < abbr.length &&!isNaN(abbr[abbrIndex])) {
                num = num * 10 + parseInt(abbr[abbrIndex]);
                abbrIndex++;
            }
            wordIndex += num;
        } else {
            if (wordIndex >= word.length || word[wordIndex]!== abbr[abbrIndex]) {
                return false;
            }
            wordIndex++;
            abbrIndex++;
        }
    }

    return wordIndex === word.length && abbrIndex === abbr.length;
}

const words = ["a", "a", "abcdefghijklmnopqrst", "abcdefghijklmnopqrst", "word", "internationalization", "localization"];
const abbreviations = ["a", "b", "a18t", "a19t", "w0rd", "i18n", "l12n"];

for (let i = 0; i < words.length; i++) {
    console.log(`${i + 1}.\t word: '${words[i]}'`);
    console.log(`\t abbr: '${abbreviations[i]}'`);
    console.log(`\n\t Is '${abbreviations[i]}' a valid abbreviation for the word '${words[i]}'? ${validWordAbbreviation(words[i], abbreviations[i])? 'Yes' : 'No'}`);
    console.log('-'.repeat(100));
}
```

#### Time complexity <a href="#time-complexity" id="time-complexity"></a>

The time complexity of the solution above is O(n), where nn is the length of the abbreviation string `abbr`. This is because the solution processes each character of `abbr` exactly once.

#### Space complexity <a href="#space-complexity" id="space-complexity"></a>

The space complexity is O(1) because the algorithm uses constant extra space regardless of the input size.
