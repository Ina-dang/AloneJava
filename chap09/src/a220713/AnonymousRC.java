package a220713;

public class AnonymousRC {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("audio�� �մϴ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("audio�� ���ϴ�");
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
