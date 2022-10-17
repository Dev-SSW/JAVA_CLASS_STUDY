import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		for (int i = 0; i < T; i++) {
			int A = Integer.parseInt(br.readLine());
			arr[i] = A;
		}
		quicksort(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	public static void quicksort(int array[], int start , int end) {
		if (start >= end) {
			return;
		}
		int pivot = start;
		int left = start + 1;
		int right = end;
		while (left <= end && array[left] <= array[pivot]) {
			left++;
		}
		while (right >=start && array[right] >= array[pivot]) {
			right--;
		}
		if (left >right) {
			int temp = array[right];
			array[right] = array[pivot];
			array[pivot] = array[right];
		}
		else {
			int temp = array[right];
			array[right] = array[left];
			array[left] = temp;
		}
		quicksort (array,start,right-1);
		quicksort (array,right+1,end);
	}
}
