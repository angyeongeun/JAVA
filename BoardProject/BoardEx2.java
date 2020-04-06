package BoardProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import Util.MyArray;
import Util.MyScanner;


public class BoardEx2{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board[] boardArr = new Board[0];
        Reply[] replyArr = new Reply[0];
        
        BoardReplyWrapper wrapper = new BoardReplyWrapper();
        wrapper.boardArr =boardArr;
        wrapper.replyArr =replyArr;


        Member member = new Member();
        member.id = 1;
        member.nickname = "운영자";
        member.userName = "admin";
        member.password = "11";

        Board b = new Board();
        b.id = 1;
        b.title ="테스트 제목";
        b.content ="테스트 내용";
        b.writerId = 1;

        wrapper.boardArr = MyArray.add(boardArr, b);

        Member[] memberArr = new Member[0];
        memberArr = MyArray.add(memberArr, member);



        MemberUtil.index(scanner, memberArr, wrapper, member);
        
        scanner.close();



    }
}



