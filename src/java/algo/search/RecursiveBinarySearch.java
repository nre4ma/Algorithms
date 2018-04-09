/**
 * 
 */
package java.algo.search;

/**
 * @author Noel
 *
 */
public class RecursiveBinarySearch {

	public int binarySearch(int arr[], int low, int high, int searchTerm) {
		if(high >= low) { // if the last index is 1 or greater 
			
			int mid = low + (high - low) / 2;
			
			if(searchTerm == arr[mid]) // If the mid index contains the element we're searching for (Best case)
				return mid;
			
			// If the searchTerm is smaller than the one in the arr[mid], search lower half of the arr
			if (searchTerm < arr[mid])
				return binarySearch(arr, low, mid-1, searchTerm ); // mid-1 since searchTerm is < than the element on that index.
			
			// Else search the higher half of the arr.
			return binarySearch(arr, mid+1, high, searchTerm); // mid+1 because searchTerm is > than the element on that index.
		}
		
		return -1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RecursiveBinarySearch b = new RecursiveBinarySearch();
        int arr[] = {2,10,50,70,90,100};
        int n = arr.length;
        int x = 10;
        int result = b.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + 
                                                 result);

	}

}
