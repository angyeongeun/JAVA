package CoronaProject;
import java.util.Scanner;




public class CoronaEx{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nation[]world = null;

        while(true){
            //메뉴를 출력한다
            //1. 세게현황 보기
            //2. 한국 현황보기
            //3. 종료

            System.out.println("---------CORONA-19------------");
            System.out.println("1. 세계 2. 한국 3. 종료");
            System.out.print(">");
            int choice = scanner.nextInt();
            if( choice ==1){
                //세계 현황 보여주는 메소드 실행
                

            }else if (choice ==2){
                // 한국 현황 보여주는 메소드 실행

            }else if(choice ==3){
                // 종료하기
                System.out.println("Thank you for using!");
                break;
            }



        }
    

        scanner.close();
        
    }

}