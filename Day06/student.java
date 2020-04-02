package Day06;
//구조체 ?!

public class student{

    public static void main(String[] args) {
        //클래스의 탈을 쓴 구조체도 'new 명령어'를 통해서 메모리에 자리를 확보해줘함.
        student s = new student();
        s.name = "ake";
        s.kor = 80;
        s.eng = 81;
        s.math =81;

        System.out.println("name:" + s.name);
        System.out.println("kor:" + s.kor);
        System.out.println("en:" + s.eng);
        System.out.println("math:" + s.math);
        
    }

    public String name;
    public int kor;
    public int math;
    public int eng;

}