package Day01;

public class Ex05{

    //비교연산자


    public static void main(String[] args) {
        double d1 = 3.14;
        double d2 = 4.2;
        System.out.println(d1 > d2);

    //객체의 비교는 비교연산자를 사용하면 안된다.

    //클래스의 변수 즉 객체선언은 다음과 같다.
    //클래스 객체이름 = new클래스();
    

    String str1 = new String("dss");
    String str2 = "dss";

    System.out.println(str1.equals(str2));


    }
}


// 참조형 데이터 타입
// 참조형은 크게 3가지 -> 클래스, 언터페이스, 배열
// 메모리 구조의 문제

//비교연산자는 절대 힙메모리 내부로 가서 그 안에 값은 확인해서 비교하지 않음
// 오직 stack 영역 메모리의 선언된 값만 비교를 하게된다.

// 따라서 객체의 값비교를 할때는 비교연산자가 아닌 객체의 메소드를 실행시켜 비교해야함 ✔

///객체의 메소드를 실행할때는 이름.으로 접근한다.

