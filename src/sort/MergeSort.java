package sort;

public class MergeSort {
	void merge(int arr[], int L[], int R[], int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < left) {
            arr[k++] = L[i++];
        }
        while (j < right) {
            arr[k++] = R[j++];
        }
    }
	void mergeSort(int arr[], int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] L = new int[mid];
        int[] R = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            L[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            R[i - mid] = arr[i];
        }
        mergeSort(L, mid);
        mergeSort(R, n - mid);

        merge(arr, L, R, mid, n - mid);
    }
	void add1{
		
	}


	public static void main(String[] args) {
		 int arr[] = { 12, 11, 13, 5, 6, 7 };
	        MergeSort ms = new MergeSort();
	        ms.mergeSort(arr, arr.length);

	        System.out.println("Sorted array:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
		// TODO Auto-generated method stub

	}


