System.out.println("--6번--");
for(int height =1; height<= num; height++){
    String stars = "";
    for(int width = 1; width <= num ; width++){
        stars += " ";
    }
    for(int width = 1; width <= 2 * height -1; width++){
        stars += "*";

    }
    System.out.println(stars);
}