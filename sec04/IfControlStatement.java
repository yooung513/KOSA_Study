package sec04;

public class IfControlStatement {
	public static void main(String[] args) {
		
		// 유형 1. if
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("실행 1");
		}
		if (value1 < 5) {
			System.out.println("실행 2");
		}
		
		boolean bool1 = true;
		boolean bool2 = false;
		if (bool1) {
			System.out.println("실행 3");
		}
		if (bool2) {
			System.out.println("실행 4");
		}
		
		
		// 유형 2. if-else
		int value2 = 5;
		if (value2 > 3) {
			System.out.println("실행 5");
		} else {
			System.out.println("실행 6");
		}
		
		// cf. 삼항 연산자와 변환 가능
		System.out.println( (value2 > 3) ? "실행 5" : "실행 6" );
		System.out.println();
		
		
		// 유형 3. if - else if - else
		int value3 = 85;
		if (value3 >= 90) {
			System.out.println("A학점");
		} else if (value3 >= 80) {
			System.out.println("B학점");
		} else if (value3 >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
		
		
		if (value3 >= 70) {
			System.out.println("C학점");	// 실행한 후 탈
		} else if (value3 >= 80) {
			System.out.println("B학점");
		} else if (value3 >= 90) {
			System.out.println("A학점");
		} else {
			System.out.println("F학점");
		}
		
		
		if (value3 >= 70 && value3 < 80) {
			System.out.println("C학점");
		} else if (value3 >= 80 && value3 < 90) {
			System.out.println("B학점");
		} else if (value3 >= 90) {
			System.out.println("A학점");
		} else {
			System.out.println("F학점");
		}
		
		
	}
}
