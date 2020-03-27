package Day03;
//숫자 맞추기 게임
//자바에 랜덤한 숫자를 만들어 주는 java.util.Random class 이용

import java.util.Scanner;
import java.util.Random;


public class Ex15{

    private static final int MAX = 100;
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

    


        while(true){
            System.out.println("---성적 관리 프로그램----");
            System.out.println("1. 성적 출력 2. 최고 점수 보기 3. 종료");
            System.out.println("> ");
            int choice = scanner.nextInt();



            if(choice == 1){

                System.out.println("No info!");
                System.out.print("국어 성적 입력 > ");
                int score = scanner.nextInt();
                if(score < 0 || score >100){
                    System.out.println("Wrong score!! Please try again!");

                }else{
                    System.out.println("✔ 국어 성적 : " + score);
                    break;
                }

            }else if(choice == 3){
                System.out.println("fin");
                break;
            }
        }




    }
}


// while(score < 0 || score >100){
//     System.out.println("wrong!");
//     System.out.println("try again :");
//     int score = scanner.nextInt();
// } => 틀리면 계속 다시 입력하도록 요구