package a220712;

public class Television implements RemoteControl, Searchable{
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다");
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
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
	public static void main(String[] args) {
		RemoteControl control = new Television();
		control.setVolume(11);
		control.setVolume(6);
		control.setVolume(-3);
	}
}
