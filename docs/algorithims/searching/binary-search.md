# Binary Search

* A binary search assumes the list of items in the search pool is already sorted.
* Binary search eliminates a large part of the search pool with a single comparison&#x20;
  * each comparison elimantes about half of the remaining data.
* Binary search is O(log n)
* implemented iteratively or recursively
* does not make sense for linked node implementations&#x20;

```
public static int binarySearchIterative(int[] numbers, int target) {
		int targetLocation = -1;
		boolean found = false;
		int first = 0;
		int last = numbers.length - 1;
		int comparisonCount = 0;

		while (first <= last && !found) {
			comparisonCount++;
			int mid = (first + last) / 2;

			if (numbers[mid] == target) {
				targetLocation = mid;
				found = true;
			} else if (numbers[mid] < target) {
				first = mid + 1;
			} else { // numbers[mid] > target
				last = mid - 1;
			}
		}
		System.out.println("In binary search iterative, comparison count is \t" + comparisonCount);
		return targetLocation;
	}

	public static int binarySearchRecursive(int[] numbers, int target) {
		comparisonCountBinaryRecursive = 0;
		int answer = binarySearchRecursiveHelper(numbers, target, 0, numbers.length - 1);
		System.out.println("In binary search recursive, comparison count is \t" + comparisonCountBinaryRecursive);
		return answer;
	}

	private static int comparisonCountBinaryRecursive = 0;

	private static int binarySearchRecursiveHelper(int[] numbers, int target, int first, int last) {
		int mid = ((last - first) / 2) + first;
		comparisonCountBinaryRecursive++;
		if (first > last) {
			return -1; // indices cross over
		} else if (target == numbers[mid]) {
			return mid; // we found it!
		} else if (target < numbers[mid]) {
			return binarySearchRecursiveHelper(numbers, target, first, mid - 1);
			// keep looking in left half
		} else { // target > numbers[mid]
			return binarySearchRecursiveHelper(numbers, target, mid + 1, last);
			// keep looking in right half
		}
	}
```
