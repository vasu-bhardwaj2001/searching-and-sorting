import java.util.Arrays;
import java.util.Scanner;

public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("What algorithm?");
		String algorithm = input.nextLine();
		if(algorithm == "bubblesort") {
			System.out.println("what type of data?");
			String data = input.nextLine();
			if(data == "integer") {
				System.out.println("How is it stored?");
				String storage = input.nextLine();
				System.out.println("Input data");
				String storedata = input.nextLine();
				String[] convertdata = storedata.split(",");
				int[] finaldata = new int[convertdata.length];
				for(int i = 0; i < convertdata.length; i++) {
					int usedata = Integer.parseInt(convertdata[i]);
					finaldata[i] = usedata;
				}
				bubbleSort(finaldata);
			}
			if (data == "String") {
				System.out.println("How is it stored?");
				String storage = input.nextLine();
				System.out.println("Input data");
				String storedata = input.nextLine();
				String[] convertdata = storedata.split(",");
				bubbleSortString(convertdata);
			}
		}if(algorithm == "Selectionsort") {
			System.out.println("what type of data?");
			String data = input.nextLine();
			if(data == "integer") {
				System.out.println("How is it stored?");
				String storage = input.nextLine();
				System.out.println("Input data");
				String storedata = input.nextLine();
				String[] convertdata = storedata.split(",");
				int[] finaldata = new int[convertdata.length];
				for(int i = 0; i < convertdata.length; i++) {
					int usedata = Integer.parseInt(convertdata[i]);
					finaldata[i] = usedata;
				}
				selectionSort(finaldata);
			}
			if (data == "String") {
				System.out.println("How is it stored?");
				String storage = input.nextLine();
				System.out.println("Input data");
				String storedata = input.nextLine();
				String[] convertdata = storedata.split(",");
				selectionSortString(convertdata);
			}
		}if(algorithm == "insertionSort") {
			System.out.println("what type of data?");
			String data = input.nextLine();
			if(data == "integer") {
				System.out.println("How is it stored?");
				String storage = input.nextLine();
				System.out.println("Input data");
				String storedata = input.nextLine();
				String[] convertdata = storedata.split(",");
				int[] finaldata = new int[convertdata.length];
				for(int i = 0; i < convertdata.length; i++) {
					int usedata = Integer.parseInt(convertdata[i]);
					finaldata[i] = usedata;
				}
				insertionSort(finaldata);
			}
			if (data == "String") {
				System.out.println("How is it stored?");
				String storage = input.nextLine();
				System.out.println("Input data");
				String storedata = input.nextLine();
				String[] convertdata = storedata.split(",");
				insertionSortString(convertdata);
			}
		}if(algorithm == "mergeSort") {
			System.out.println("what type of data?");
			String data = input.nextLine();
			if(data == "integer") {
				System.out.println("How is it stored?");
				String storage = input.nextLine();
				System.out.println("Input data");
				String storedata = input.nextLine();
				String[] convertdata = storedata.split(",");
				int[] finaldata = new int[convertdata.length];
				for(int i = 0; i < convertdata.length; i++) {
					int usedata = Integer.parseInt(convertdata[i]);
					finaldata[i] = usedata;
				}
				mergeSort(finaldata, finaldata.length, finaldata.length/2, finaldata.length/2);
			}
			if (data == "String") {
				System.out.println("How is it stored?");
				String storage = input.nextLine();
				System.out.println("Input data");
				String storedata = input.nextLine();
				String[] convertdata = storedata.split(",");
				mergeSortString(convertdata);
			}
		}
		
		
	}
	 static void bubbleSort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (arr[j] > arr[j+1]) 
	                { 
	                    // swap arr[j+1] and arr[i] 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                }
	        System.out.println(Arrays.toString(arr));
	    }
	 static void bubbleSortString(String arr[]) {
		 for (int t=0; t<arr.length-1; t++)
	        {
	           for (int i = 0; i<arr.length -1; i++)
	           {
	               if(arr[i+1].compareTo(arr[1+1])>0)
	               {
	                   String tempStr = arr[i];
	                   arr[i] = arr[i+1];
	                   arr[i+1] = tempStr;
	                }
	            }

	        }
		 System.out.println(Arrays.toString(arr));
	 }
	 static void selectionSort(int arr[]) 
	    { 
	        int n = arr.length; 
	  
	        // One by one move boundary of unsorted subarray 
	        for (int i = 0; i < n-1; i++) 
	        { 
	            // Find the minimum element in unsorted array 
	            int min_idx = i; 
	            for (int j = i+1; j < n; j++) 
	                if (arr[j] < arr[min_idx]) 
	                    min_idx = j; 
	  
	            // Swap the found minimum element with the first 
	            // element 
	            int temp = arr[min_idx]; 
	            arr[min_idx] = arr[i]; 
	            arr[i] = temp; 
	        }
	        System.out.println(Arrays.toString(arr));
	    }
	 static void selectionSortString (String arr[]) {
		 for ( int j=0; j < arr.length-1; j++ )
		    {
		      int min = j;
		      for ( int k=j+1; k < arr.length; k++ )
		        if ( arr[k].compareTo( arr[min] ) < 0 ) min = k;  

		      // Swap the reference at j with the reference at min 
		      String temp = arr[j];
		      arr[j] = arr[min];
		      arr[min] = temp;
		    }
		 System.out.println(Arrays.toString(arr));
	 }
	 static void insertionSort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=1; i<n; ++i) 
	        { 
	            int key = arr[i]; 
	            int j = i-1; 
	            while (j>=0 && arr[j] > key) 
	            { 
	                arr[j+1] = arr[j]; 
	                j = j-1; 
	            } 
	            arr[j+1] = key; 
	        }
	        System.out.println(Arrays.toString(arr));
	    }
	 static void insertionSortString(String arr[]) {
		  for (int j = 1; j < arr.length; j++) { //the condition has changed
			    String key = arr[j];
			    int i = j - 1;
			    while (i >= 0) {
			      if (key.compareTo(arr[i]) > 0) {//here too
			        break;
			      }
			      arr[i + 1] = arr[i];
			      i--;
			    }
			    arr[i + 1] = key;
			    System.out.println(Arrays.toString(arr));
			  }
	 }
	 static void mergeSort(int arr[], int l, int m, int r) 
	    { 
	        // Find sizes of two subarrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	        /* Create temp arrays */
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 	  
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	        int i = 0, j = 0; 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    }
	 public static void mergeSortString(String[] arr) {
	        if (arr.length >= 2) {
	            String[] left = new String[arr.length / 2];
	            String[] right = new String[arr.length - arr.length / 2];

	            for (int i = 0; i < left.length; i++) {
	                left[i] = arr[i];
	            }

	            for (int i = 0; i < right.length; i++) {
	                right[i] = arr[i + arr.length / 2];
	            }

	            mergeSortString(left);
	            mergeSortString(right);
	            merge(arr, left, right);
	            System.out.println(Arrays.toString(arr));
	        }
	    }
	 public static void merge(String[] names, String[] left, String[] right) {
	        int a = 0;
	        int b = 0;
	        for (int i = 0; i < names.length; i++) {
	            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
	                names[i] = left[a];
	                a++;
	            } else {
	                names[i] = right[b];
	                b++;
	            }
	        }
	    }
	 public static int linSearch(int arr[], int x) 
	 { 
	     int n = arr.length; 
	     for(int i = 0; i < n; i++) 
	     { 
	         if(arr[i] == x) 
	             return i; 
	     } 
	     return -1; 
	 }
	 static int binarySearch(int arr[], int l, int r, int x) 
	    { 
	        if (r >= l) { 
	            int mid = l + (r - l) / 2; 
	            if (arr[mid] == x) 
	                return mid; 

	            if (arr[mid] > x) 
	                return binarySearch(arr, l, mid - 1, x); 
	  
	            // Else the element can only be present 
	            // in right subarray 
	            return binarySearch(arr, mid + 1, r, x); 
	        } 
	  
	        // We reach here when element is not present 
	        // in array 
	        return -1; 
	    } 
} 