package Day06;
//구조체 연습



import java.util.Scanner;

import Util.MyScanner;

public class Ex04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //구조체 배열을 만들어 보자
        //데이터타입[] 배열이름 = new 데이터 타입[크기]
        //학생 구조체의 데이터 타입의 이름은 student
        student[] students =new student[3];

        //하지만 우리가 저 배열에 작접 일일이 값을 넣어주려고 하면 new student를 계속 실행해주어야한다.
        for(int i = 0; i < students.length; i++){
            //연결할 주소를 가진 Student를 하나 만들어준다,
            System.out.println("--------"+ i + 1 + "번 학생--------");
            student s  = new student();
            System.out.print("name : ");
            String name = scanner.nextLine();
            System.out.print("kor : ");
            int kor = MyScanner.nextInt(scanner);
            System.out.print("eng : ");
            int eng = MyScanner.nextInt(scanner);
            System.out.print("math : ");
            int math = MyScanner.nextInt(scanner);


            s.name = name;
            s.eng = eng;
            s.kor = kor;
            s.math = math;
            students[i] =s;
        }
        for(student s : students){
            
            System.out.printf("%s :   %03d\n %03d\n %03d\n ",
            s.name,s.eng,s.kor,s.math);
        }

        scanner.close();
        
    }
}