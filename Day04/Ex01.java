package Day04;
//파라미터가 다르다는것은 파라미터 갯수와 데이터타입이 다르다는것!

//오버로딩(over loading) 개념의 필요 -> 한클래스안에 비슷한 기능을 하지만 파라미터가 달라지는 경우를 위해서! 
//오버라이딩(over riding) -> 부모클래스로부터 상속받은 메소드를 자식이 다시 정의하는 것
//수도코드 -> 임의로 코딩 해본는것

public class Ex01{
    public static void main(String[] args) {
        int userNumber1 = 10;
        int userNumber2 = 22;
        //메소드를 호출할때 메소드에 선언한 그대로 적어줘야한다.
        int result = add(userNumber1,userNumber2);
        System.out.println(result);


        Double doubleResult = add(3.14, 6.02);
        System.out.println(doubleResult);


        
        //System.out.println(subtract(userNumber1, userNumber2));
        //System.out.println(result);
   
        


        
    }
    public static int add(int a, int b){

        return a + b;
       
    }
    public static double add(Double a, Double b){

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

    //add를 오버로딩 -> 파라미터만 다르게
    //메소드가 하는 역할과 어떤 필드들을 공통적으로 가지냐에 따라서 클래스를 별로 분리를 해야한다!
    //ex) add, subtract -> calculator.java라는 별도의 클래스를 만들어서  
    //필요에 따라 calculator 객체를 만들어서 그 객체의 메소드를 호출해야한다.


}


