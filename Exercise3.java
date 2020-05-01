import java.util.Scanner;

public class Exercise3{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int number = 0;

    System.out.print("Enter a number: ");
        number = input.nextInt();

    if(number > 18){
        System.out.println("The number is greater than my age.");
    }if(number < 18){ 
        System.out.println("The number is less than my age.");
    }else if(number == 18)
        System.out.println("The number matches my age.");
   }
}