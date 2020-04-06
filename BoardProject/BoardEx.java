package BoardProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import Util.MyArray;
import Util.MyScanner;


public class BoardEx{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board[] boardArr = new Board[5];
        Member member = new Member();
        member.id = 1;
        member.nickname = "운영자";

        Member[] memberArr = new Member[0];
        memberArr = MyArray.add(memberArr, member);

        for(int i =0; i< boardArr.length; i++){
            boardArr[i] = new Board();
        }


        while(true){
            System.out.println("---------Board----------");
            System.out.println("1. 글 목록 2. 새로 작성 3. 종료");
            System.out.print(">");
            int userChoice = MyScanner.nextInt(scanner);
            if(userChoice ==1){
                System.out.print("볼 글 :");
                userChoice = MyScanner.nextInt(scanner);




                for(int i = 0; i < boardArr.length; i++ ){
                    System.out.println("제목" + boardArr[i].title);
                    System.out.println("   내용" + boardArr[i].content);


                }
                BoardUtil.list(boardArr , memberArr);
                //위의 코드를 여기에 직접넣지 말고 배열을 주면 거기서 출력해주는 메소드로 분리를 해보자
                System.out.println("1. 글선택 2. 뒤로");
                System.out.print(">");
                userChoice = MyScanner.nextInt(scanner);
                if(userChoice ==1){
                    BoardUtil.list(boardArr ,memberArr);
                    if(boardArr.length > 0){
                        System.out.println("1. 글 개별보기 2. 뒤로가기");
                        System.out.println("> ");
                        userChoice = MyScanner.nextInt(scanner);
                        if(userChoice ==1){
                            BoardUtil.showOne(boardArr, scanner, memberArr);
                        }else if(userChoice == 2){
                        BoardUtil.write(boardArr, scanner, memberArr);

                        }else if(userChoice ==3){
                        System.out.println("thank u for using!!!");
                    }
                //먼저 해당하는 번호가 우리배열의 각요소들의 id로 존재하는지 체크하고 존재하면 
                //해당 글 보기로 이동 - 없으면 없는글이라고 해줘야.

                //글 벙보를 불러올 board 구조체 변수 b
                //초기화는 null로 해서 만약 불러오기를 못한다면( 글 번호가 존재하짖 않는다면)
                //null인지 체크해서 글 보여주기 or 존재하지 않는 글 번호를 보여준다

                Board b = null;
                for(int i = 0; i< boardArr.length; i++){
                    if(boardArr[i].id == userChoice){
                        b =boardArr[i];
                    }
                }
                if(b == null){
                    System.out.println("doesn't exist!!");
                }else{
                    System.out.println("제목 :" + b.title);
                    System.out.println("작성자 :" + b.writerId);
                    System.out.println("작성일 :" + b.writtenDate);
                    System.out.println("내용 :" + b.content);
                    System.out.println("1. 수정 2. 삭제 3. 뒤로");
                    userChoice =scanner.nextInt();
                }
            }
        }
       
                
            }else if(userChoice ==2){
                //글 제목과 내용 밖에 없다
                
                Board b = new Board();
                //글 번호
                b.id = 1;

                int index =1;
                //for문을 이용해서 boardarr 중에서 작성일이 널이 아닌곳의 위치를 찾아서 그 글의 id+1을 우리의 index에 넣고
                //index를 b.id에 넣는다
                //만약 작성일이 널이 아닌곳을 못찾는다 = 쓰여진 글이 하나도 없다는 의미이므로 index는 그대로 1이 될테니깐 문제가 없다
                for(int i = boardArr.length -1; i >=0; i--){
                    if(boardArr[i].writtenDate != null) {
                        index = boardArr[i].id +1;
                        break;


                    }
                }
                b.id = index;

                System.out.print("제목 : ");
                b.title =scanner.nextLine();
                System.out.print("내용 : ");
                b.content =scanner.nextLine();
                b.writerId = 1;

                Calendar c = Calendar.getInstance();
                //위 코드는 현재 시간을 c에 저장함
                //c에 저장된 시간을 우리가 원하는 현식의 string으로 바꿔주는 
                //SimpleDteFormat 이라는 클래스를 이용해서 시간을 STRING으로 바꿔준다
                
                SimpleDateFormat sdf = 
                new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss");
                b.writtenDate =sdf.format(c.getTime());
                //위 주석을 제외한 세줄의 실제코드는 실무에서 많이 쓰임


                for(int i = 0; i < boardArr.length; i++){
                    if(boardArr[i].writtenDate == null){
                        boardArr[i] = b;
                        break;

                    } 

                }



            }else if(userChoice ==3){
                System.out.println("Thank U for using");
                break;

            }
        }
        
    }
    }
