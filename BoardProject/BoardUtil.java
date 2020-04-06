package BoardProject;
//board구조체와 관련된 메소드를 모아둠

import java.util.Calendar;
import java.util.Scanner;
import Util.MyScanner;
import java.text.SimpleDateFormat;
import Util.MyArray;
import BoardProject.MemberUtil;

public class BoardUtil{



    //글번호, 제목, 작성자, 작성일을 한줄에 보여주는 list라는 메소드
    public static void list(Board[] boardArr, Member[] memberArr) {

       
        //게시판 최신글은 제일위에 온다.
        //for문의 i는 무엇으로 초기화 해야하는가?
        for(int i = boardArr.length -1 ; i>=0; i--){
            Board b = boardArr[i];
            System.out.println(b.id +
            " " + b.title +
            " " + MemberUtil.showNickName(memberArr, b.writerId ) + 
            " " + b.writtenDate
            );
        }
    }

    public static Board[] write(Board[] boardArr, Scanner scanner, Member[] memberArr) {
        

        Board b = new Board();
        //이 메소드는 boardArr 의 길이가 유동적이기 떄문에 boardArr길이가 0이 아니면 가장 마지막 요소를 찾아서 그 요소의 id번호를 가지고 올 수 있다.
        //글 번호
        b.id = 1;
        if(boardArr.length != 0){
            //배열의 가장 마지막 요소의 index -> length -1
            //그럼 해당 위치에 있는 board의 구조체의 id+1 한 값이 우리의 입력할 id가 된다.
            b.id = boardArr[boardArr.length -1].id +1;
        }

        System.out.print("제목 : ");
        b.title =scanner.nextLine();
        System.out.print("내용 : ");
        b.content =scanner.nextLine();
        b.writerId = 1;

        Calendar c = Calendar.getInstance();

        SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss");
        b.writtenDate =sdf.format(c.getTime());
        //위 주석을 제외한 세줄의 실제코드는 실무에서 많이 쓰임

        boardArr = MyArray.add(boardArr, b); 




      
        return boardArr;
        
    }

    //사용자가 int와 board 배열을 주면 해당 board배열에서 id가 int와 일피하는 board변수를 리턴하는 메소드
    

    public static Board selectOne(Member[] memberArr, int i d){

        for (int i = 0; i < memberArr.length; i++ ){
            if (memberArr[i].id == id ){
                return memberArr[i]


            }
        }
        return null;
    }




    public static Board[] showOne(Board[] boardArr, Scanner scanner, Member[] memberArr){
        System.out.print("개별보기 할 글번호 입력 : ");
        int id = MyScanner.nextInt(scanner);
        Member m = selectOne(memberArr, id);
        Board b = selectOne(boardArr, id);
        if(b == null){
            System.out.println("doesn't exist!");
        }else{

            System.out.println("제목 : " + b.title);
            System.out.println("작성자 : " 
                                + MemberUtil.showNickName(memberArr, b.writerId));
            System.out.println("작성일 : " + b.writtenDate);
            System.out.println("내용 : " + b.content);
     

            if(m.id == b.writerId){

                System.out.println("1. 수정 2. 삭제 3. 뒤로");
                int userChoice =scanner.nextInt();

                if(userChoice ==1){
                    //수정하는 메소드 호출 -> scanner, boardARR, board를 보내서 수정한 것을 해당 위치와 교체한다
                    
                }else if(userChoice ==2){
                    //삭제하는 메소드 호출 -> MyArray를 이용해서 boardArr 에서 board 삭제
                    boardArr = MyArray.remove(boardArr, b);

                }else if(userChoice ==3){
                    list(boardArr , memberArr);

                }
            }
            //⭐수정, 삭제는 글을 쓴 회원만 해야함!
            //그럼 회원 정보를 담당할 member 구조체를 우리가 따로 만들어야 한다.

            




            // if(userChoice == 1){
            //     System.out.println("회원이신가요? yes or no");
            //     String answer = MyScanner.nextLine();
            //     if(answer == 'yes'){





            //     }else{
            //         System.out.println("회원만 이용 가능합니다!");
                    
            //     }
                


            // }

        }
        return boardArr;
    }

	private static Member selectOne(Member[] memberArr, int id) {
		return null;
	}

}