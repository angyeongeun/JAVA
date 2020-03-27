package Day03;
//숫자 맞추기 게임
//자바에 랜덤한 숫자를 만들어 주는 java.util.Random class 이용

import java.util.Scanner;
import java.util.Random;


public class Ex14{

    private static final int MAX = 100;
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        Random random = new Random();
        int highScore = 0;


        while(true){
            System.out.println("숫자 맞추기 게임");
            System.out.println("1. 새로하기 2.최고 점수 보기 3. 종료");
            System.out.println("> ");
            int choice = scanner.nextInt();

            if(choice ==1){

                // random을 이용해서 숫자를 하나 만들어준다
                //나온 값 +1 -> 1~100까지 구할 수 있을까?
                int computerNumber = random.nextInt(MAX)+1 ;
                int score = 1;
                int userNumber = -1;
                while(userNumber != computerNumber){
                    System.out.println("숫자를 입력 : [-1은 종료]");
                    System.out.println("> ");
                    userNumber = scanner.nextInt();

                    if(userNumber > computerNumber){
                        System.out.println("DOWN");
                    }else if(userNumber < computerNumber){
                        System.out.println("UP");
                    }else if(userNumber ==computerNumber){
                        System.out.println("right!!");

                        
                        if(score < highScore || highScore == 0){
                            highScore = score;

                      
                    }else if(userNumber ==-1){
                        break;
                    }
                }

                
            }
            score++;
                 

            }else if(choice == 2){

                if(highScore == 0){
                    System.out.println("There's no play records!!");
                }else{
                    System.out.println("high score : " + highScore);
                }
            

            }else if(choice ==3){
                System.out.println("Thank you for playing!");
                break;
            }else {
                System.out.println("Wrong!");
            }


        }

        scanner.close();

        
    }
}
