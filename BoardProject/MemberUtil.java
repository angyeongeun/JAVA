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
    private static Member[] memberArr;
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






    //20.04.06 로그인 -> 아이디와 비번 체크후 두개다 true 나오면 null인 member변수와 해당배열요소를 연결시켜서 리턴!

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

    //index라는 메소드를 만들어서 게시판에 오신걸 환영합니다.
    //1.로그인 2.회원가입 3. 종료

    public static Member[] index(Scanner scanner, Member[] memberArr, BoardReplyWrapper wrapper, Member member){
        //while을 통해서 choice가 3일 경우 해당 메소드 종료
        //1. -> 로그인 메소드 실행
        //2. -> 회원가입 메소드 실행 

        while(true){
            System.out.println("-------Board--------");
            System.out.println("1. 로그인 2. 회원가입 3. 종료");
            int choice = MyScanner.nextInt(scanner);

            if(choice == 1){
                Member logInUser =logInPrint(scanner, memberArr);
                showMenu(scanner, memberArr, wrapper, member);
                break;

            }else if(choice == 2){
                memberArr =register(scanner, memberArr);

            }else if(choice ==3){
                System.out.println("thank you for using!");
                break;
                
            }

            return memberArr;

        }
    


        
        return memberArr;
    }
    
    private static Member[] register(Scanner scanner, Member[] arr){
        Member m = new Member();
        System.out.print("사용할 ID를 적어주세요 : ");
        m.userName =scanner.nextLine();
        //중복을 피하기 위해 해당 userNamed이 존재하는지부터 체크한다. ->  indexOf 의 결과값이 -1이 아니면 계속 돌아가게 만든다.
        while(MyArray.indexOf(arr, m.userName) != -1){
            System.out.println("이미 존재하는 ID입니다.");
            System.out.print("사용할 id:");
            m.userName =scanner.nextLine();
        }
        System.out.print("사용할 password : ");
        m.password = scanner.nextLine();
        System.out.print("사용할 닉네임 :");
        m.nickname = scanner.nextLine();
        m.id =1;

        if(arr.length != 0){
            m.id = arr[arr.length -1].id +1;

        }
        arr = MyArray.add(arr, m);

        return arr;
    }




    private static void showMenu(Scanner scanner,
    Member[] memberArr,BoardReplyWrapper wrapper,
    Member member){

        while(true){
            System.out.println("------------------Board--------------------");
            System.out.println("1. 글 목록 2. 새로 작성 3. 로그아웃 4. 종료");
            System.out.print(">");
            int userChoice = MyScanner.nextInt(scanner);

    
                if(userChoice ==1){
                BoardUtil.list(wrapper, memberArr);;
                if(wrapper.boardArr.length > 0){
                    System.out.print("1. 글 개별보기 2. 뒤로가기");
                    System.out.println(">");
    
                    userChoice = MyScanner.nextInt(scanner);
                    if(userChoice == 1){
                        BoardUtil.showOne(wrapper, scanner, memberArr, member);

                        }
         
                    }
                }else if(userChoice ==2){
                BoardUtil.write(scanner, memberArr, member, wrapper);

                }else if(userChoice ==3){
                    member =null;
                    while(member == null){
                        System.out.println("1. 회원가입 2. 로그인 3. 종료");
                        userChoice = MyScanner.nextInt(scanner);
                        if(userChoice ==1){
                            //회원 가입 실행
                            memberArr = register(scanner, memberArr);

                        }else if(userChoice ==2){
                            //로그인
                            member = logInPrint(scanner, memberArr);

                        }else if(userChoice ==3){

                            break;

                        }
                        //여기에서 userChoice가 얼마인지 출력해보면 우리가 마지막으로 선택한 값들이 남아있다.
                        //근데 만약  userChoice가 3이라면?
                        if(userChoice ==3){
                            break;
                        }
                    }
                    member = logInPrint(scanner, memberArr);
                }else if(userChoice ==4){
                System.out.println("thank you for using!!!");
                break;
                }
            
        
         }

    
    // if(userChoice ==3){
    //     System.out.println("로그아웃후 종료");
    //     break;

    
}




    
//     if(userChoice == 1){

//         //로그인
//         System.out.println("회원이신가요?(y/n)");
//         String answer = MyScanner.nextLine();
        
//         if(answer == 'y'){

//             System.out.println("ID" + m.userName);
//             m.userName =scanner.nextLine();

//             System.out.println("Password" + m.password);
//             m.password = scanner.nextLine();

//             if(m.userName){
//                 //일치하는지 살펴볼 부분
//             }




            

//         }else{//회원가입 -> 로그인
//             System.out.println("회원만 이용 가능합니다! 회원 가입을 하시 겠습니까?(y/n)");
//             String answer2 = MyScanner.nextLine(scanner);
//             if(answer2 == 'y'){ 
//                 System.out.println(" ID  : ");
//                 m.userName = scanner.nextLine();

//                 System.out.println("Password : ");
//                 m.password = scanner.nextLine();







//             }
//             System.out.println("회원 가입");
            
            
//         }
        


// }
// }




}



    