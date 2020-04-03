package CoronaProject;


import CoronaProject.CoronaEx;
import java.text.DecimalFormat;
import java.util.Scanner;
import Util.MyScanner;;

public class cityUtil{
    public static City[] start(Scanner scanner){
        City[] cities;
        System.out.print("city number : ");
        int size = MyScanner.nextInt(scanner);
        cities = new City[size];
        for(int i =0; i < cities.length; i++){
            City c = new City();
            System.out.print("지역명 : ");
            c.area = scanner.nextLine();
            System.out.print("확진자 수 : ");
            c.confirmed = MyScanner.nextInt(scanner);
            System.out.print("사망자 : ");
            c.death = MyScanner.nextInt(scanner);
            System.out.print("격리해제 수 : ");
            c.cleared = MyScanner.nextInt(scanner);
            System.out.print("지역인구 수 : ");
            c.population = MyScanner.nextInt(scanner);
            cities[i] = c;
        }



        return cities;
    }
    public static void print(City[] cities) {

        System.out.println("---------------------");
        for(int i = 0; i < cities.length; i++){
            System.out.print((i+1));
            System.out.print("\t"+cities[i].area);
            System.out.print("\t"+cities[i].confirmed);
            System.out.print("\t"+cities[i].cleared);
            System.out.print("\t"+cities[i].death);
            System.out.print("\t"+ showStat(cities[i]));
            System.out.println("\t"+cities[i].population);

        }

        System.out.println("---------------------");        
    }


    public static String showStat(City c){

        double deathRate = (double)c.death / c.confirmed * 100;
        double cureRate = (double)c.cleared / c.confirmed * 100;

        int ppp = (int)(((double)c.confirmed / c.population) * 1000000);
   
        String result = 
        "\t" + new DecimalFormat("##.##").format(deathRate) + "%\t" +new DecimalFormat("##.##").format(cureRate) + "%\t" + ppp;

        return result;



    }

    public static City[] update(int index, Scanner scanner, City[] cities){

        City c = new City();
        System.out.print("지역명 : ");
        c.area = scanner.nextLine();
        System.out.print("확진자 수 : ");
        c.confirmed = MyScanner.nextInt(scanner);
        System.out.print("사망자 : ");
        c.death = MyScanner.nextInt(scanner);
        System.out.print("격리해제 수 : ");
        c.cleared = MyScanner.nextInt(scanner);
        System.out.print("지역인구 수 : ");
        c.population = MyScanner.nextInt(scanner);
        cities[index] = c;
        
        return cities;
    }

    public static City[] addData(Scanner scanner, City[] cities){
        if(cities == null){
            cities = start(scanner);
        }else{
            System.out.println("1. 전체 다시 입력 2. 개별 수정");
            int choice = MyScanner.nextInt(scanner);
            switch(choice){
                case 1:
                cities = start(scanner);
                break;
                case 2:
                print(cities);
                int index = 
                    CoronaEx.validateIndex(scanner, cities.length);
                    cities = update(index, scanner, cities);
     
                break;
            }
        }
        return cities;
    }





}