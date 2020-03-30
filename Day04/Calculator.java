package Day04;
//계산 메소드만 모아둔 클래스
//메인 메소드에서 객체를 만들어서 호출할 것이기 떄문에 static이 필요없음
//만약 객체를 안만들고 메소드를 호출할 것이면 static을 붙여야 함
//Double - 실수, int - 정수

public class Calculator{

    //add


    public static int add(int a, int b){

        return a + b;
       
    }
    public static double add(Double a, Double b){

        return a + b;
       
    }
    public static double add(Double a, int b){

        return a + b;
       
    }
    public static double add(int a, double b){

        return a + b;
       
    }

    //subtract

    public static int subtract(int a, int b){

        return a - b;
       
    }
    public static double subtract(double a, double b){

        return a - b;
       
    }
    public static double subtract(Double a, int b){

        return a - b;
       
    }
    public static double subtract(int a, double b){

        return a - b;
       
    }

    //multiply

    public static int multiply(int a, int b){

        return a * b;
       
    }
    public static double multiply(double a, double b){

        return a * b;
       
    }
    public static double multiply(Double a, int b){

        return a * b;
       
    }
    public static double multiply(int a, double b){

        return a * b;
       
    }

    //devide



    public static int devide(int a, int b){

        return a / b;
       
    }
    
    public static double devide(double a, double b){

        return a / b;
       
    }
    
    public static double devide(Double a, int b){

        return a / b;
       
    }
    public static double devide(int a, double b){

        return a / b;
       
    }

}