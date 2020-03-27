package Day03;


import java.util.Scanner;
public class Ex06{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num : ");
        int num = scanner.nextInt();


        int result = 1;

        //15!은 int의 범위를 벗어나게 된다.
        //따라서 경고메시지가 필요함
        if(result >= 15){

            System.out.println("overFlow");

        }else{
            for(int i = 1; i <= num; i++){
                result *= i;
            }
            System.out.println(result);

        }

  




    



        
    }
}