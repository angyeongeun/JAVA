package Day03;
//소수란 1과 자기자신 외에는 약수가 없는숫자

public class Ex09{
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            int count =0;
            for(int j = 1; j <= i; j++ ){
                if(i % j == 0) {
                    count++;
                }
            }

            if (count==2){
                System.out.println(i + "  is prime number!");
            }

        }
        
    }
}