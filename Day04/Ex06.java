package Day04;
//NestedArray -> 2차원 배열 ->똑같은 데이터타입의 배열이 모여있는것 -> 배열안의 배열
//이중 for문 사용


public class Ex06{
    public static void main(String[] args) {
        int[][] nestedArray = new int[2][4];

        System.out.println(nestedArray[0]);

        //[][][][] -> nestedArray[0]
        //[][][][] -> nestedArray[1]
            
        //즉 nestedArray[0]은 int[4]가 나오게 된다.

        for(int i =0; i < nestedArray.length; i++){
            for(int j =0; j< nestedArray[i].length; j++)
            System.out.println("nestedArray["+i+"]" + "["+j+"]" + nestedArray[i][j]);
        }

        
    }





}