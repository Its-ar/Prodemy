package com.belajar;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		
//		Soal 1A
		System.out.print("masukkan ukuran pola : ");
		int y = inputUser.nextInt();
		for(int i = 0; i <=y ; i++) {
			for(int j = 0; j<=y; j++) {
			System.out.print("* ");
			}
		System.out.println("\n");
		}
		
//		soal 1B
		System.out.print("masukkan ukuran pola : ");
		int z = inputUser.nextInt();
		for(int a = 0; a < z ; a++) {
			for(int b = 0; b < z; b++) {
				if(a==b || a==z - 1 - b) {
					System.out.print("*");			
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		soal 1C
		System.out.print("masukkan ukuran pola : ");
		int x = inputUser.nextInt();
		for(int c = 0; c < x ; c++) {
			for(int d = 0; d < x; d++) {
			System.out.print(d);
			}
		System.out.println("\n");
		}
//		soal 1D
		
		int f;
		do {
			System.out.print("masukkan ukuran pola (angka ganjil) : ");
			f = inputUser.nextInt();
		}while(f % 2 == 0);
		for (int e = 0; e < f ; e++) {
			for (int g = 0; g < f; g++) {
				if (e == g || e == f -1 - g) {
					int genap = 2 * g + 1;
					System.out.print(genap);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//		soal 1 selesai
		


	}
}
