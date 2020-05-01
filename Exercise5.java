public class Exercise5{
  public static void main(String[] args){

    int sum = 0;
    int product = 0;
    int average = 0;
    int[] x = {20, 30, 40, 50};

   for(int counter = 0; counter < x.length; counter++){
	   sum = sum +  x[counter];
  	}
      System.out.println("Sum of the array values: "+sum);

    for(int counter = 0; counter < x.length; counter++){
	   product = x[counter] * x[counter];
  	}
      System.out.println("Product of the array values: "+product);
      
    for(int counter = 0; counter < x.length; counter++){
	   average = x[counter] + x[counter] / 5;
  	}
  	System.out.println("Average of the array values: "+average);  
        }
    }
