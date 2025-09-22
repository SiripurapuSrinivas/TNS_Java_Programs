package tnsjava;

public class PalindromeForNumbers {
	
public static void main(String[] args) {
		
		System.out.println("Palindrome numbers from 1 to 100 are:");
        for (int num = 1; num <= 100; num++) {
            int originalNum = num;
            int reversedNum = 0;

            while (num > 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            if (reversedNum == originalNum) {
                System.out.println(originalNum);
            }

            num = originalNum; // reset num for next iteration
        }
	}

}
