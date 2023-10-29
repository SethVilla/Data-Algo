# Selection Sort

* One of the less efficient sorts
* Relatively easy to write and understand
* Can be written iteratively or recursively
* The general approach of selection sort:
  * select smallest unsorted value and swap it in its final place in the list
  * repeat for all values

### Running Time O(n^2) Memory O(1)

this is the same for any initial ordering of the array.

selection sort does not need any additional memory

{% hint style="warning" %}
swapping requires a temporary value\
\
temp = first;

frist = second;

second = temp;
{% endhint %}

### Relies on nested loops

* the outer loop keeps track of the current index that values are swapped into.
* the inner loop finds the next-smallest value to swap.

### Pesudo code

```
loop through array

    loop through array and find smallest item index, swap positin of items based off of index and current position in array
```

### Setup

```
	public static void selectionSort(Comparable[] array) {
		for (int currentIndex = 0; currentIndex < array.length; currentIndex++) { 
			int minIndex = getIndexOfSmallest(array, currentIndex, array.length); 
			swap(array, currentIndex, minIndex);
		} 
	} 

	private static int getIndexOfSmallest(Comparable[] array, int firstPosition, int lastPosition) {
		Comparable min = array[firstPosition];
		int indexOfMin = firstPosition;
	
		for (int index = firstPosition + 1; index < lastPosition; index++) {
			if (array[index].compareTo(min) < 0) { // asks: is the current value smaller than min? if so, it's the new min
				min = array[index];
				indexOfMin = index;			
			} 
		} 
		return indexOfMin;
	} 
	
	private static void swap(Comparable[] array, int i, int j) {
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
```
