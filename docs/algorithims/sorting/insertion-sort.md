# Insertion Sort

* Less efficient sort
* easy to write and understand
* can be written iteratively and recursively&#x20;
  * recursive insertion sort is good for linked nodes
* General Approach
  * Pick the next item to be sorted and shift (insert) it into its proper place in an already-sorted sublist.
  * Repeat until all items have been inserted

### Running Time O(n^2) Memory O(1)

* best case the array is already sorted O(n)

{% hint style="warning" %}
Insertion sort does not worry about mins or maxes
{% endhint %}

### Relies on nested loops

* The outer loop keeps track of where the border of the sorted sublist is. (where are the indices that have already been sorted)
* The inner loop finds the correct position of the next element to be inserted into the sorted sublist.

```
// ******************************* INSERTION SORT
	
	public static void insertionSort(Comparable[] array) {
		// trace through unsorted elements we assume index 0 is sorted so we start at position 1
		for (int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) { 
			// current unsorted element
			Comparable unsortedElement = array[unsortedIndex];
			
			// mark the bounds of our sorted items
			int lowestSortedIndex = 0;
			int highestSortedIndex = unsortedIndex-1;

			insertInOrder(unsortedElement, array, lowestSortedIndex, highestSortedIndex);
		} 
	}

	private static void insertInOrder(Comparable unsortedElement, Comparable[] array, int lowestSortedIndex, int highestSortedIndex) {
		
		int index = highestSortedIndex;
		while( index >= lowestSortedIndex &&
				unsortedElement.compareTo(array[index]) < 0 ) {
			array[index+1] = array[index]; // make room
			index--;
		}
		array[index+1] = unsortedElement; 
	}
```
