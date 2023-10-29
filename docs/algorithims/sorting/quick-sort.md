# Quick Sort

* Efficient sorts
* Uses a divide and conquer approach
* Can be written iteratively, but is most often seen written with recursion
* General Approach
  * Divides the array into two parts (not necessarily two halves) and select one element as the pivot
  * Place that pivot in its final position elements less than the pivot on the left and elements greater than the pivot on the right (not necessarily sorted)
  * repeat on each part
* Quick sort rearranges the elements in an array during a partitioning process.
* After each step in the process, one element (the pivot) is placed in its correct sorted position.

### Running Time O(n log(n)) on average

* worst case is O(n^2) (used on an already sorted set)
* choice of partition affects efficiency
* quick sort does not require additional memory O(1)

```
public static void quickSort(Comparable[] array) {
		quickSort(array, 0, array.length-1);
	}

	private static void quickSort(Comparable[] array, int first, int last) {
		if (last - first + 1 < MIN_SIZE) {
			insertionSort(array, first, last+1); 
		} else {
			// create the partition: Smaller | Pivot | Larger
			int pivotIndex = partition(array, first, last);

			// sort subarrays Smaller and Larger
			quickSort(array, first, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, last);
		} 
	} 

	private static int partition(Comparable[] array, int first, int last) {
		int mid = (first + last) / 2;
		sortFirstMiddleLast(array, first, mid, last);
		
		swap(array, mid, last - 1);
		int pivotIndex = last - 1;

		Comparable pivot = array[pivotIndex];

		int indexFromLeft = first + 1;
		int indexFromRight = last - 2;
		boolean done = false;
		while (!done) {
			
			while (array[indexFromLeft].compareTo(pivot) < 0) {
				indexFromLeft++;
			}

			while (array[indexFromRight].compareTo(pivot) > 0) {
				indexFromRight--;
			}

			assert array[indexFromLeft].compareTo(pivot) >= 0
					&& array[indexFromRight].compareTo(pivot) <= 0;

			if (indexFromLeft < indexFromRight) {
				swap(array, indexFromLeft, indexFromRight);
				indexFromLeft++;
				indexFromRight--;
				
			} else {
				done = true;
			}
		} 

		swap(array, pivotIndex, indexFromLeft);
		pivotIndex = indexFromLeft;

		return pivotIndex;
	} 

	private static void sortFirstMiddleLast(Comparable[] array, int first, int mid, int last) {
		if (array[first].compareTo(array[mid]) > 0) {
			swap(array, first, mid);
		}
		if (array[mid].compareTo(array[last]) > 0) {
			swap(array, mid, last);
		}
		if (array[first].compareTo(array[mid]) > 0) {
			swap(array, first, mid);
		}
	}
	
	private static void swap(Comparable[] array, int i, int j) {
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private static void insertionSort(Comparable[] array, int first, int last) {
		
		for (int unsortedIndex = first+1; unsortedIndex < last; unsortedIndex++) { 
			Comparable unsortedElement = array[unsortedIndex];
			int lowestSortedIndex = 0;
			int highestSortedIndex = unsortedIndex-1;
			int index = highestSortedIndex;

			while( index >= lowestSortedIndex &&
					unsortedElement.compareTo(array[index]) < 0 ) {
				array[index+1] = array[index]; // make room
				index--;
			}
			array[index+1] = unsortedElement; 
		} 
	}
```
