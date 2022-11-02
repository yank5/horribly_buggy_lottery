import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);


        int random = (int) (Math.random() * 99) + 1;

        String randomS = "" + random;

        System.out.println(random);

        System.out.println("Welcome to the lottery");
        System.out.print("choose a number between 1-99: ");
        String tb = ab.nextLine();
        System.out.println("The lottery number is: " + random);


        int ba = Integer.parseInt(tb);
        String newTb = tb;
        if (ba < 10) {
            newTb = "0" + tb;
        }

        boolean end = false;



        if (ba == random) {
            System.out.println("Exact match you win $100");
            end = true;
            System.exit(0);
        }


        if((newTb.substring(1, 2)+newTb.substring(0, 1)).equals(randomS)){
            System.out.println("Correct digits, but not in correct order; you win $10");
            end = true;
            System.exit(0);
        }
        if (randomS.substring(0, 1).equals(newTb.substring(0, 1)) || randomS.substring(1, 2).equals(newTb.substring(1, 2)) || randomS.substring(0, 1).equals(newTb.substring(1, 2)) || randomS.substring(1, 2).equals(newTb.substring(0, 1))) {
                System.out.println("one correct digit you win $3");
                end = true;
                System.exit(0);
        }




        if(end == false){
            System.out.println("no match no win");
        }







        }
    }