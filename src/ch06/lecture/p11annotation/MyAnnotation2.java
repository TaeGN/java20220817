package ch06.lecture.p11annotation;

import ch05.book.s050701.Week;

public @interface MyAnnotation2 {
	String value() default ""; // element(attribute)
	int age() default 0;
	Week week() default Week.MONDAY;
	
	String[] names() default {};
}
