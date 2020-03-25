package Day01;

//기본형 데이터 타입
//정수형: byte short int long
//실수형: float double
//논리형: boolean
//문자형: char

//자료형 
/// 실수: 적은 자릿수의 실수
//double: 많은 자릿수의 실수

//문자형
//ascii 코드 값에 맞춘 문자1개
//char: 7비트

//논리형 
//참/거짓만 가진 1비트
///coolean: true/false


//메소드 이름짓는규칙 -> 동사, 소문자로 시작
//클래스 이름짓는 규칙 -> 대문자로 시작, 명사


public class Ex02 {
    public static void main(String[] arg) {
        // 기본형은 우리가 설정한 곳에 직접 값이 들어가 있다.
    

    int number;

    number = 10;
    System.out.println(number);
    System.out.println(number+5);

    //자료형을 바꿔주는것을 형변환(typecasting)
    //1. 암시적 형변환( implicit typecasting )
    //암시적 형변환의 경우, 큰 데이터 타입에서 더 작은 데이터타입을 옮겨담을때
    
    long longVar = number;

    //2. 명시적 형변환
    // 더 큰 데이터타입을 더 작은 데이터타입에 옮겨 담을때
    //이 때, 흘러넘쳐도 괜찮다고 말해줘야함
    //명시적 형변환은 바꿀 값 앞에 ()를 넣고 그 안에 바꿀 자료형을 적어준다.
    
    number = (int)longVar;

    //명시적 형변환의 문제점은 overflow(해당 자료형이 표시할 수 있는 갓의 최대값을 넘어서면 발생),
    // underflow(해당 자료형이 표시할 수 있는 값의 최소값 아래로)의 문제 발생
    
    //이문제가 발생하는 이유는 컴퓨터의 자릿수 표현이 맨앞자리가 부호를 결정하기 때문,


    System.out.println("overflow");
    byte myByte = 127;
    System.out.println((byte)(myByte +10));
    System.out.println("underflow");
    System.out.println((byte)(myByte -300));
    //127 - 255 -> -128
    //127 -255 -45 = -128 -45
    // = -128 -1 -44 =127 -44
    // = 83

    



    char myChar = 'A';
    System.out.println((char)(myChar + 32));
    System.out.println((char)(myChar + 0.1));


    }

}


