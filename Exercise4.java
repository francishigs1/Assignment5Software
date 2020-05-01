import java.util.Scanner;

public class Exercise4{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int number = 0;

    System.out.print("Enter a number from 1 to 10: ");
        number = input.nextInt();

        int counter = 1;
        if(number <= 10){
        while(counter <= 10)
            System.out.println(counter+" .Francis");
                
        }else{
                System.out.println("Invalid number entered. Please try again.");
                counter++;
                number++;
                
                
        }
    }
}
