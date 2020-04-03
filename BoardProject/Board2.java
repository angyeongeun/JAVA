package BoardProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import Util.MyScanner;


public class Board2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board[] boardArr = new Board[5];
        for(int i =0; i< boardArr.length; i++){
            boardArr[i] = new Board();
        }


        while(true){
            System.out.println("---------Board----------");
            System.out.println("1. 글 목록 2. 새로 작성 3. 종료");
            System.out.print(">");
            int userChoice = MyScanner.nextInt(scanner);

    
            if(userChoice ==1){
                BoardUtil.list(boardArr);
                System.out.print("1. 글 개별보기 2. 뒤로가기");
                System.out.print(">");

                userChoice = MyScanner.nextInt(scanner);
                if(userChoice == 1){
                    BoardUtil.showOne(boardArr,scanner);

                }else if(userChoice ==2){
                    BoardUtil.write(boardArr,scanner);

                }else if(userChoice ==3){
                    System.out.println("thank you");
                    break;
                }
            }
        }
    }
}



