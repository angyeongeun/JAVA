package Day02;
//키보드 입력받기 like input

import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        //우리가 입력을 할때 3가지정도 방법이 있음 -> scanner객체 이용
        

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요: ");
        int number = scanner.nextInt();
        System.out.print("사용자가 입력한 숫자는 " + number + "입니다");

        System.out.print("숫자를 입력해주세요: ");
        double d = scanner.nextDouble();
        System.out.print("사용자가 입력한 숫자는 " + number + "입니다");

        System.out.print("글자를 입력해주세요: ");
        String s = scanner.nextLine();
        System.out.println("사용자가 입력한 글자는 " + s + "입니다");

        //스캐너는 곧장 데이터를 가져오지 않고 buffer memory 라는 곳에서 차례대로 읽어온다
        //nextInt(), nextDouble() 등의 숫자를 입력받는 메소드 실행시, 버퍼메모리의 움직임에 대해...

        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("사용자가 입력한 글자는 " + name + "입니다");

        
    }
}