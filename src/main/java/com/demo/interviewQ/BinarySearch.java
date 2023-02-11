package com.demo.interviewQ;

// array= [10,20,30,40,50,60]
//key =40

public class BinarySearch {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60 };
		int last = a.length - 1;
		int key = 30;

		binarySearch(a, 0, last, key);

	}

	public static void binarySearch(int a[], int first, int last, int key) {
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;
			if (a[mid] < key) {
				first = mid + 1;

			} else if (a[mid] > key) {

				last = mid - 1;

			} else {
				System.out.println("Element found at the location :" + " " + (mid+1));
				break;
			}
		}
		if (first > last) {
			System.out.println("Element not found in the array");
		}
	}
}
