/*
1. 패키지 3개 이상 사용
2. 임포트 5개 이상 사용
3. 클래스 10개 이상 사용
4. 생성자 10개 이상 사용
5. 각 클래스 별 필드, 메서드 반드시 사용
6. this 키워드, this() 사용
7. public, protected, default, private 사용
8. 정적 필드, 정적 메서드, 정적 초기화 블록 사용
*/


package pack02;

import javastudy.A;

public class D extends A {
	void def() {
		System.out.println(this.b);
	}
}
