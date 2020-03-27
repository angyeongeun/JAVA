package Day03;
//자주쓸법한 switch
//주소값 입력....



import java.util.Scanner;
public class Ex03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("adress : ");
        String address = scanner.nextLine();



        int statusCode =0;
        if(address.equals("/admin/main/1")) {
            statusCode =200;

        }else{
            statusCode =404;
        }




        switch(statusCode) {
            case 200:
                System.out.println("okay");
                break;

            case 404: 
                System.out.println("[❌ error 404] \n1. 뒤로가기 \n2. 홈");
                break;  

        }

        scanner.close();


        
    }
}
