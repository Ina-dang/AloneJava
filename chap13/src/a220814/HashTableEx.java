package a220814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
	public static void main(String[] args) throws IOException {
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.println("���̵�");
			String id = br.readLine();
			System.out.println("��й�ȣ");
			String pw = br.readLine();
			System.out.println();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ�");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�");
			}
		}
		br.close();
	}
}
