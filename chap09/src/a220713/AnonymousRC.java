package a220713;

public class AnonymousRC {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV¸¦ ÄÕ´Ï´Ù");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV¸¦ ²ü´Ï´Ù");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("audio¸¦ ÄÕ´Ï´Ù");
			}
			
			@Override
			public void turnOff() {
				System.out.println("audio¸¦ ²ü´Ï´Ù");
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
