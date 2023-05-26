package com.belajar;
import java.util.*;
public class soal3 {

	public static void main(String[] args) {
//		soal 3
		Scanner inputUser = new Scanner(System.in);
		int f0,f1,f2,w,f3;
		System.out.print(" mengambil nilai fibonacci ke - : ");
		w = inputUser.nextInt();
		f0 = 1;
		f1 = 1;
		f2 = 1;
		f3 = -1;
		System.out.print("1 ");
		for(int i = 0; i <= w; i++) {
			System.out.print(f0+" ");
			f0= f1+f2+f3;			
			f3 = f2;
			f2 = f1;
			f1 = f0;
		}		

	}

}
