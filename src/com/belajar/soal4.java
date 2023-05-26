package com.belajar;
import java.util.Scanner;
public class soal4 {

	public static void main(String[] args) {
//		soal 4
		Scanner inputUser = new Scanner(System.in);

		int fib, fib1, fib2, n;
		System.out.print("Mengambil nilai fibonacci ke - : ");
		n = 9;
		fib2 = 0;
		fib1 = 1;
		fib = 1;

		for (int i = 1; i <= n; i++) {
		    if (i <= 5) {
		    	fib = fib1 + fib2;
		    	fib2 = fib1;
		    	fib1 = fib;
		        for (int j = 1; j <= n; j++) {
		            if (j == i || j == ( n - i + 1)) {
		            	System.out.print(fib + " ");
		            } else {
		                System.out.print("  ");
		            }
		        }
		        System.out.println();
		    } else if(i >= 5 ) {
		    	fib = fib1 + fib2;
		    	fib1 = fib2;
		    	fib2 =  fib;
		        for (int j = 1; j <= n; j++) {
		            if (i == j || j == (n - i + 1)) {
		            	System.out.print(fib + " "); // Menggunakan f_n_1 sebagai pengganti f_n_2
		            } else {
		                System.out.print("  ");
		            }
		        }
		        System.out.println();

		    }
		}


	}

}
