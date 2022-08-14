package a220814;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Message> messages = new LinkedList<Message>();
		
		messages.offer(new Message("sendMail", "ȫ�浿"));
		messages.offer(new Message("sendSMS", "�ֱ浿"));
		messages.offer(new Message("sendKakaotalk", "��浿"));
		
		while(!messages.isEmpty()) {
			Message message = messages.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			}
		}
	}
}
