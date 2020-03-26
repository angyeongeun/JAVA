package Day02;
//데이터를 읽어오는 행위자체가 입력


public class Ex02 {

    private static final int NUMBER_OF_SUBJECT = 6;
    public static void main(String[] args){
        // 출력 방법
        //1. print -> 괄호안의 내용을 출력한다
        //2. printf = print in format -> 괄호안의 내용을 형식에 맞춰 출력
        //3. println = print a line -> 괄호안의 내용을 한줄에 출력한다.

        System.out.print("abc\t");
        // print()는 커서를 옮기지 않는다.
        System.out.print("abc\n");

        System.out.printf("abc\n");
        //printf의 경우에는 우리의 메시지를 우리가 원하는 형식으로 출력하게 해줌.

        int num = 41;
        System.out.printf("1-A. %d\n", num);
        System.out.printf("1-A. %06d\n", num);

        System.out.println("abc");
        System.out.println("hoy!");

        //뒤에 0이 붙는건 안되기 때문에 %-는 용납되지 않음


        // 16진법으로 표현하기. he'x'
        System.out.printf("2-D. %08X\n", num);
        // 16진법 숫자를 그대로 표현

        //3.논리형('b'oolean)
        // -A. 소문자로 true/false
       // System.out.printf("3-A. %B\n", null);

        String st = "fuck";
        // 4. 문자열('S'tring)
        //System.out.printf("4-A. %S\n", str);


        int d = 800;
        //5. 실수형('F'loat)
        System.out.printf("%f\n", d);

        String name =  "ak";
        int age = 19;
        int math = 100;

        System.out.printf("이름: %s, 나이: %03d세, 수학:%03d점", name, age, math);

        




        



    }

}