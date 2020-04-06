package BoardProject;
// ⭐ 회원 정보와 관련된 데이터 구조체
// - 회원 번호 -> int id
// - 회원 유저 네임 ->ID -> string username
// - 회원 비밀번호 -> string password
// - 회원 닉네임 -> string nickname




import Util.MyScanner;
import java.util.Scanner;
import Util.MyArray;

public class MemberUtil{
    Scanner scanner = new Scanner(System.in);


    public static int Id(Member[] memberArr, int id){
        for(int i = 0; i <memberArr.length; i++){
            if(memberArr[i].id ==id){
                return memberArr[i].id;
            }
        }
        return -1;
    }

    public static String userName(Member[] memberArr, int id) {
        for(int i = 0; i <memberArr.length; i++){
            if(memberArr[i].id ==id){
                return memberArr[i].nickname;
            }
        }
        return null;
    }



    public static String password(Member[] memberArr, int id) {
        for(int i = 0; i <memberArr.length; i++){
            if(memberArr[i].id ==id){
                return memberArr[i].nickname;
            }
        }
        return null;
    }





    public static String showNickName(Member[] memberArr, int id) {
        for(int i = 0; i <memberArr.length; i++){
            if(memberArr[i].id ==id){
                return memberArr[i].nickname;
            }
        }
        return null;
    }

    // public static String ifMember(Member[] memberArr, int id) {
       
    // Member m = new Member();
    // int userChoice = 
    
    // if(userChoice == 1){

    //     //로그인
    //     System.out.println("회원이신가요?(y/n)");
    //     String answer = MyScanner.nextLine();
        
    //     if(answer == 'y'){

    //         System.out.println("ID" + m.userName);
    //         m.userName =scanner.nextLine();

    //         System.out.println("Password" + m.password);
    //         m.password = scanner.nextLine();

    //         if(m.userName){
    //             //일치하는지 살펴볼 부분
    //         }




            

    //     }else{//회원가입 -> 로그인
    //         System.out.println("회원만 이용 가능합니다! 회원 가입을 하시 겠습니까?(y/n)");
    //         String answer2 = MyScanner.nextLine(scanner);
    //         if(answer2 == 'y'){ 
    //             System.out.println(" ID  : ");
    //             m.userName = scanner.nextLine();

    //             System.out.println("Password : ");
    //             m.password = scanner.nextLine();







    //         }
    //         System.out.println("회원 가입");
            
            
    //     }
        


// }
// }




}



    