// Java implementation to find
// Range and coefficient of range

import java.io.*;

class Main {
	// Function to return the minimum element from the array
static float getMin(float arr[], int n)
{
	float res = arr[0];
	for (int i = 1; i < n; i++)
		res = Math.min(res, arr[i]);
	return res;
}

// Function to return the maximum element from the array
static float getMax(float arr[], int n)
{
	float res = arr[0];
	for (int i = 1; i < n; i++)
		res = Math.max(res, arr[i]);
	return res;
}

// Function to print the Range and
// Coefficient of Range in the given array
static void findRangeAndCoefficient(float arr[], int n)
{
	float max = getMax(arr, n);
	float min = getMin(arr, n);
	float range = max - min;
	float coeffOfRange = range / (max + min);
	System.out.println("Range : " + range );
	System.out.println("Coefficient of Range : " + coeffOfRange);
}

	// Driver code
	public static void main (String[] args) {
	
	float arr[] = { 15, 10, 25 };
	int n = arr.length;
	findRangeAndCoefficient(arr, n);
	}
}
