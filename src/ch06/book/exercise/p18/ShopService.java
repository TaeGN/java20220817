package ch06.book.exercise.p18;

public class ShopService {
	private static ShopService aa = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return aa;
	}
}
