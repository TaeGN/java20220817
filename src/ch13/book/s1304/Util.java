package ch13.book.s1304;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		// TODO Auto-generated method stub
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompareUtil.java;
	}
	

}
