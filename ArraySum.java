
public class ArraySum {

	public int sumOfArray(Integer[] myArray, int index) {
		return sumOfArrayHelper(myArray, index);
	}
	
	public int sumOfArrayHelper(Integer[] myArray, int index) {
		int sum = 0;
		if (index > 0) 
			sum = sumOfArrayHelper(myArray, index - 1);
	
		return sum + myArray[index];
	}
	
	
	
	public int fibonacci(int n) {
		int fib[] = new int[n + 1];
		fib[1] = 1;
		fib[2] = 1;
		fib[3] = 2;
		if (n == 0)
			return 0;
		if (fib[n] != 0)
			return fib[n];
		
		if (fib[n - 1] != 0) {
			fib[n] = fib[n-2] + fib[n - 1];
			return fib[n];
			
		} else {
			fib[n - 1] = fibonacci(n - 1);
			fib[n] = fib[n - 2] + fib[n - 1];
			return fib[n];
		}
		
	}
}
