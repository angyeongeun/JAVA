package CoronaProject;


import java.util.Scanner;
import CoronaProject.Nation;
import Util.MyArray;
import Util.MyScanner;

public class NationStarter{
    //Nation[] start(Nation[] world)라는 메소드를 만들어서 그 안에 웹사이트 값을..



    public static Nation[] start(Scanner scanner) {
        System.out.print("입력할 국가의 수 : ");
        int size = MyScanner.nextInt(scanner);
        Nation[] world = new Nation[size];

        for(int i = 0; i< world.length; i++){
            world[i] = new Nation();

        }

        Nation n1 = new Nation();
        n1.name = "미국";
        n1.confirmed = 214836;
        n1.death =5099;
        n1.cured = 8878;
        n1.population = 331002651;
        world[0] = n1;

        for(int i =1; i < world.length; i++){
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
            world[i] = n;

        }



        // Nation n3 = new Nation();
        // Nation n4 = new Nation();
        // Nation n5 = new Nation();
        // Nation n6 = new Nation();
        // Nation n7 = new Nation();
        // Nation n8 = new Nation();
        // Nation n9 = new Nation();
        // Nation n10 = new Nation();


        return world;
    }



        



        



        



















}
