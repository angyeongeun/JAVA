package Day03;
// while statement


import java.util.Scanner;
public class Ex10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        System.out.print("password : ");
        String password = scanner.nextLine();

        System.out.print("Write down your password again!");
        String triedPassword = scanner.nextLine();

        while(!password.equals(triedPassword)){
            System.out.println("wrong password!");
            System.out.println("Try again!");
            password =scanner.nextLine();

        }
        System.out.println("done!");
        











        int count =0;
        while( count < 4){
            System.out .println(count + "회 반복중");
            count++;
        }

        System.out.println("fin");

        //while의 가장 큰 조건은 우리가 숫자와 상관없이 실행 가능
    

    
        


    scanner.close();
    }
}