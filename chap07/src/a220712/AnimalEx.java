package a220712;

public class AnimalEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("------");
		
		//������ �ڵ� Ÿ�Ժ�ȯ
		Animal animal = null;
		//�ڵ� Ÿ�� ��ȯ �� �����ǵ� �޼ҵ� ȣ��
		animal = new Dog();
		animal.sound();
		//�ڵ� Ÿ�� ��ȯ �� �����ǵ� �޼ҵ� ȣ��
		animal = new Cat();
		animal.sound();
		System.out.println("------");

		//�޼ҵ� ������
					//�ڵ� Ÿ�Ժ�ȯ
		animalSound(new Dog());
					//�ڵ� Ÿ�Ժ�ȯ
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		//�����ǵ� �޼ҵ� ȣ��
		animal.sound();
	}
}
