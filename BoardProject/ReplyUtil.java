package BoardProject;
//Reply
// ⭐ 댓글과 관련된 데이터 구조체 -> 
// - 댓글 번호 -> int 글 번호처럼 자동으로 1씩 올라간다! int id
// - 글 번호 -> 이댓글이 어느글에 붙어있나
// 제목, 내용, 글쓴이 같이 중복이 가능한 곳과 댓글을 연결시킨다면?
// 내가 댓글을 달지 않은 글에도 자동으로 같이 달리거나 내가 단 댓글이 다른곳에 적힐 수도 있다. -> 고유값이 필요함 int boardId
// - 회원 번호 -> int memberId
// - 댓글의 내용 -> string content

import Util.MyArray;


public class ReplyUtil{
   
   
   
    //해당 게시글의 댓글을 보여주는 메소드
    public static void list(Reply[] arr, int boardId, Member[] memberArr){
        for(Reply r: arr){
            if(r.boardId ==boardId){
                System.out.println(r.id + " " + r.content + " " + MemberUtil.showNickName(memberArr, r.memberId));
            }
        }
    }
    public static Reply[] insert(Reply[] arr, Reply r){
        r.id = arr.length > 0 ? arr[arr.length -1].id +1 :1 ;
        //위의 선언과 같음 if(arr.length > 0){
        //     r.id = arr[arr.length -1].id +1;
        // }
        arr =MyArray.add(arr, r);
        return arr;
    }

    public static Reply[] delete(Reply[] arr, Reply r){
        arr = MyArray.remove(arr, r);
        return arr;
    }

    
    public static int countReply(int boardId, Reply[] replyArr){
        int count = 0;
        for(Reply r:replyArr){
            if(r.boardId == boardId){
                count++;
            }
        }
        return count;

    }








}