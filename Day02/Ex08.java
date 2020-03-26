package Day02;

import java.util.Scanner;
public class Ex08{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("국어:");
        int ko = scanner.nextInt();

        System.out.print("영어:");
        int en = scanner.nextInt();

        System.out.print("수학:");
        int math = scanner.nextInt();

        int total = ko + en + math;

        if(ko >= 70 && en >= 70 && math >= 70 || total >= 210 ){
            System.out.print("합!");
        }else{
            System.out.print("불!");
        }
        scanner.close();
    }

}