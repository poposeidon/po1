import java.util.Scanner;

public class dice{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name?");
    String string = scanner.next();
    System.out.println("Hello," + string + "!");

    int SIDES = 6;
    System.out.println("Rolling the dice...");
    int a = 1 + (int) (Math.random() * SIDES);
    System.out.println("dice 1 : " + a);
    int b = 1 + (int) (Math.random() * SIDES);
    System.out.println("dice 2 : " + b);
    int sum = a + b;
    System.out.println("Total value : " + sum);

    if(sum > 7){
      System.out.println(string + " won!");
    }else{
      System.out.println(string + " lost!");
    }

  }
}
