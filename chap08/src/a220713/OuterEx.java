package a220713;

public class OuterEx {
	public static void main(String[] args) {
		OuterNested on = new OuterNested();
		OuterNested.Nested n = on.new Nested();
		n.print();
	}
}
