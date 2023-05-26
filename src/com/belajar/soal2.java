package com.belajar;
import java.util.*;
public class soal2 {

	public static void main(String[] args) {
//		soal (2) 1
		Scanner inputUser = new Scanner(System.in);
		int f_n,f_n_1,f_n_2,n;
		System.out.print(" mengambil nilai fibonacci ke - : ");
		n = inputUser.nextInt();
		f_n_2 = 0;
		f_n_1 = 1;
		f_n = 1;
		for(int i = 1; i <= n; i++) {
			System.out.print(f_n+" ");
			f_n= f_n_1 + f_n_2;
			f_n_2 = f_n_1;
			f_n_1 = f_n;
		}
		
//		soal 2 a
		System.out.print("\n Masukkan nilai: ");
        int x = inputUser.nextInt();
        
        for (int c = 1; c <= x; c++) {
            System.out.print(c + " ");
        }
        for (int c = x - 1; c >= 1; c--) {
            System.out.print(c + " ");
        }
//		soal 2b 
		int f0,f1,f2,y;
		System.out.println(" mengambil nilai fibonacci : ");
		y = inputUser.nextInt();
		f2 = 0;
		f1 = 1;
		f0 = 1;
		for(int i = 1; i <= y; i++) {
			if(i <= 5) {
			System.out.print(f0+" ");
				f0= f1 + f2;
				f2 = f1;
				f1 = f0;
			}else {
				f0 = f1 - f2;
		        f1 = f2;
		        f2 = f0;
		        System.out.print(f0 + " ");
			}
		}
		
//		soal (2) 3
		int fib, fib1, fib2, w;
		System.out.print("Mengambil nilai fibonacci ke - : ");
		w = inputUser.nextInt();
		fib2 = 0;
		fib1 = 1;
		fib = 1;

		for (int i = 1; i <= w; i++) {
		    if (i <= 5) {
		        for (int j = 1; j <= w; j++) {
		            if (j == i || j == (w - i + 1)) {
		                System.out.print(fib + " ");
		            } else {
		                System.out.print("  ");
		            }
		        }
		        System.out.println();
		        fib = fib1 + fib2;
		        fib2 = fib1;
		        fib1 = fib;
		    } else if(i > 5 ) {
		    	fib = fib1 - fib2;
		    	fib1 = fib2;
		    	fib2 =  fib;
		        for (int j = 1; j <= w; j++) {
		            if (i == j || j == (w - i + 1)) {
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
