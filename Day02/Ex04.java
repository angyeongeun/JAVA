package Day02;
//printf를 사용해서 점수들은 출력해보자



import java.util.Scanner;
public class Ex04 {


    private static final int NUMBER_OF_SUBJECT = 3;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("이름:");
        String name = scanner.nextLine();

        System.out.print("나이:");
        int age = scanner.nextInt();

        System.out.print("수학:");
        int math = scanner.nextInt();


        System.out.printf("이름: %s, 나이: %02d세, 수학:%03d점", name, age, math);





    }

}