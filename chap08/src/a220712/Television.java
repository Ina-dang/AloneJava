package a220712;

public class Television implements RemoteControl, Searchable{
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Ƽ�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("Ƽ�� ���ϴ�");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}
	
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
	
	public static void main(String[] args) {
		RemoteControl control = new Television();
		control.setVolume(11);
		control.setVolume(6);
		control.setVolume(-3);
	}
}
