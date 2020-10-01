import java.util.Scanner;

/**
 * Finds the maximum integer between 3 numbers the user inputs
 * @author Cole girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for three numbers
    System.out.println("Please enter three integers on separate lines");
    int userNumber1 = input.nextInt();
    int userNumber2 = input.nextInt();
    int userNumber3 = input.nextInt();

    //finds the maximum out of the 3 numbers the user inputs
    if(userNumber1 >= userNumber2 && userNumber1 >= userNumber3){
      //outputs the first number input as the maximum
      System.out.println("Maximum: " + userNumber1);
    }else if(userNumber2 >= userNumber1 && userNumber2 >= userNumber3){
      //outputs the second number input as the maximum
      System.out.println("Maximum: " + userNumber2);
    }else{
      //outputs the third number input as the maximum
      System.out.println("Maximum: " + userNumber3);
    }

  }
}
