package Day02;
//else - if 구조

import java.util.Scanner;
public class Ex11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("성별(1은 남자 2는 여자):");

        int sex = scanner.nextInt();
        if(sex == 1){
            System.out.print("나이 : ");
            int age = scanner.nextInt();
            if(age > 18){
                System.out.print("신체등급 : ");
                int category = scanner.nextInt();


            }else{
                System.out.println("18세 미만은 국방의 의무x");

            }
        }else{
            System.out.println("여성은 국방의 의무 x");
        }




        scanner.close(); 

        
        

    }

}