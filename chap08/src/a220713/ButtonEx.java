package a220713;

public class ButtonEx {
	public static void main(String[] args) {
		Button button = new Button();
		
		button.setOnClickListener(new CallListener());
		button.touch();
		
		button.setOnClickListener(new MessageListener());
		button.touch();
	}
}
