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
    public static void list(BoardReplyWrapper wrapper, Member[] memberArr) {

       
        //게시판 최신글은 제일위에 온다.
        //for문의 i는 무엇으로 초기화 해야하는가?
        for(int i = wrapper.boardArr.length -1 ; i>=0; i--){
            Board b = wrapper.boardArr[i];
            int count = ReplyUtil.countReply(b.id, wrapper.replyArr);
            String message = b.id + " " + b.title + " ";
            if(count!=0){
                message += "[" + count + "]";


            } 
            message += MemberUtil.showNickName(memberArr, b.writerId) + " " + b.writtenDate;

            System.out.println(b.id +
            " " + b.title +
            " " + MemberUtil.showNickName(memberArr, b.writerId ) + 
            " " + b.writtenDate
            );
        }
    }

    public static Board[] write( Scanner scanner, Member[] memberArr,Member member, BoardReplyWrapper wrapper) {
        

        Board b = new Board();
        //이 메소드는 boardArr 의 길이가 유동적이기 떄문에 boardArr길이가 0이 아니면 가장 마지막 요소를 찾아서 그 요소의 id번호를 가지고 올 수 있다.
        //글 번호
        b.id = 1;
        if(wrapper.boardArr.length != 0){
            //배열의 가장 마지막 요소의 index -> length -1
            //그럼 해당 위치에 있는 board의 구조체의 id+1 한 값이 우리의 입력할 id가 된다.
            b.id = wrapper.boardArr[wrapper.boardArr.length -1].id +1;
        }

        System.out.print("제목 : ");
        b.title =scanner.nextLine();
        System.out.print("내용 : ");
        b.content =scanner.nextLine();
        b.writerId = member.id;

        Calendar c = Calendar.getInstance();

        SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss");
        b.writtenDate =sdf.format(c.getTime());
        //위 주석을 제외한 세줄의 실제코드는 실무에서 많이 쓰임

        wrapper.boardArr = MyArray.add(wrapper.boardArr, b); 




      
        return wrapper.boardArr;
        
    }

    //사용자가 int와 board 배열을 주면 해당 board배열에서 id가 int와 일피하는 board변수를 리턴하는 메소드
    


    public static Member selectOne(Member[] memberArr, int id) {

        for (int i = 0; i < memberArr.length; i++ ){
            if (memberArr[i].id == id ){
                return memberArr[i];


            }
        }
        return null;
    }

    public static Board selectOne(Board[] boardArr, int id) {

        for (int i = 0; i < boardArr.length; i++ ){
            if (boardArr[i].id == id ){
                return boardArr[i];


            }
        }
        return null;
    }




    public static Board[] showOne(BoardReplyWrapper wrapper, Scanner scanner, Member[] memberArr , Member member ){
        System.out.print("개별보기 할 글번호 입력 : ");
        int id = MyScanner.nextInt(scanner);
        Member m = selectOne(memberArr, id);
        Board b = selectOne(wrapper.boardArr, id);
        int boardId = b.id;//💥
        if(b == null){
            System.out.println("doesn't exist!");
        }else{

            System.out.println("제목 : " + b.title);
            System.out.println("작성자 : " 
                                + MemberUtil.showNickName(memberArr, b.writerId));
            System.out.println("작성일 : " + b.writtenDate);
            System.out.println("내용 : " + b.content);
            System.out.println("====================================================");
            ReplyUtil.list(wrapper.replyArr, boardId, memberArr);
     

            if(m.id == b.writerId){

                System.out.println("1. 수정 2. 삭제 3. 뒤로");
                int userChoice = MyScanner.nextInt(scanner);

                if(userChoice ==1){
                    //수정하는 메소드 호출 -> scanner, boardARR, board를 보내서 수정한 것을 해당 위치와 교체한다


                    System.out.println("---------------글 수정------------------");
                    System.out.print("title : ");
                    b.title = scanner.nextLine();
                    System.out.print("content : ");
                    b.content = scanner.nextLine();

                    //이 b가 위치한 index를 찾는다


                    int index = MyArray.indexOf(wrapper.boardArr, b);
                    wrapper.boardArr[index] = b;
                    
                }else if(userChoice ==2){
                     //삭제하는 메소드 호출 -> MyArray를 이용해서 boardArr 에서 board 삭제
                
                   
                    wrapper.boardArr = MyArray.remove(wrapper.boardArr, b);

                }else if(userChoice ==3){
                    //삭제하는 메소드 호출 -> MyArray를 이용해서 boardArr 에서 board 삭제
                    list(wrapper, memberArr);

                }
            } else{
                System.out.println("1. 댓글 달기 2. 댓글 수정 3. 댓글 삭제 4. 뒤로");
                System.out.print("> ");
                int userChoice = MyScanner.nextInt(scanner);
                if (userChoice ==1){
                    Reply r = new Reply();
                    r.memberId = member.id;
                    r.boardId = b.id;
                    System.out.print("댓글 내용 입력 : ");
                    r.content =scanner.nextLine();
                    wrapper.replyArr = ReplyUtil.insert(wrapper.replyArr, r);
                    showOne(wrapper, scanner, memberArr, member);
                    
                }else if(userChoice ==2){
                    //댓글 수정
                    System.out.print("수정할 댓글의 번호를 입력해주세요 : ");
                    Reply r = new Reply();
                    r.id = MyScanner.nextInt(scanner);
                    int index = MyArray.indexOf(wrapper.replyArr, r);
                    if(index != -1){
                        //해당 글을 쓴 사람과 로그인 한 유저가 동일인물인지 확인
                        r = wrapper.replyArr[index];
                        if(r.memberId == member.id){

                            System.out.print("content : ");
                            r.content = scanner.nextLine();
                            wrapper.replyArr[index] = r;

                        }else{
                            System.out.println("you don't have a right to replace!!");
                        }

                    }else{
                        System.out.println("존재하지 않는 번호");

                    }

                }else if(userChoice ==3){
                    //댓글 삭제하는 메소드 실행
                    //먼저 댓글의 id를 선택하고 해당 댓글을 쓴 사람이 로그인 했는지 체크하고 둘다 가능한거면 삭제

                    System.out.print("삭제할 댓글의 번호를 입력해 주세요 : ");
                    Reply r = new Reply();
                    r.id = MyScanner.nextInt(scanner);
                    int replyId = MyScanner.nextInt(scanner);
                    if(MyArray.indexOf(wrapper.replyArr, r) != -1){
                        r = wrapper.replyArr[MyArray.indexOf(wrapper.replyArr, r)];
                        if(r.memberId == member.id){
                            //마지막으로 한번더 물어보기(삭제)
                            System.out.print("정말로 삭제하시겠습니까?(y/n)");
                            String agree = scanner.nextLine();
                            if(agree.equalsIgnoreCase("y")){
                                wrapper.replyArr = ReplyUtil.delete(wrapper.replyArr, r);
                                System.out.println("댓글이 삭제되었습니다.");
                            }
                        }else{
                            System.out.println("권한이 없습니다!");
                        }


                    }else{
                        System.out.println("없는 댓글 번호!");

                    }
                    
         


                }else if(userChoice ==4){
                    list(wrapper, memberArr);
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
        return wrapper.boardArr;
    }





}