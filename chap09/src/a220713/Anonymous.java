package a220713;

public class Anonymous {
	// 필드 초기값으로 대입, 필드값으로 익명 객체 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다");
		}
		void wake() {		
			System.out.println("5시에 일어납니다.");
			work();
		}
	}; // 익명 자식 객체 생성은 하나의 실행문이므로 끝에 세미콜론을 반드시 붙여야한다. 
	
	void method1() {
		//로컬 변수값으로 대입, 변수값으로 익명 객체 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다");
			}
			
			void wake() {		
				System.out.println("7시에 일어납니다.");
				walk();
			}
		}; 
		// 로컬 변수 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
