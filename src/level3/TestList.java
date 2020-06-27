package level3;

import java.util.Arrays;

public class TestList {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(2, 100);
		
		list.remove();
	}
}

class MyList {
	private int[] arr;

	MyList() {
		init();
	}

	private void init() {
		arr = new int[0];
	}

	void add(int num) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		temp[arr.length] = num;
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}

	int size() {
		return arr.length;
	}

	int get(int idx) {
		return arr[idx];
	}

	void add(int idx, int num) {
		int[] temp = new int[arr.length+1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[(i < idx) ? i : i-1];
		}
		temp[idx] = num;
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
	int remove(int idx) {
		
		int[] temp = new int[arr.length-1];
		for(int i=0; i<arr.length; i++) {
		temp[i]=arr[i <idx ? i : i+1];
			
		}
		int delVal = arr[idx];
		arr= temp;
		return delVal;
	}
	
	int remove() {
		return remove(arr.length - 1);
	}
	
}