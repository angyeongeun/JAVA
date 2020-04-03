package CoronaProject;


import java.text.DecimalFormat;
import java.util.Scanner;
import CoronaProject.Nation;
import Util.MyArray;
import Util.MyScanner;

public class NationUtil{
    //Nation[] start(Nation[] world)라는 메소드를 만들어서 그 안에 웹사이트 값을..



    public static Nation[] start(Scanner scanner) {
        System.out.print("입력할 국가의 수 : ");
        int size = MyScanner.nextInt(scanner);
        Nation[] world = new Nation[size];

        for(int i = 0; i< world.length; i++){
            world[i] = new Nation();

        }

       
        world[0].name = "미국";
        world[0].confirmed = 214836;
        world[0].death =5099;
        world[0].cured = 8878;
        world[0].population = 331002651;
  

        for(int i =1; i < world.length; i++){
  
            System.out.print("nation name : ");
            world[i].name = scanner.nextLine();
            System.out.print("confirmed number : ");
            world[i].confirmed = scanner.nextInt();
            System.out.print("death number : ");
            world[i].death = scanner.nextInt();
            System.out.print("cured number : ");
            world[i].cured = scanner.nextInt();
            System.out.print("population  : ");
            world[i].population = scanner.nextInt();
     

        }


        return world;
    }


    
    public static void print(Nation[] world) {

        System.out.println("---------------------");
        for(int i = 0; i < world.length; i++){
            System.out.print((i+1));
            System.out.print("\t"+world[i].name);
            System.out.print("\t"+world[i].confirmed);
            System.out.print("\t"+world[i].cured);
            System.out.print("\t"+world[i].death);
            System.out.print("\t"+ showStat(world[i]));
            System.out.println("\t"+world[i].population);

        }

        System.out.println("---------------------");        
    }



    public static String showStat(Nation n){
        //여기서 사망율, 완치율, 인구당 발생율을 각각 계산한 다음 한개의 스트링으로 묶어주자!

        //사망률 : 사망자 수 / 총 확진자 수 -> 결과값은 double
        //완치율 :  완치자 수/ 총 확진자 수 -> 결과값은 double
        //인구당 발생율 : 총확진자 수 /총 인구 * 1000000 -> 결과값은 int
        //근데 100만명 인구당 바랫ㅇ율 -> 총 확진자 수 / 총인구 하면
        //0이 나올거고 0* 1000000? 0
        // 따라서 총 확진자 수 * 1000000 / 총인구로 한다

        double deathRate = (double)n.death / n.confirmed * 100;
        double cureRate = (double)n.cured / n.confirmed * 100;

        int ppp = (int)(((double)n.confirmed / n.population) * 1000000);
   
        String result = 
        "\t" + new DecimalFormat("##.##").format(deathRate) + "%\t" +new DecimalFormat("##.##").format(cureRate) + "%\t" + ppp;

        return result;



    }



    public static Nation[] update(Nation[] world, int index, Scanner scanner){
        
        Nation n = new Nation();
        System.out.print("nation name : ");
        n.name = scanner.nextLine();
        System.out.print("confirmed number : ");
        n.confirmed = scanner.nextInt();
        System.out.print("death number : ");
        n.death = scanner.nextInt();
        System.out.print("cured number : ");
        n.cured = scanner.nextInt();
        System.out.print("population  : ");
        n.population = scanner.nextInt();


        world[index] = n;
        
        
        
        
        return world;
    }



        



        



        



















}
