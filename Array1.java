
package array1;

public class Array1 {
}
//----------------------------------------------------------------------------------------------
// Java code for linearly searching x in arr[].
// If x is present, return its location, otherwise return -1.
// 
// Author: Duha alshamarni
// ID: 445005455
//----------------------------------------------------------------------------------------------

class LinearSearch {

    // This function returns the index of element x in arr[]
    static int search(int arr[], int n, int x) {
        // Loop through each element in the array
        for (int i = 0; i < n; i++) {
            // Return the index of the element if the element is found
            if (arr[i] == x)
                return i; // Return the index of the found element
        }
        // Return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args) {
        // Initialize the array with 5 elements
        int[] arr = { 3, 4, 1, 7, 5 };
        
        // Update the element to search for (as per requirement)
        int x = 7; // Change the value from 4 to 7

        // Get the length of the array
        int n = arr.length;

        // Search for the element and store the result index
        int index = search(arr, n, x);

        // Print the result based on whether the element was found or not
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}

