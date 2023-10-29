# Shell Sort

* Somewhere between a less and more efficient sort
* a variation of insertion sort that leverages the fact that insertion sort works more efficiently when data is "more sorted."
* General approach of Shell Short
  * look at all the elements at a given space from each other. Sort those elements among each other
  * reduce the space and repeat again
* Shell sort uses repeated insertion sorts, but on increasingly sorted data.
* In the worst case, Shell sort os O(n^2)
* However, a simple improvement of making sure the spacing /gap variable is always odd improves this O(n^1.5)
* Shell sort does not need any additional memory

```
public static void shellSort(Comparable[] array)  {
		int space = array.length/2;
		while(space > 0) {
	         if (space % 2 == 0) { // if space is even, add 1- efficiency improvement
	        	 space++;
	         }		
	         for (int begin = 0; begin < space; begin++) {
	            incrementalInsertionSort(array, begin, array.length-1, space);
	         }	      

	         space = space/2;
	   } 
	}
	   
	// compare this to insertionSort- it's the same algorithm when space==1!
	private static void incrementalInsertionSort(Comparable[] array, int first, int last, int space) {
	      
	      for (int unsortedIndex = first+space; unsortedIndex <= last; unsortedIndex = unsortedIndex+space) {

	    	 Comparable nextToInsert = array[unsortedIndex];
	         int index = unsortedIndex-space;
	         
	         while ((index >= first) && (nextToInsert.compareTo(array[index]) < 0)) {
	            array[index + space] = array[index];
	            index = index - space;
	         } 
	         
	         array[index + space] = nextToInsert;
	      } 
	   } 

```
