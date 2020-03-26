package Day02;
//else - if 구조

import java.util.Scanner;
public class Ex10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("점수:");
        int score = scanner.nextInt();
        
        String temp = score + ""; //-> 리소스를 많이 먹음
        
        temp = Integer.toString(score); // -> 포장 클래스 사용

        StringBuilder builder = new StringBuilder();
        builder.append(score);
        temp = builder.toString();
        System.out.println(temp);

        System.out.println(temp.length());

        //string에 몇번쨰 에 무슨 들자가 있는지 보고싶을때,

        System.out.println(temp.length() -1);






        //System.out.println(temp);


        scanner.close(); 

        
        

    }

}