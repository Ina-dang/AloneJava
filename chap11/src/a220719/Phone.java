package a220719;

public class Phone {
	private String company;
	private String os;
	public Phone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {
		return "Phone [company=" + company + ", os=" + os + "]";
	}
}
