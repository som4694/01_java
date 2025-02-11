package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		/*
		 *  자바 기본 자료형 8가지
		 *  
		 *  논리형 : boolean (1byte)
		 *  정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 *  실수형 : float(4byte), double(8byte)
		 *  문자형 : char(2byte), 유니코드 문자체계를 따름)
		 *  
		 *  참조형 - 문자열 String 
		 */
		 
		// 변수 선언 : 메모리(RAM)에 값을 저장할 공간을 할당하는 것
		// 변수 값 대입 : 변수에 값을 집어 넣는 것
		
		
		boolean booleanData; // -> 변수의 선언
		// 메모리에 논리값(t/f)을 저장할 공간을 1byte 할당하고
		// 할당된 공간의 이름을 booleanData 라고 정하겠다
		
		booleanData = true; // booleanData 변수에 true 논리값 집어넣기(대입) 
		
		System.out.println("booleanData : " + booleanData);
	
		
		
		byte byteNumber = 127; // 값의범위: -128 ~ 127 까지 적용
		// 메모리에 정수값을 저장할 공간을 1byte 할당하고 
		// 할당된 공간을 byteNumber 라고 부르겠다
		// 선언된 byteNumber 변수에 처음으로(초기값) 127을 넣음
		// --> 초기화 : 처음 변수에 값을 대입하는 것을 표현함
		
		short shortNumber = 32767;
		
		// 정수 자료형 기본형 ! int (short, byte 는 옛날코드 잔재)
		int intNumber = 2147483647;
  // 자료형    변수형   대입연산자 리터럴;
		// 프로그래밍에서 대입되는 데이터(값 자체)를 리터럴 이라는 단어로 표현
		
		// ** 리터럴 : 변수에 대입되거나 작성되어지는 값 자체
		// 자료형에 따라 리터럴 표기법이 다름
		
		long longNumber = 10000000000l; // l을 기입해야 long타입으로 대입되어 인식 됨
		// -> 100억 이라는 값을 int의 범위를 벗어났다
		// -> 리터럴값 자체를 int로 인식하고 있다
		// -> 뒤에 l을 붙여줌으로꺼 long 자료형인것을 나타내줌
		
		float floatNumber = 1.2345f; // f를 기입해야 float타입으로 대입되어 인식 됨
		// 1.2345까지만 쓰면 double자료형으로 인식하기 때문에
		// 변수 타입인 float과 일치하지 않아 Type mismatch라는 에러가 발생함
		
		double doubleNumber = 3.141592d;
		// double이 실수형 중에서 기본형
		// 리터럴 표기법 없는 실수는 double로 인식
		// D / d 를 쓸수는 있음
		
		//문자형(char) 리터럴 표기법 : ''(홑따옴표)
		// -> 문자형은 문자 딱 하나만 나타냄
		char ch = 'A';
		char ch2 = 66; 
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		/*
		 *  char 자료형에 숫자가 대입될 수 있는 이유
		 *  - 컴퓨터에는 문자표가 존재하고 있음
		 *    숫자에 따가 지정된 문자 모양이 각각 매핑되고
		 *    'B' 문자 그대로 대입되면 변수에 숫가 66으로 변환되어 저장
		 *    -> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는 것도 가능함
		 */
	
		// 변수 명명 규칙
		
		// 1. 대소문자 구분, 길이제한 X
		int abcdefg123456789; // G 다름 (대.소문자로 구분했음)
		int abcdefG123456789; 
		
		// 2. 예약어 X
		// double final; -> 안됨

		// 3. 숫자 시작 X
		// char 1abc; 불가능
		char abc1; //가능
		
		
		// 4. 특수문자 $, _만 사용 가능 (사용 가능하지만 쓰지 않음)
		int $intNumber;  // 문제없음
		int $int_Number; // 자바는 카멜표기법을 사용하기 때문에 주로 _언더바를 사용함
						 // _작성 표기법은 DB에서 사용
						 // 자바의 상수에서 사용
						 // MEMBER_NAME
		
		// 5. (자바는)카멜표기법 을 따름(맨 처음 소문자 시작, 후속 단어 첫글자 대문자)
		char helloWorldAppleBananTomato;
		
		// 6. 변수명을 언어를 가리지 않는다 (하지만 한글은 사용하지 않음)
		int 정수1번;
		double 실수2번 = 3.14;
		System.out.println(실수2번);

		// -----
		
		final double PI_VALUE = 3.14;
		
		// PI_VALUE = 2.33; // 에러남. 재대입 불가능함
		
		/* 
		 * 상수 (항상 같은 수)
		 * -변수 한 종류
		 * -한번 값이 대입되면 다른 값을 재대입 할 수 없음
		 * -자료형 앞에 final 키워드를 작성
		 * -상수 명명 규칙 : 모두 대문자, 여러단어 작성시 _ (언더바)사용하기
		 * 
		 * -상수를 사용하는 경우
		 * 1) 변하면 안되는 고정된 값을 저장할 때
		 * 2) 특정한 값의 의미를 부여하는 경우
		 * 
		 */
		
		final int MIN_AGE = 1;
		final int MAX_AGE = 130;
		final int LEET_MOVE = -1;
		final int RIGHT_MOVE = 1; 
		
		 
		
		
		
		
	}

}
