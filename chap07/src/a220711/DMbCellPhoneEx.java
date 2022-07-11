package a220711;

public class DMbCellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone cellPhone = new DmbCellPhone("갤럭시", "검정", 22);
		
		System.out.println("모델: " + cellPhone.model);
		System.out.println("색상: " + cellPhone.color);
		
		System.out.println("채널: " + cellPhone.channel);
		
		cellPhone.powerOn();
		cellPhone.powerOff();
		cellPhone.sendVoid("여보세욥");
		cellPhone.receiveVoid("안녕하세요 저는 홍길동입니다");
		cellPhone.sendVoid("예 반갑습니다~");
		cellPhone.hangUp();
		
		cellPhone.turnOnDmb();
		cellPhone.changeChannelDmb(86);
		cellPhone.turnOffDmb();
	}
}
