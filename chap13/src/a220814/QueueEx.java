package a220814;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Message> messages = new LinkedList<Message>();
		
		messages.offer(new Message("sendMail", "»´±Êµø"));
		messages.offer(new Message("sendSMS", "¡÷±Êµø"));
		messages.offer(new Message("sendKakaotalk", "∫Û±Êµø"));
		
		while(!messages.isEmpty()) {
			Message message = messages.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "¥‘ø°∞‘ ∏ﬁ¿œ¿ª ∫∏≥¿¥œ¥Ÿ.");
				break;
			case "sendSMS":
				System.out.println(message.to + "¥‘ø°∞‘ ∏ﬁ¿œ¿ª ∫∏≥¿¥œ¥Ÿ.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "¥‘ø°∞‘ ∏ﬁ¿œ¿ª ∫∏≥¿¥œ¥Ÿ.");
				break;
			}
		}
	}
}
