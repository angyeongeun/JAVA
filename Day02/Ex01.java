package Day02;
// 비트연산자 
// &: 두 비트의 같은 자릿수가 1이면 1 그외에는 0
// | 하나라도 1이면 1 둘다 0일때만 0 ...



public class Ex01{
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 21;

        //자바에서 이진법 변환은 Integer.toBinaryString()을 사용해서 출력.

        System.out.println(Integer.toBinaryString(number1));
        System.out.println(Integer.toBinaryString(number2));

        //1. AND연산
        System.out.println(number1 & number2);

        //2. Or 연산
        System.out.println(number1 | number2);

        //3. XOR 연산
        System.out.println(number1 ^ number2);

        //4. ~ 연산
        System.out.println( ~number1 );

        //5. << 연산
        System.out.println( number1 << 2 );

        //6. >> 연산
        System.out.println( number1 >> 2 );

        //7. >>> 연산
        System.out.println( -120 >>> 2 );





    }

}