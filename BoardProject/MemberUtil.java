package BoardProject;
// ⭐ 회원 정보와 관련된 데이터 구조체
// - 회원 번호 -> int id
// - 회원 유저 네임 ->ID -> string username
// - 회원 비밀번호 -> string password
// - 회원 닉네임 -> string nickname




public class MemberUtil{
    public static String showNickName(Member[] memberArr, int id) {
        for(int i = 0; i <memberArr.length; i++){
            if(memberArr[i].id ==id){
                return memberArr[i].nickname;
            }
        }
        return null;
    }



    
}



    