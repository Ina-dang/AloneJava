package a220711;

public class DMbCellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone cellPhone = new DmbCellPhone("������", "����", 22);
		
		System.out.println("��: " + cellPhone.model);
		System.out.println("����: " + cellPhone.color);
		
		System.out.println("ä��: " + cellPhone.channel);
		
		cellPhone.powerOn();
		cellPhone.powerOff();
		cellPhone.sendVoid("��������");
		cellPhone.receiveVoid("�ȳ��ϼ��� ���� ȫ�浿�Դϴ�");
		cellPhone.sendVoid("�� �ݰ����ϴ�~");
		cellPhone.hangUp();
		
		cellPhone.turnOnDmb();
		cellPhone.changeChannelDmb(86);
		cellPhone.turnOffDmb();
	}
}
