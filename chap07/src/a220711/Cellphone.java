package a220711;

public class Cellphone {
	String model;
	String color;
	
	void powerOn() {System.out.println("������ �մϴ�");}
	void powerOff() {System.out.println("������ ���ϴ�");}
	void bell() {System.out.println("���� �︳�ϴ�");}
	void sendVoid(String message) {System.out.println("Me: " + message);}
	void receiveVoid(String message) {System.out.println("Friend: " + message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�");}
}
