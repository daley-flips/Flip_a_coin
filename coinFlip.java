import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;
public class coinFlip{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        ArrayList<String> coin = new ArrayList<String>();
        coin.add("heads");
        coin.add("tails");
        System.out.println("heads or tails");
        String userChoice = input.nextLine();
        System.out.println("How many heads/ tails in a row would you like?");
        int userNumber = input.nextInt();
        int x = 0;
        int countNumTrials = 0;
        System.out.println("How many trials of the simulation do you want?");
        int userTrials = input.nextInt();
        int y = 0;
        int countTotal = 0;
        ArrayList<Integer> findMedian = new ArrayList<Integer>();
        while(y< userTrials){
            while(x < userNumber){
                Collections.shuffle(coin);
                if(coin.get(0).equals(userChoice)){
                    x++;
                }
                else{
                    x=0;
                }
                countNumTrials++;
                }
            int y1 = y+1;
            System.out.println("It took " + countNumTrials + " flips in trial #" + y1);
            findMedian.add(countNumTrials);
            countTotal += countNumTrials;
            countNumTrials = 0;
            x = 0;
            y++;
        }
        System.out.println();
        System.out.println("On average, it took " + countTotal/userTrials + " flips");
        Collections.sort(findMedian);
        int median = findMedian.get(userTrials/2);
        System.out.println("The median value is " + median + " flips");
        System.out.println("The least numer of flips was " + findMedian.get(0) + " flips");
        System.out.println("The most numer of flips was " + findMedian.get(userTrials-1) + " flips");
    }//end main method
}//end coinFlip