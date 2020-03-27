package Day03;
//method -> c에서는 function
//method의 선언
//접근제한자: acess modifier -> 메소드 혹은 필드가 어디서 접근이 가능한 범위를 적어준다.
//static -> 해당 메소드를 다른 메소드에 등록 returnType name
//parameter -> 메소드가 호출된떄 외부에서 보내주는 값으로써 datatype name 으로 이뤄져 있다.

//return type : 해당 메소드가 끝나고 호출된 곳으로 보내줄 값의 datatype -> 만약 메소드가 아무런 값도 호출된곳으로 안보낸다면 void
//public > protected > default > private

//public -> 패키지 외부, 내부, 다른 클래스 어디서든 호출 가능
//protected -> 같은 패키지와 상속받는 자식 클래스들은 호출 가능
//default -> 같은 패키지 내부에서만 호출 가능(만약 아무것도 안적으면 자동으로 디폴트가 호출됨)
//private -> 같은 클래스만 접근가능


//괄호가 붙어있으면 무조건 메소드

public class Ex16{
    public static void main(String[] args) {
        int userNumber1 = 10;
        int userNumber2 = 22;
        //메소드를 호출할때 메소드에 선언한 그대로 적어줘야한다.
        int result = add(userNumber1,userNumber2);
        System.out.println(result);
 
        System.out.println(subtract(userNumber1, userNumber2));
        //System.out.println(result);
        


        
    }
    public static int add(int a, int b){

        return a + b;
       
    }

    public static int subtract(int a, int b){

        return a - b;
       
    }

    public static int multiply(int a, int b){

        return a * b;
       
    }
    public static int devide(int a, int b){

        return a / b;
       
    }
    public static boolean validate(int score){
        if(score > 100 || score < 0){
            return true;
        }
        //return은 곧장 메소드가 종료되게 만듦!
        return false;
    }// -> while(Ex16.validate(korean))으로 다른곳에서 쓸 수있다

}


