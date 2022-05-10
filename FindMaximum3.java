// Java implementation of 
// the hashmap approach
import java.io.*;
import java.util.*;

class FindMaximum3{
    
// Function to find maximum
// index difference
static int maxIndexDiff(ArrayList<Integer> arr, int n)
	{
		
		// Initialise unordered_map
		Map<Integer, ArrayList<Integer>> hashmap = new HashMap<Integer, 
										ArrayList<Integer>>(); 
			
		// Iterate from 0 to n - 1
		for(int i = 0; i < n; i++) 
		{
			if(hashmap.containsKey(arr.get(i)))
			{
				hashmap.get(arr.get(i)).add(i);
			}
			else
			{
				hashmap.put(arr.get(i), new ArrayList<Integer>());
				hashmap.get(arr.get(i)).add(i);
			}
			
			
		}
		
		for (Integer name: hashmap.keySet()) {
				String key = name.toString();
				String value = hashmap.get(name).toString();
				System.out.println(key + " " + value);
			}
		System.out.println("------------------------------------------");
		// Sort arr
		Collections.sort(arr);
		
		 System.out.println("arr after the use of" +
                           " Collection.sort() :\n" + arr );
		
		int maxDiff = Integer.MIN_VALUE;
		int temp = n;
		
		// Iterate from 0 to n - 1
		for(int i = 0; i < n; i++)
		{
				System.out.print("      temp="+temp);
				System.out.print("   hashmap.get(arr.get("+i+")).get(0))="+hashmap.get(arr.get(i)).get(0));
			if (temp > hashmap.get(arr.get(i)).get(0))
			{

				temp = hashmap.get(arr.get(i)).get(0);
			}
			
			    int hashget_minus_temp=hashmap.get(arr.get(i)).get(0)-temp;
						
		//maxDiff = Math.max(maxDiff,hashmap.get(arr.get(i)).get(hashmap.get(arr.get(i)).size() - 1) - temp);
			
		/**	int size_minus_1=hashmap.get(arr.get(i)).size() - 1;
			int arr_get=arr.get(i);
			int hashget=hashmap.get(arr_get).get(size_minus_1);
			int hashget_minus_temp=hashmap.get(arr_get).get(size_minus_1)-temp;*/
			
		/**	System.out.print("  size_minus_1="+size_minus_1);
			System.out.print("  arr_get="+arr_get);
			System.out.print("  hashget="+hashget);
			System.out.print("  temp="+temp);
			System.out.print("  hashget_minus_temp="+hashget_minus_temp);*/

			maxDiff=Math.max(maxDiff,hashget_minus_temp);
			
      //   maxDiff = Math.max(maxDiff,hashmap.get(arr.get(i)).get(0)-temp);

			System.out.println("   MiddlemaxDiff="+maxDiff);
			System.out.println();
		}
		System.out.println();
		System.out.println("------------------------------------------");
		
		return maxDiff;
	}

// Driver Code
	public static void main(String[] args)
	{
		int n = 9;
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(9, 2, 5, 3, 6, 18, 8, 7, 0));
				System.out.println("arr"+arr);
				System.out.println("------------------------------------------");
			
		// Function Call
		int ans = maxIndexDiff(arr, n);
		
		System.out.println("The maxIndexDiff is : " + ans);
	}
}