package com.tugas2;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		String abjad = "abc";
		int n = 5;
		String kiri = leftPadding(abjad,n);
		System.out.println("hasil String : '" + kiri+ "'" ); //menambahkan petik biar kelihatan spasinya
		String kanan = rightPadding(abjad,n);
		System.out.println("hasil String : '" + kanan+ "'" );
	}
	private static String rightPadding(String coba, int n) {
		if (coba.length()>= n) {
			return coba;
		}else {
			int spasi = n - coba.length();
			StringBuilder coba2 = new StringBuilder(coba);
			for (int i=0;i < spasi; i ++) {
				coba2.append(" ");
			}
			return coba2.toString();
		}
	}
	private static String leftPadding(String coba, int n) {
		if (coba.length()>= n) {
			return coba;
		}else {
			int spasi = n - coba.length();
			StringBuilder coba2 = new StringBuilder();
			for (int i=0;i < spasi; i ++) {
				coba2.append(" ");
			}
			coba2.append(coba);
			return coba2.toString();
		}
	}
}
