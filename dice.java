public class dice{
  public static void main(String[] args){

    int SIDES = 6;
    System.out.println("Rolling the dice...");
    int a = 1 + (int) (Math.random() * SIDES);
    System.out.println("dice 1 : " + a);
    int b = 1 + (int) (Math.random() * SIDES);
    System.out.println("dice 2 : " + b);
    int sum = a + b;
    System.out.println("Total value : " + sum);
  }
}
