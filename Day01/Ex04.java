package Day01;
// 증감 연산자
// 증감연산자는 변수의 현재값을 1씩 변화시킨다.
// ++의 경우에는 1씩 증가, --의 경우 1씩 감소
// +=, -=랑 다름


public class Ex04{

    public static void main(String[] args){
        int number2 = 7;
        int number1 = 6;
        System.out.println(number2++);
        System.out.println(number2);
        ///++가 앞에 붗으면 전위연산자, 뒤에 붙으면 후위 연산자
        // 후위 연산자의 경우 먼저 number2가 실행되고 number2++가 실행된다. 

        System.out.println(number1 += 1 + number2 );
    }
}