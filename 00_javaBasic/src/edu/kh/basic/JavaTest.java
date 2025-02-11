package edu.kh.basic;

//

// 한 줄 주석 : (컴파일러가 해석하지 않는 부분)

// hello world!

/*
a
b
c
d
*/ 
/*한번에 주석처리 가능한 범위주석*/


// class : 자바 코트가 작성되는 영역
public class JavaTest {

	// main 작성하고 ctrl + space -> 자동완성 가능
	// main 메서드 : 자바 애플리케이션(프로그램)을 실행하기 위해서 반드시 필요한 구문
	public static void main(String[] args) {
	
		
		// 실행 단축키 : ctrl + f11
		// 저장 ctrl+s (저장이 되었으면 별표가 사라짐)
		System.out.println("Hello world!");
		System.out.println("저녁 뭐 먹을까");
		System.out.println("12345");
		
		// syso 작성 후에 ctrl + space -> 	System.out.println(); 를 자동완성해줌
		System.out.println();  //println은 출력창에 작성한 문구를 출력해주는 메서드 
		
		// ctrl + alt + 방향키(위아래) : 방향키 방향으로 해당 줄 복사해줌
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		
		// "" 안에 작성된 코드는 단순 문자열로 인식
		// "" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		System.out.println("1 + 2"); // 1 + 2 작성한 그대로 출력
		System.out.println(1 + 2); // 3 숫자연산이 되었음

		
		System.out.println(50 - 23);
		System.out.println(12 * 13);
		System.out.println(327 / 3);
		System.out.println(12 % 2); // 0 나머지를 뜻함
		
		
		// "" (문자열) + 숫자 함께 작성
		System.out.println("14 * 19 =" + 266);
		System.out.println("14 * 19 =" + 14 * 19);

		// 더하기 연산 값으로 출력을 원할 때는 소괄호 입력을 하면 연산 됨
		System.out.println("90 + 70 + 65 = " + (90 + 70 + 65));
		// 자바는 사칙연산의 우선순위를 그대로 따름
		// -> 우선 계산을 원하면 소괄호() 를 사용
		// + 기호의 역할
		// -> 숫자 + 숫자 = 덧셈 연산 결과
		// -> 문자열 + 숫자 or
		//    문자열 + 문자열 -> 이어쓰기 출력
		System.out.println("A" + "B");
		
		 
	}
}
