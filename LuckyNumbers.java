import java.util.*;

public class LuckyNumbers {

	public static void main(String[] args) {
		Integer a = new Integer(20);
		Integer b = new Integer(25);
		int count = 0;
		for(int i = a; i <= b; i++) {
			ArrayList<Integer> numbers = ExtractNumbers(i);
			ArrayList<Integer> numberSquared = SquareNumbers(numbers);
			int sumDigits = 0, sumDigitSq = 0;
			sumDigits = ReturnSum(numbers);
			sumDigitSq = ReturnSum(numberSquared);
			if(sumDigits <= 1 || sumDigitSq <= 1) {
				continue;
			}
			else {
				if((CheckPrime(sumDigits) && CheckPrime(sumDigitSq)) == true) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static ArrayList<Integer> ExtractNumbers(int number){
		ArrayList<Integer> array = new ArrayList<>();
		Integer num = -1;
		while(number > 0) {
			num = number % 10;
			if(num < 0) 
				continue;
			else
				array.add(num);
			number = number / 10;
		}
		return array;
	}
	
	public static ArrayList<Integer> SquareNumbers(ArrayList<Integer> arr){
		ArrayList<Integer> squaredNumbers = new ArrayList<>();
		for(int i = 0; i < arr.size(); i++) {
			squaredNumbers.add((int) Math.pow(arr.get(i), 2));
		}
		return squaredNumbers;
	}
	
	public static boolean CheckPrime(int number) {
		for(int i = 2; i <= (int)number/2; ++i)
        {
            if(number % i == 0)
            {
               return false;
            }
        }
		return true;
	}
	
	public static int ReturnSum(ArrayList<Integer> array) {
		int sum = 0;
		for(int i = 0; i < array.size(); i++) {
			sum += array.get(i);
		}
		return sum;
	}
	
	public void PrintNumber(int number) {
		System.out.println(number);
	}
}
