package Day03;
//숫자 맞추기 게임
//자바에 랜덤한 숫자를 만들어 주는 java.util.Random class 이용

import java.util.Scanner;
import java.util.Random;


public class Ex17{

    private static final int MAX = 100;
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int korean = -1;
        int math = -1;
        int english = -1;
        String name = "";


        while(true){
            System.out.println("1.입력 2. 출력 3.종료");
            int choice = scanner.nextInt();
            if(choice ==1) {
                System.out.print("name: ");
                scanner.nextLine();
                name = scanner.nextLine();

            }else if (choice == 2){
                if(korean == -1){
                    System.out.println("no info");
                }else{
                    int total = korean +english + math;
                    double average = total /3.0;
                    System.out.printf("name : %s, korean: %03d, english: %03d, total: %03d, average: %.3f", name,korean,english,math,total,average);


                }
            }else if(choice ==3){
                break;
            }

        }



        scanner.close();

    


        }




    }
