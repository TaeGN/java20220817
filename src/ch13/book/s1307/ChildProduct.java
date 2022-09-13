package ch13.book.s1307;

public class ChildProduct<K, M, C> extends Product<K, M> {
	private C company;
	public C getCompany() {return this.company;}
	public void setCompany(C company) {this.company = company;}
}
