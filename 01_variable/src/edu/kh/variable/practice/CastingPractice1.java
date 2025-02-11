package edu.kh.variable.practice;

public class CastingPractice1 {

	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
	   
		System.out.println( iNum1 / iNum2 ); // 2  나누기 
	
		System.out.println( (int)dNum ); // 2  강제형변환(뒷자리수를 날림)
		
		System.out.println( iNum2 * dNum ); // 10.0 자동 형변환
		
		System.out.println( (double)iNum1 ); // 10.0 더블형으로 형변환 
		
		System.out.println( iNum1 / (float)iNum2 ); // 2.5 값이 큰 float로 형변환 후 나누기
		
		System.out.println( dNum ); // 2.5 연산 안해도 됨
		
		System.out.println( (int)fNum ); // 3 강제형변환(뒷자리수날림)
		
		System.out.println( iNum1 / (int)fNum ); // 3 fNum을 강제 형변환 후 int3으로 만들고 10나누기3
		
		System.out.println( iNum1 / fNum );// 3.3333333 나누기
		// float은 소수점 아래 8번째 자리까지만 연산 후 반올림 해줌
		// float은 23비트까지만 저장할 수 있어서 근사값이 빨리 끊어지고 반올림 됨
		// 정밀도가 낮아서 마지막 값이 3으로 출력될 수 있음
		
		// float은 비트수가 32비트
		// 저장 방식은 23비트(가수) + 8비트(지수) + 1비트(부호)
		
		System.out.println( iNum1 / (double)fNum ); // 3.3333333333333335
		// double은 소수점 아래 16번째 자리까지 연산 후 반올림 해줌
		// double이 float보다 길이가 2배 더 길기때문에 출력값이 2배로 나올 수 있었음
		// double은 52비트까지 저장할 수 있어서
		// 더 많은 자리수를 정확하게 표현할 수 있음-> 정밀도가 높아서 마지막 값이 5로 출력될 수 있음
		
		// double은 비트수가 64비트
		// 저장 방식은 52비트(가수) + 11비트(지수) + 1비트(부호)
		
		System.out.println("'" + ch + "'"); // 'A' ''홑따옴표 작성해서 문구를 이어줌
		
		System.out.println( (int)ch ); // 65 ch형태 변수를 int로 변환해줌
		
		System.out.println( ch + iNum1 ); // 위 계산에서 출력된 65에서 + iNUM해줌
		
		System.out.println( "'" + (char)(ch + iNum1) + "'" ); // 'K' 연산 된 K에서 홑따옴표 붙여줌
		
		//형변환 연습 하였음
		

	}

}
