package ch11.book.s110303;

import java.sql.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date(210);
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
