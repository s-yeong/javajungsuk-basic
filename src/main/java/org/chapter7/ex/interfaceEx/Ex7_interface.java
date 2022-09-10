package org.chapter7.ex.interfaceEx;

/*
    인터페이스
    일종의 추상클래스, 추상클래스보다 추상화 정도가 높아서 추상클래스와 달리
    몸통을 갖춘 일반 메서드 또는 멤버변수를 구성원으로 가질 수 없음
    => 오직 "추상메서드"와 "상수"만을 멤버로 가질 수 있다.
    인터페이스 - 기본 설계도 / 추상 클래스 - 미완성 설계도
    => 다른 클래스를 작성하는데 도움 줄 목적으로 작성됨

    - 접근제어자로 public 또는 default만 사용
    interface 인터페이스 이름 {
        public static final 타입 상수이름 = 값;
        public abstract 메서드이름(매개변수목록);
    }
    
    제약사항
    - 모든 멤버변수는 public static final 이어야 하며, 생략할 수있다.
    - 모든 메서드는 public abstract 이어야 하며, 생략할 수 있다.(static, default 메서드는 예외)
    => 편의상 생략하는 경우가 많음, 생략된 제어자는 컴파일 시 컴파일러가 자동적으로 추가해줌

    - 인터에스로부터만 상속받을 수 있으며 클래스와 달리 다중상속(여러개의 인터페이스로부터 상속)이 가능하다!
    - 자신에 정의된 추상메서드의 몸통을 만들어주는 클래스를 작성해야 한다.(일부 구현시 추상 클래스로 선언해야함)
    - 상속과 구현을 동시에 할 수 있다.

   - 인터페이스는 구현한 클래스의 "조상"이라고 볼 수 있기에,
   - 해당 인터페이스 타입의 참조변수로 이를 구현한 클래스의 인스턴스를 참조할 수 있으며,
   - 인터페이스 타입으로의 형변환도 가능하다.

   장점
   1. 개발시간 단축
   2. 표준화 가능
   3. 서로 관계없는 클래스들 관계 맺어줄 수 있음
   4. 독립적인 프로그래밍 가능
   선언과 구현 분리, 클래스와 클래스간의 직접적인 관계를 인터페이스를 이용해서 간접적인 관계로 변경하면
   한 클래스의 변경이 관련된 다른 클래스에 영향을 미치지 않는 독립적인 프로그래밍 가능

 */

public class Ex7_interface {
    
    Fightable f = new Fighter(); // (Fightable) new Fighter();
    // 인터페이스 Fightable을 클래스 Fighter가 구현했을 때,
    // Fighter 인스턴스는 Fightable 타입의 참조변수로 참조하는 것이 가능하다.

    // 메서드의 매개변수의 타입으로 사용할 수도 있다
    void attack(Fightable f) {
    }
    // 인터페이스 타입의 매개변수가 갖는 의미
    // "메서드 호출 시 해당 인터페이스를 구현한 클래스의 인스턴스를 매개변수로 제공해야 한다는 것"
}