# Merge Sort



* One of the more efficient sorts&#x20;
* uses a divide and conquer approach
* can be written iteratively, but is most often seen written with recursion
* The General Approach
  * Divide a list into smaller and smaller sublists
  * Sort that sublists
  * Merge the sorted sublists back together

### Running Time O(nlog(n)) Memory O(n) extra memory

```
	// ******************************* MERGE SORT
	
	public static void mergeSort(Comparable[] array) {
		Comparable[] tempArray = new Comparable[array.length];
		mergeSortHelper(array, tempArray, 0, array.length-1);
	} 

	private static void mergeSortHelper(Comparable[] array, Comparable[] tempArray, int first, int last) {	
		if (first < last) { 
			int mid = (first+last) / 2;
			mergeSortHelper(array, tempArray, first, mid); // the divide/splitting steps
			mergeSortHelper(array, tempArray, mid+1, last); 

			if (array[mid].compareTo(array[mid+1]) > 0) { // efficiency improvement- when this fails, there is no need to merge
				merge(array, tempArray, first, mid, last); // merging together of the solutions
			} 
		} 
	} 

	private static void merge(Comparable[] array, Comparable[] tempArray, int first, int mid, int last) {

		int beginHalf1 = first;
		int endHalf1 = mid;
		int beginHalf2 = mid+1;
		int endHalf2 = last;

		int index = beginHalf1; 
		
		// there are more elements still in both lists
		while((beginHalf1 <= endHalf1) && (beginHalf2 <= endHalf2) ) { 
			if (array[beginHalf1].compareTo(array[beginHalf2]) < 0) {
				tempArray[index] = array[beginHalf1];
				beginHalf1++;
			} else {
				tempArray[index] = array[beginHalf2];
				beginHalf2++;
			}
			index++;
		} 


		// elements remaining in left half
		while (beginHalf1 <= endHalf1) {
			tempArray[index] = array[beginHalf1];
			beginHalf1++;
			index++;
		}

		// elements remaining in right half
		while(beginHalf2 <= endHalf2) {
			tempArray[index] = array[beginHalf2];
			beginHalf2++;
			index++;
		}

		// copy the result back into the original array
		for (index = first; index <= last; index++) {
			array[index] = tempArray[index];
		}
		
	}
```
