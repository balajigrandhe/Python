// Java implementation of the above approach
import java.util.*;

class GFG {

	// Function to print the subsets whose
	// sum is equal to the given target K
	public static void sumSubsets(
		int set[], int n, int target)
	{
		// Create the new array with size
		// equal to array set[] to create
		// binary array as per n(decimal number)
		int x[] = new int[set.length];
		int j = set.length - 1;

		// Convert the array into binary array
		while (n > 0) {
			x[j] = n % 2;
			n = n / 2;
			j--;
		}

		int sum = 0;

		// Calculate the sum of this subset
		for (int i = 0; i < set.length; i++)
			if (x[i] == 1)
				sum = sum + set[i];

		// Check whether sum is equal to target
		// if it is equal, then print the subset
        int count = 0;
		if (sum == target) {
			count++;
		}
        return count;
	}

	// Function to find the subsets with sum K
	public static void findSubsets(int[] arr, int K)
	{
		// Calculate the total no. of subsets
		int x = (int)Math.pow(2, arr.length);

		// Run loop till total no. of subsets
		// and call the function for each subset
        int count = 0;
		for (int i = 1; i < x; i++)
			count += sumSubsets(arr, i, K);
        System.out.print(count);
	}

	// Driver code
	public static void main(String args[])
	{
        Scanner myObj = new Scanner(System.in);
        int val = myObj.nextInt();
		int arr[] = new int(val);
        for(int i=0; i<val; i++){
            arr[i] = myObj.nextInt();
        }
        int k = myObj.nextInt();

		findSubsets(arr, K);
	}
}
