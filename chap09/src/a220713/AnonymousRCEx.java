package a220713;

public class AnonymousRCEx {
	public static void main(String[] args) {
		AnonymousRC anonymous = new AnonymousRC();

		anonymous.field.turnOn();
		
		anonymous.method1();
		
		anonymous.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("����Ʈ Ƽ�� �մϴ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("����Ʈ Ƽ�� ���ϴ�");
			}
		});
	}
}
