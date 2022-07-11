package a220711;

public class Cellphone {
	String model;
	String color;
	
	void powerOn() {System.out.println("전원을 켭니다");}
	void powerOff() {System.out.println("전원을 끕니다");}
	void bell() {System.out.println("벨이 울립니다");}
	void sendVoid(String message) {System.out.println("Me: " + message);}
	void receiveVoid(String message) {System.out.println("Friend: " + message);}
	void hangUp() {System.out.println("전화를 끊습니다");}
}
