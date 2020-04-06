package BoardProject;



import Util.MyScanner;


import java.util.Scanner;
import Util.MyArray;



public class test {
    private static Member[] memberArr;
    Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {



        
    }






    
    public static Member logInPrint(Scanner scanner, Member[] arr){
        Member logIn = new Member();
        System.out.print("ID를 입력해주세요 : ");
        logIn.userName = scanner.nextLine();
        System.out.print("pw : ");
        logIn.password = scanner.nextLine();
        logIn = MemberUtil.logIn(memberArr, logIn);
        
        while(logIn==null){// 찾지 못한 경우
            System.out.println("wrong!");
            logIn = new Member();
            System.out.print("ID를 입력해주세요 : ");
            logIn.userName = scanner.nextLine();
            System.out.print("pw : ");
            logIn.password = scanner.nextLine();
            logIn = MemberUtil.logIn(memberArr, logIn);
        }
        return logIn;



    }





    public static Member logIn(Member[] memberArr, Member logInTry) {
       
        Member m = null;
    
        int index = MyArray.indexOf(memberArr, logInTry.userName);
        if(index != -1){
            if(logInTry.password.equals(memberArr[index].password)){
                m = memberArr[index];
            }
        }
        return m; 
        }



}