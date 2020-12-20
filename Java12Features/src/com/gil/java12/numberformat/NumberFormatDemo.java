package com.gil.java12.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCompactNumberInstance();
		
		//1k
		System.out.println(format.format(1000));
		//1k
		format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		System.out.println(format.format(1000));
		System.out.println(format.format(1000000));
		//1 thousand
		format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		System.out.println(format.format(1000));
		System.out.println(format.format(1000000));
	}
}
