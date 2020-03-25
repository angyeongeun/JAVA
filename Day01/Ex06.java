package Day01;
//논리 연산자
///논리 연산자는 논리형 값에 대한 연산을 한다.
// && || !


public class Ex06{
    public static void main(String[] args){


        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 && bool2); //둘다
        System.out.println(bool1 || bool2); //둘중 하나
        System.out.println(bool1 && !bool2); //true -> false, false -> true 변환


        int w1 = 1;
        int w2 = 4;

        System.out.println(w1 <5 && w2 >0 );






    }

    

}