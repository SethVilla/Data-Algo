# Linear Search



```java
boolean found = false;

for (int i = 0; i < data.length && !found; i++) {
    if (target.equals(data[i])) {
        found = true;
    }
}
```

```java
	// finds the first location of a target
	public static int linearSearchIterative(int[] numbers, int target) {
		int targetLocation = -1;
		boolean found = false; // include if we want to stop when we find the target
		// without this variable, we will return the LAST location of the target

		int comparisonCount = 0;

		for (int i = 0; (i < numbers.length && !found); i++) {
			comparisonCount++;
			if (numbers[i] == target) {
				found = true;
				targetLocation = i;
			}
		}
		System.out.println("In linear search iterative, comparison count is \t" + comparisonCount);
		return targetLocation;

	}

	public static int linearSearchRecursive(int[] numbers, int target) {
		comparisonCountLinearRecursive = 0;
		int answer = linearSearchRecursiveHelper(numbers, target, 0, numbers.length - 1);
		System.out.println("In linear search recursive, comparison count is \t" + comparisonCountLinearRecursive);
		return answer;
	}

	private static int comparisonCountLinearRecursive = 0;
	
	private static int linearSearchRecursiveHelper(int[] numbers, int target, int first, int last) {
		comparisonCountLinearRecursive++;
		if (first > last) { // indices cross over- it's not here
			return -1;
		} else if (target == numbers[first]) { // we found it!
			return first; 
		} else { // keep looking
			return linearSearchRecursiveHelper(numbers, target, first + 1, last);
			
		}
	}

	public static int linearSearchIterativeImprovedForSorted(int[] numbers, int target) {
		int targetLocation = -1;
		boolean found = false;
		boolean gonePastTarget = false;
		int comparisonCount = 0;

		for (int i = 0; (i < numbers.length && !found && !gonePastTarget); i++) {
			comparisonCount++;
			if (numbers[i] == target) {
				found = true;
				targetLocation = i;
			} else if (numbers[i] > target) {
				gonePastTarget = true;
			}
		}
		System.out.println("In linear search optimized for sorting, count is \t" + comparisonCount);
		return targetLocation;
	}
```
