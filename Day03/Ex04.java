package Day03;
//반복문
//for, while, forEach
//for -> 명확하게 몇번 반복해라
//while -> 조건식이 true인 동안 반복하라
//forEach -> 배열이나 arraylist?같은 똑같은 자료형 모여있는 애들 출력

import java.util.Scanner;

public class Ex04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //for 문
        for(int i =0; i < 5 ; i++){
            System.out.println(i);

        }

        int standard = 10;
        int startingNumber = 6;
        for(int position = startingNumber;
                position <= standard;
                position++
        ){
            System.out.print("standard" + standard);
            System.out.print("startNumber" + startingNumber);
            System.out.println("position" + position);
            
        }


        
        
        


        
    }
}